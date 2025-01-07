package com.graphql.graphql_playgraound.sec06.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Fruit {



    private UUID id;
    private String description;
    private Integer price;
    private LocalDate expiryDate;

    public Fruit(UUID id, String description, Integer price, LocalDate expiryDate) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.expiryDate = expiryDate;
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

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
