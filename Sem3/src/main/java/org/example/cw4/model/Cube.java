package org.example.cw4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cube {
    private Integer size;
    private String color;
    private String material;
}