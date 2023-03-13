package org.example.cw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNum;
    private double scholarship;
    private List<Integer> evaluations;
}