package org.example.model;

public class Kelvin implements Converter {
    @Override
    public Double convert(Double inputValue) {
        return inputValue + 273.15;
    }
}