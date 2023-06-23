package com.zohocrm_1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_1.util.EmailService;

@Controller
public class EmailController {
	@Autowired
private EmailService emailService;
	
	@RequestMapping("/sendEmail")
	public String composeEmail(@RequestParam("email") String email, Model model) {
		model.addAttribute("email", email);
		return "composeEmail";
	}
	

@RequestMapping("/Send")
public String sendMail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("msg") String msg, Model model) {
	emailService.sendEmail(to, sub,msg);
	model.addAttribute("mss", "Mail Send !!!");
	return "composeEmail";
	
}
}