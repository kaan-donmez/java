package com.example.redditclone.model;

import java.time.Instant;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TokenRefreshing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private Instant createdDate;
}
