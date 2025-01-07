package com.graphql.graphql_playgraound.sec06.entity;

import java.util.UUID;

public abstract class Product {

    private UUID id;
    private String description;
    private Integer price;


    public Product(UUID id, String description, Integer price) {
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
}
