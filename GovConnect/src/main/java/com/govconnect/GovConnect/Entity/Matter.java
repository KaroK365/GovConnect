package com.govconnect.GovConnect.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Matter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long likes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
