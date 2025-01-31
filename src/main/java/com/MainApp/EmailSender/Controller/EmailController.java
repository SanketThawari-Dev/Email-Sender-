package com.MainApp.EmailSender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.MainApp.EmailSender.Services.EmailSender;

@RestController
public class EmailController {

    @Autowired
    private EmailSender sendEmail;

    @GetMapping("/sendEmail")
    public String sendEmail() {
        try {
            sendEmail.sendEmail("sanketvthawari@gmail.com", "Testing Java mail sender", "Hi, Bokachcccoda");
            return "Email sent successfully!";
        } catch (Exception e) {
            return "Error while sending email: " + e.getMessage();
        }
    }
}
