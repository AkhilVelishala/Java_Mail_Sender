package com.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JavaMailSenderService {


	@Autowired
	private JavaMailSender javaMailSender;


	@Value("$(spring.mail.username)")
	private String fromSendingMail;


	public void SendingMail(String recipient,String body,String subject)
	{
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(fromSendingMail);
        mailMessage.setTo(recipient);	
        mailMessage.setText(body);
        mailMessage.setSubject(subject);
        
        javaMailSender.send(mailMessage);
		
		
		
	}


}