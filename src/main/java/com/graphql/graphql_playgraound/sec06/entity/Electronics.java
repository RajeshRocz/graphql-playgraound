package com.graphql.graphql_playgraound.sec06.entity;

import java.util.UUID;

public class Electronics {

    private Brand brand;

    private UUID id;
    private String description;
    private Integer price;

    public Electronics(UUID id, String description, Integer price, Brand brand) {
        this.brand = brand;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
