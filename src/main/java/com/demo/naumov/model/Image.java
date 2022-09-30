package com.demo.naumov.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Image {
    @Id
    @SequenceGenerator(name = "image_id_sequence", sequenceName = "image_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "image_id_sequence"
    )
    private Integer id;
    private String path;
    private String typeImage;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
