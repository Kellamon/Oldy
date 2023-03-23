package org.example.model;

public class Celsius implements Converter{
    @Override
    public Double convert(Double inputValue) {
        return inputValue;
    }
}