package com.graphql.graphql_playgraound.sec06.entity;

import java.util.UUID;

public class Electronics extends Product{

    private Brand brand;

    public Electronics(UUID id, String description, Integer price, Brand brand) {
        super(id, description, price);
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
