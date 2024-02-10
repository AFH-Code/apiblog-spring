package com.afhunt.apiblog.dto;

import lombok.Data;

@Data
public class ArticleDTO {
    public String name;
    public String description;
    public Integer categoryId;
    public ArticleDTO(String name, String description){
        this.name = name;
        this.description = description;
    }
}
