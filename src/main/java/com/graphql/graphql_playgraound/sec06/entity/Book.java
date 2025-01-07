package com.graphql.graphql_playgraound.sec06.entity;

import java.util.UUID;

public class Book {

    private String author;
    private UUID id;
    private String description;
    private Integer price;

    public Book(UUID id, String description, Integer price, String author) {
        this.author = author;
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


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
