package org.example.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class book {
    private String name;
    private String author;
    private Double prise;
    private Integer year;
    private Integer pages;
}