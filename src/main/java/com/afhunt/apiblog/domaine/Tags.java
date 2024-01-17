package com.afhunt.apiblog.domaine;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tags")
public class Tags {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom", nullable=false, length=512)
    private String nom;
}
