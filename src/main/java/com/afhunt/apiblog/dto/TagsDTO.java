package com.afhunt.apiblog.dto;

import lombok.Data;

@Data
public class TagsDTO {
    public String name;
    public TagsDTO(String name){
        this.name = name;
    }
}
