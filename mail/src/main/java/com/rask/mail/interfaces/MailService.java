package com.rask.mail.interfaces;

public interface MailService {
    String sendMail(String to, String subject, String body);
}