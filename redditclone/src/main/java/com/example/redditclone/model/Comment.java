package com.example.redditclone.model;

import java.time.Instant;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    private Post post;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
}
