package com.demo.naumov.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    @Id
    @SequenceGenerator(name = "post_id_sequence",
    sequenceName = "post_id_sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "post_id_sequence")
    private Integer id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDate createAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
