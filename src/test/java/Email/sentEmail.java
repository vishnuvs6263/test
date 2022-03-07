package Email;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class sentEmail {

	public static void main(String[] args) throws Exception {
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("vishnu.vs@xilligence.com", "654321Aa@"));
		email.setSSLOnConnect(true);
		email.setFrom("vishnu.vs@xilligence.com");
		email.addTo("vishnuvsesoft@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		
		email.send();
		System.out.println("Email send succcessfully");

	}
	
	

}
