package com.govconnect.GovConnect.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Matter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long likes;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "matter", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
