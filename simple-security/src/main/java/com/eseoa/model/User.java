package com.eseoa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "users")
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "email")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name = "users_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
    private Long id;

    private String email;

    private String password;
}