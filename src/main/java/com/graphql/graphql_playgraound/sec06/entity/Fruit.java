package com.graphql.graphql_playgraound.sec06.entity;

import java.time.LocalDate;
import java.util.UUID;

public class Fruit extends Product{

    private LocalDate expiryDate;

    public Fruit(UUID id, String description, Integer price, LocalDate expiryDate) {
super(id, description, price);
        this.expiryDate = expiryDate;
    }


    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
