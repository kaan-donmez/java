package com.example.redditclone.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotification {
    private String subject;
    private String recipient;
    private String body;
}
