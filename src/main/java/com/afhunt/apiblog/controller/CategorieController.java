package com.afhunt.apiblog.controller;

import com.afhunt.apiblog.domaine.Categorie;
import com.afhunt.apiblog.dto.CategorieDTO;
import com.afhunt.apiblog.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("/categorie")
    public Categorie createCategorie(@RequestBody CategorieDTO categorieDTO){
        Categorie categorie = categorieService.save(categorieDTO);
        return categorie;
    }

    @GetMapping("/categorie")
    public Iterable<Categorie> getCategories(){
        Iterable<Categorie> listCategorie = categorieService.findAll();
        return listCategorie;
    }
}
