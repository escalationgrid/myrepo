package emailSend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendCEFEmail {
	
    public static final String subject = "\"CEF Event\"";
    
    public static final String htmlMessage = "{\r\n" + 
    		"	 \"alertId\"        : \"ALERTA-PH\",\r\n" + 
    		"    \"cefHost\"        : \"WEB-INTERFACE\",\r\n" + 
    		"    \"cefVersion\"     : \"0\",\r\n" + 
    		"    \"cefDVendor\"     : \"ESCALATION GRID\",\r\n" + 
    		"    \"cefDProduct\"    : \"threatmanager\",\r\n" + 
    		"    \"cefDVersion\"    : \"1.0\",\r\n" + 
    		"    \"cefName\"        : \"alerta teste enviado por email\",\r\n" + 
    		"    \"cefSeverity\"    : \"10\",\r\n" + 
    		"    \"cefExtension\"   : \"src=10.0.0.1 dst=2.1.2.2 spt=1232\"\r\n" + 
    		"}";
    
    public static void main(String[] args) {
       
    	
    	List<String> emailsTo = new ArrayList<String>();
    	emailsTo.add("escalationgrid.loc@gmail.com");
    	//emailsTo.add("escalationgrid.lab@gmail.com");
    	//emailsTo.add("escalationgrid.aws@gmail.com");
    	//emailsTo.add("escalationgrid.aws.vendas@gmail.com");
    	
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "escalationgrid.notification@gmail.com";
        String password = "escalation123";

        SendCEFEmail mailer = new SendCEFEmail();
 
        try {
        	for (String emailTo: emailsTo) {
        		mailer.sendHtmlEmail(host, port, mailFrom, password, emailTo, subject, htmlMessage);
        		System.out.println("Json CEF Email sent to: " + emailTo + " ->Subject: " + subject);
        	}
            
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
    }
 
    public void sendHtmlEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {
 
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setContent(message, "text/html");
 
        // sends the e-mail
        Transport.send(msg);
 
    }

}