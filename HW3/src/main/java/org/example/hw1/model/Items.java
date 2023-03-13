package org.example.hw1.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Double prise;
    private Integer variety;
}
