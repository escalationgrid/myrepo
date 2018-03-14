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
 
public class SendCycleEmail {
 
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
 
        SendCycleEmail mailer = new SendCycleEmail();
 
        try {
        	for (String emailTo: emailsTo) {
        		mailer.sendHtmlEmail(host, port, mailFrom, password, emailTo, subject, htmlMessage);
        		System.out.println("Cycle HTML Email sent to: " + emailTo + " ->Subject: " + subject);
        	}
        } catch (Exception ex) {
            System.out.println("Failed to send email.");
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
    
    public static final String subject = "Chamado 7423.3: DISPONIBILIZAÇÃO DE RECURSOS - RECURSOS DE INFRA PARA NOVOS CONTRATADOS;";
    
    public static final String htmlMessage = "<head>\r\n" + 
    		"<meta content=\"text/html; charset=ISO-8859-1\"\r\n" + 
    		"http-equiv=\"content-type\">\r\n" + 
    		"<title></title>\r\n" + 
    		"</head>\r\n" + 
    		"<body>\r\n" + 
    		"<br>\r\n" + 
    		"<meta content=\"text/html; charset=ISO-8859-1\" http-equiv=\"content-type\">\r\n" + 
    		"<title></title>\r\n" + 
    		"<table class=\"MsoNormalTable\" style=\"width: 100%;\" border=\"0\"\r\n" + 
    		"cellpadding=\"0\" width=\"100%\">\r\n" + 
    		"<tbody>\r\n" + 
    		"<tr>\r\n" + 
    		"<td style=\"padding: 2.15pt;\">\r\n" + 
    		"<p class=\"MsoNormal\" style=\"text-align: center;\" align=\"center\"><b><span\r\n" + 
    		"style=\"font-size: 10pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Suporte-TI\r\n" + 
    		"- Sistema de Abertura de Chamados</span></b><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr>\r\n" + 
    		"<td\r\n" + 
    		"style=\"padding: 2.15pt; background: rgb(113, 147, 255) none repeat scroll 0% 50%; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;\">\r\n" + 
    		"<p class=\"MsoNormal\" style=\"text-align: center;\" align=\"center\"><span\r\n" + 
    		"style=\"background: rgb(113, 147, 255) none repeat scroll 0% 50%; font-size: 10pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: white; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;\">Notificação\r\n" + 
    		"de acompanhamento do chamado nº.: <span\r\n" + 
    		"style=\"text-decoration: underline; color: rgb(51, 51, 255);\"></span></span><a\r\n" + 
    		"href=\"http://chamados.trescon.com.br/webcycle/Command.aspx?operation=0&amp;key=7423.3\">\r\n" + 
    		"7423.3</a><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td\r\n" + 
    		"style=\"padding: 2.15pt; background: rgb(191, 219, 255) none repeat scroll 0% 50%; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Informações\r\n" + 
    		"do Solicitante</span></b><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"</tbody>\r\n" + 
    		"</table>\r\n" + 
    		"<p class=\"MsoNormal\"><span\r\n" + 
    		"style=\"font-size: 10pt; font-family: &quot;Calibri&quot;,&quot;sans-serif&quot;; display: none;\"><o:p>&nbsp;</o:p></span></p>\r\n" + 
    		"<table class=\"MsoNormalTable\" style=\"width: 100%;\" border=\"0\"\r\n" + 
    		"cellpadding=\"0\" width=\"100%\">\r\n" + 
    		"<tbody>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 401.05pt;\" width=\"535\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Contato:\r\n" + 
    		"</span></b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">diego.mattos\r\n" + 
    		"- Diego Mattos</span><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\"></span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 323.3pt;\" width=\"431\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Local/Setor:&nbsp;\r\n" + 
    		"</span></b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">TI</span><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">\r\n" + 
    		"</span></b><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 401.05pt;\" width=\"535\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Empresa:\r\n" + 
    		"</span></b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">3CON\r\n" + 
    		"CONSULTORIA E SISTEMAS LTDA</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 306pt;\" width=\"408\">\r\n" + 
    		"<p class=\"MsoNormal\"><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Data\r\n" + 
    		"da Solicitação: </span></strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">19/01/2018 07:54:40 (GMT -2:00)</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td colspan=\"2\"\r\n" + 
    		"style=\"padding: 2.15pt; background: rgb(191, 219, 255) none repeat scroll 0% 50%; width: 486pt; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;\"\r\n" + 
    		"width=\"648\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Detalhes\r\n" + 
    		"do Chamado</span></b><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr>\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 486pt;\" width=\"648\">\r\n" + 
    		"<p><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Responsável\r\n" + 
    		"pelo chamado: </span></strong><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: red;\">diego.mattos</span></strong><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"<td style=\"padding: 0cm;\" valign=\"top\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Ação:\r\n" + 
    		"</span></b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">CANCELAR CHAMADO</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 486pt;\" width=\"648\">\r\n" + 
    		"<p><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Procedimento\\Objeto:\r\n" + 
    		"</span></strong><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: red;\">CYCLE\r\n" + 
    		"- \"ALTERAÇÃO\"</span></strong><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"<td style=\"padding: 0cm;\" valign=\"top\">\r\n" + 
    		"<p class=\"MsoNormal\"><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Data\r\n" + 
    		"da ação: </span></strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">19/01/2018 07:54:40 (GMT -2:00)</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td style=\"padding: 2.15pt; width: 486pt;\" width=\"648\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Descrição:&nbsp;\r\n" + 
    		"</span></b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Ação[3]: CYCLE - ALTERAÇÃO;</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"<td style=\"padding: 0cm;\" valign=\"top\">\r\n" + 
    		"<p class=\"MsoNormal\"><strong><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Data\r\n" + 
    		"limite: 19/01/2018 11:52:25 (GMT -2:00) </span></strong><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td colspan=\"2\"\r\n" + 
    		"style=\"padding: 2.15pt; background: rgb(230, 230, 230) none repeat scroll 0% 50%; width: 486pt; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;\"\r\n" + 
    		"width=\"648\">\r\n" + 
    		"<p class=\"MsoNormal\" style=\"\"><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\"> teste<br /> <br />---------- Mensagem original ----------<br /> <br />DIEGO MATTOS pegou o chamado.<br /> <br /> <br /> <br />---------- Mensagem original ----------<br /> <br />Teste</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td colspan=\"2\"\r\n" + 
    		"style=\"padding: 2.15pt; background: rgb(191, 219, 255) none repeat scroll 0% 50%; width: 486pt; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;\"\r\n" + 
    		"width=\"648\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Informações\r\n" + 
    		"Adicionais</span></b><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr>\r\n" + 
    		"<td colspan=\"2\" style=\"padding: 2.15pt; width: 486pt;\" width=\"648\">\r\n" + 
    		"<p class=\"MsoNormal\"><b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">Versão\r\n" + 
    		"Sistema Operacional:</span></b><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;; color: black;\">\r\n" + 
    		"2008<br>\r\n" + 
    		"<b>Versão Aplicativo:</b> 2.2.0.2<br>\r\n" + 
    		"<b>Sistema Operacional:</b> Windows<br>\r\n" + 
    		"<b>Produto:</b> TZ0 Classic<br>\r\n" + 
    		"<b>Plataforma:</b> Servidor<br>\r\n" + 
    		"<b>Versão Build:</b> 2.0.2.7<br>\r\n" + 
    		"<b>Módulos:</b> Indiferente</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"</tbody>\r\n" + 
    		"</table>\r\n" + 
    		"<p class=\"MsoNormal\"><span\r\n" + 
    		"style=\"font-size: 10pt; font-family: &quot;Calibri&quot;,&quot;sans-serif&quot;; color: black; display: none;\"><o:p>&nbsp;</o:p></span></p>\r\n" + 
    		"<table class=\"MsoNormalTable\"\r\n" + 
    		"style=\"width: 100%; margin-left: 1.5pt; border-collapse: collapse;\"\r\n" + 
    		"border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
    		"<tbody>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td style=\"padding: 0.75pt;\"><br>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"<tr style=\"\">\r\n" + 
    		"<td style=\"padding: 0.75pt;\">\r\n" + 
    		"<p style=\"text-align: center;\" align=\"center\"><span\r\n" + 
    		"style=\"font-size: 8pt; font-family: &quot;Arial&quot;,&quot;sans-serif&quot;;\">Notificação\r\n" + 
    		"objetivando o acompanhamento do chamado, favor não responder a este\r\n" + 
    		"e-mail.</span><o:p></o:p></p>\r\n" + 
    		"</td>\r\n" + 
    		"</tr>\r\n" + 
    		"</tbody>\r\n" + 
    		"</table>\r\n" + 
    		"</body>\r\n" + 
    		"</html>";
    

}