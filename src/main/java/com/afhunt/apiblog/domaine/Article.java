package com.afhunt.apiblog.domaine;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom", nullable=false, length=512)
    private String nom;

    @Column(name="description", nullable=true, length=512)
    private String description;

}
