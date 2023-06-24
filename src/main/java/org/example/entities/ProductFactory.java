package org.example.entities;

import java.time.LocalDate;

public class ProductFactory {
    public static Product createRealProduct(String name, Double price,Integer size,Integer weight){
        return new RealProduct(name,price,size,weight);

    }
    public static Product createVirtualProduct(String name, Double price, String code, LocalDate expirationDate){
        return new VirtualProduct(name,price,code,expirationDate);

    }
}
