package com.afhunt.apiblog.service;

import com.afhunt.apiblog.domaine.Article;
import com.afhunt.apiblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


}
