package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> list = new ArrayList<>();

    public void putProduct(Product product) {
        list.add(product);
    }
    public List<Product> getProducts() {
        return list;
    }
    public void removeProduct(Product product) {
        list.remove(product);
    }
    public Product findById(String id){
        for (Product product : list){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }




}






