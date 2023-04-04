package org.example.Module;

public interface VendingMachineInterface {
    void addProduct(Product item);

    Product getProduct(String name);

    void printStorage();
}
