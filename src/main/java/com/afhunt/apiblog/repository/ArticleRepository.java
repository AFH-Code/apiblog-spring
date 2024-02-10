package com.afhunt.apiblog.repository;

import com.afhunt.apiblog.domaine.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
