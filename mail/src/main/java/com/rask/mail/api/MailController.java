package com.rask.mail.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rask.mail.interfaces.MailService;

@RestController
@RequestMapping("/api/mail")
public class MailController {
    private final MailService mailService;

    private String to = "";
    private String subject = "Test Mail";
    private String body = "This is a test mail";

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/send")
    public ResponseEntity<String> send() {
        return ResponseEntity.ok(mailService.sendMail(to, subject, body));
    }

}