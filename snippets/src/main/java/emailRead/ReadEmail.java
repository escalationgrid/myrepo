package emailRead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import emailSend.CEFMessageByEmail;

public class ReadEmail {

	public List<String> readEmails() {

		List<String> cefMessages = new ArrayList<String>();
		String cefMessage;
		
		// IMAP automatically marks the emails as read when they are retrieved! NÃO FOI O QUE ACONTECEU...
		// IMAP synchronizes, POP3 no! ?
		boolean pop3 = true; 

		// POP3 Properties
		final String mail_pop3_host = "pop.gmail.com";
		final String mail_store_type_pop3 = "pop3";
		final String mail_pop3_port = "995";
		final String mail_pop3_starttls_enable = "true";
		final String mail_pop3_socketFactory_class = "javax.net.ssl.SSLSocketFactory";
		
		//IMAP Properties
		final String mail_smtp_host = "smtp.gmail.com";
		final String mail_smtp_socketFactory_port = "465";
		final String mail_smtp_socketFactory_class = "javax.net.ssl.SSLSocketFactory";
		final String mail_smtp_auth = "true";
		final String mail_smtp_port = "465";
		final String mail_store_type_imap = "imaps";
		
		final String username = "escalationgrid.lab@gmail.com";
		final String password = "escalation123";
		
		final String SUBJECT_CEF = "\"CEF Event\"";  //  'CEF'   FORMAT EMAIL
		final String SUBJECT_CYCLE = "Chamado";      //  'CYCLE' FORMAT EMAIL
		boolean CEF_EMAIL = false;
		boolean CYCLE_EMAIL = false;

		Store store =null;
		Session emailSession= null;
		
		try {
			Properties properties = new Properties();
			
			if (pop3) {
				// POP3
				properties.put("mail.pop3.host", mail_pop3_host);
				properties.put("mail.pop3.port", mail_pop3_port);
				properties.put("mail.pop3.starttls.enable", mail_pop3_starttls_enable);
				properties.put("mail.pop3.socketFactory.class" , mail_pop3_socketFactory_class );
				emailSession = Session.getDefaultInstance(properties);
				store = emailSession.getStore(mail_store_type_pop3);
				store.connect(mail_pop3_host, username, password);
			}else { 
				// IMAP
				properties.put("mail.smtp.host", mail_smtp_host);
				properties.put("mail.smtp.socketFactory.port", mail_smtp_socketFactory_port);
				properties.put("mail.smtp.socketFactory.class", mail_smtp_socketFactory_class);
				properties.put("mail.smtp.auth" , mail_smtp_auth );
				properties.put("mail.smtp.port" , mail_smtp_port );
				emailSession = Session.getDefaultInstance(properties, null);
				
				store = emailSession.getStore(mail_store_type_imap);
				store.connect(mail_smtp_host, username, password);
			}
			
			Folder inbox = store.getFolder("inbox");
			inbox.open(Folder.READ_ONLY);
			Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false)); // read only UNSEEN messages
			
			System.out.println("Receiving Events by email from: " + username);
			System.out.println("Total fetched messages (CEF and non-CEF): " + messages.length);

			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				
				// Read emails in the formats:  "CEF", "CYCLE" (The subject of the email is the key)
				CEF_EMAIL = (message.getSubject().equals(SUBJECT_CEF)) ? true : false;
				CYCLE_EMAIL = (message.getSubject().startsWith(SUBJECT_CYCLE)) ? true : false;
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Email Number " + (i + 1) + " --> Type: " + ((CEF_EMAIL) ? "*CEF Email*" : "") + ((CYCLE_EMAIL) ? "*CYCLE Email*" : ""));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
							         
		        String messageBody = "";
				
				if (CEF_EMAIL){ ///////////  CEF EMAIL
					
		        	if (pop3) {
		        		// POP3
/*		        		 Object obj = message.getContent();
		        		 Multipart mp = (Multipart)obj;
		        		 BodyPart bp = mp.getBodyPart(0);
		        		 messageBody = bp.getContent().toString();*/
		        		 messageBody = ((Multipart)message.getContent()).getBodyPart(0).getContent().toString();
		        	} else {
		        		// IMAP
/*		        		 Object obj = message.getContent();
		        		 Multipart mp = (Multipart)obj;
		        		 BodyPart bp = mp.getBodyPart(0);
		        		 messageBody = bp.getContent().toString();*/
		        		// messageBody = message.getContent().toString();
		        		 //messageBody = (String) message.getContent();   ///// ????? VERIFICAR IMAP ACCESS !!!!!
		        		Object emailContent = message.getContent();
		        		if (emailContent instanceof Multipart) {
		        			
		        			//Multipart mp = (Multipart)emailContent;
			        		//BodyPart bp = mp.getBodyPart(0);
			        		//messageBody = bp.getContent().toString();
			        		
			        		messageBody = ((Multipart)emailContent).getBodyPart(0).getContent().toString();
			        		
		        			readAndDiscardMultipart((Multipart)emailContent);
		        		}else {
		        			messageBody = (String)emailContent;
		        		}
		        	}
		        	
		        	System.out.println("CEF Email body: " + messageBody  );
		        	cefMessages.add(buildCEFMessageFromCEFEmail(messageBody));
				}
				else 
				if (CYCLE_EMAIL){   //////////  CYCLE EMAIL
		        	 
		        	if (pop3) {
		        		// POP3
/*		        		 Object obj = message.getContent();
		        		 Multipart mp = (Multipart)obj;
		        		 BodyPart bp = mp.getBodyPart(0);
		        		 messageBody = bp.getContent().toString();
		        		 messageBody = message.getContent().toString();*/
		        		
		        		 //messageBody = ((Multipart)message.getContent()).getBodyPart(0).getContent().toString();
		        		 
		        		 messageBody = (String)message.getContent();
		        	} else {
		        		// IMAP
		        		 messageBody = message.getContent().toString();
		        	}
		        	  
		        	System.out.println("CYCLE Email body: " + messageBody  );
		        	cefMessages.add(buildCEFMessageFromCYCLEEmail(messageBody));
				}
		        System.out.println("---------------------------------------------------------------------");
			}

			inbox.close(false);
			store.close();

		} catch (MessagingException e) {
			System.err.println("ReadEmailServiceImpl: Error 'MessagingException'");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("ReadEmailServiceImpl: Error 'Exception'");
			e.printStackTrace();
		}
		return cefMessages;
	}
	
	private void readAndDiscardMultipart(Multipart mp) 
		    throws MessagingException, IOException {
		  for (int i=0; i<mp.getCount(); i++) {
		    BodyPart bodyPart = mp.getBodyPart(i);
		    Object content = bodyPart.getContent();
		    if (content instanceof Multipart) {
		      readAndDiscardMultipart((Multipart)content);
		    }
		  }
		}

	private String buildCEFMessageFromCEFEmail(String emailBody) {
		
		ObjectMapper mapper = new ObjectMapper();
		CEFMessageByEmail cEFMessageFromEmail =  null;
		String cefMessage = "";
		try {
			cEFMessageFromEmail =  mapper.readValue(emailBody, CEFMessageByEmail.class); // string to json
			cefMessage = mapper.writeValueAsString(cEFMessageFromEmail);                   // json to string (cefmessage format)
		} catch (JsonParseException e) {
			System.err.println("ReadEmailServiceImpl: Error 'ExcepJsonParseExceptiontion'");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.err.println("ReadEmailServiceImpl: Error 'JsonMappingException'");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("ReadEmailServiceImpl: Error 'IOException'");
			e.printStackTrace();
		}
		String alertId = cEFMessageFromEmail.getAlertId();
		String cefTimestamp = "Jan 24 2018 15:00:00";     // <=========================================== temp
		String cefHost = cEFMessageFromEmail.getCefHost();
		String cefVersion = cEFMessageFromEmail.getCefVersion();
		String cefDVendor = cEFMessageFromEmail.getCefDVendor();
		String cefDProduct = cEFMessageFromEmail.getCefDProduct();
		String cefDVersion = cEFMessageFromEmail.getCefDVersion();
		String cefName = cEFMessageFromEmail.getCefName();
		String cefSeverity  = cEFMessageFromEmail.getCefSeverity();
		String cefExtension = cEFMessageFromEmail.getCefExtension();
		
		cefMessage = cefTimestamp +
							" " + cefHost + " CEF:" + cefVersion + "|" +
							cefDVendor + "|" +
							cefDProduct + "|" +
							cefDVersion + "|" +
							alertId + "|" +
							cefName + "|" +
							cefSeverity + "|" +
							cefExtension;
		
		System.err.println("ReadEmailServiceImpl: CEF MESSAGE: '" + cefMessage + "'");
		return cefMessage;
	}
	
	private String buildCEFMessageFromCYCLEEmail(String emailBody) {
		
		
		return null;
	}
}
