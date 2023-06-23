package com.zohocrm_1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender javaMailSender;
	@Override
	public void sendEmail(String to, String sub, String msg) {
		SimpleMailMessage sendMail = new SimpleMailMessage();
		sendMail.setTo(to);
		sendMail.setSubject(sub);
		sendMail.setText(msg);
		javaMailSender.send(sendMail);
	}

}
