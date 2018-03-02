package emailRead;


import javax.mail.*;

import java.io.IOException;
import java.util.Properties;

public class ReadEmail2 {
	
    public static final String USERNAME = "escalationgrid.lab@gmail.com";
    public static final String PASSWORD = "escalation123";

    public static void main(String[] args) throws Exception {
    	
    	final String SUBJECT_CEF = "\"CEF Event\"";  //  'CEF'   FORMAT EMAIL
    	final String SUBJECT_CYCLE = "Chamado";      //  'CYCLE' FORMAT EMAIL
       
        Properties props = new Properties();
        props.put("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.pop3.socketFactory.fallback", "false");
        props.put("mail.pop3.socketFactory.port", "995");
        props.put("mail.pop3.port", "995");
        props.put("mail.pop3.host", "pop.gmail.com");
        props.put("mail.pop3.user", ReadEmail2.USERNAME);
        props.put("mail.store.protocol", "pop3");

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(ReadEmail2.USERNAME, ReadEmail2.PASSWORD);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);
        Store store = session.getStore("pop3");
        store.connect("pop.gmail.com", ReadEmail2.USERNAME, ReadEmail2.PASSWORD);
        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);
        boolean CEF_EMAIL =  false;
        boolean CYCLE_EMAIL = false;
        String messageBody = "";

        Message[] messages = inbox.getMessages();
		System.out.println("Total fetched messages (CEF and non-CEF): " + messages.length);
        for (Message message : messages) {
        	
			// Read emails in the formats:  "CEF", "CYCLE" (The subject of the email is the key)
			CEF_EMAIL = (message.getSubject().equals(SUBJECT_CEF)) ? true : false;
			CYCLE_EMAIL = (message.getSubject().startsWith(SUBJECT_CYCLE)) ? true : false;
        	
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Subject: " + message.getSubject());
			System.out.println("From   : " + message.getFrom()[0]);
			System.out.println("Type   : " + ((CEF_EMAIL) ? "*CEF Email*" : "") + ((CYCLE_EMAIL) ? "*CYCLE Email*" : ""));
            //message.writeTo(System.out);
               //System.out.println("Content: " + message.getContent());
            Object content = message.getContent();
            if (content instanceof Multipart) {
            	messageBody = ((Multipart)content).getBodyPart(0).getContent().toString();
            	 System.out.println("************************************ multipart[0] ************************************ ");
            	 System.out.println(messageBody);
            	 // Consume and discard rest of Multipart content
            	 readAndDiscardMultipart((Multipart)content);
            }else {
            	messageBody = content.toString();
            	System.out.println("************************************ not multipart ************************************ ");
            	System.out.println( messageBody);
            }
            
        }

        inbox.close(false);
        store.close();
    }
    
	public static void readAndDiscardMultipart(Multipart mp) 
		    throws MessagingException, IOException {
		  for (int i=0; i<mp.getCount(); i++) {
		    BodyPart bodyPart = mp.getBodyPart(i);
		    Object content = bodyPart.getContent();
		    if (content instanceof Multipart) {
		      readAndDiscardMultipart((Multipart)content);
		    }
		  }
		}
}