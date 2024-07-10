package org.example;

public record Order(
        String OrderNumber,
        String OrderID,
        String Art
) {
    public String getOrderID(){
        return OrderID;
    }

}
