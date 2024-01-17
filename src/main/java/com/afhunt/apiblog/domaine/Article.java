package com.afhunt.apiblog.domaine;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom", nullable=false, length=512)
    private String nom;

    @Column(name="description", nullable=true, length=512)
    private String description;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categorie_id")
    private Categorie categorie;

    @ManyToMany
    @JoinTable(
            name = "articles_tags",
            joinColumns = @JoinColumn(name = "article_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tags_id", referencedColumnName = "id"))
    private List<Tags> tags;

}
