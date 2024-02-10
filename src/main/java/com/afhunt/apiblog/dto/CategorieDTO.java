package com.afhunt.apiblog.dto;

import lombok.Data;

@Data
public class CategorieDTO {
    public String name;
    public String description;
    public CategorieDTO(String name, String description){
        this.name = name;
        this.description = description;
    }
}
