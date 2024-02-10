package com.afhunt.apiblog.service;

import com.afhunt.apiblog.domaine.Categorie;
import com.afhunt.apiblog.dto.CategorieDTO;
import com.afhunt.apiblog.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public Categorie save(CategorieDTO categorieDTO)
    {
        return categorieRepository.save(new Categorie(categorieDTO.name, categorieDTO.description));
    }

    public Iterable<Categorie> findAll()
    {
        return categorieRepository.findAll();
    }
}
