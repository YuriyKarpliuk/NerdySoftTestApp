package org.example.entities;



public class RealProduct extends Product{
    private Integer size;
    private Integer weight;

    public RealProduct(String name, Double price, Integer size, Integer weight) {
        super(name, price);
        this.size = size;
        this.weight = weight;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
