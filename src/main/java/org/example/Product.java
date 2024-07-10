package org.example;

public record Product(
        String productname,
        String productID,
        int menge
) {
    public String getId(){
        return productID;
    }
}
