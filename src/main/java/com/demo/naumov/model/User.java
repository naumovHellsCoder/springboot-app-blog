package com.demo.naumov.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    @SequenceGenerator(name = "user_id_sequence",
            sequenceName = "user_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Min(5)
    @Max(10)
    private String username;
    private LocalDate createAt;
    private String password;
    @Enumerated(EnumType.STRING)
    private ERole role;


}
