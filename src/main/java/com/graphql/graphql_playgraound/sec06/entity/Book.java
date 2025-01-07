package com.graphql.graphql_playgraound.sec06.entity;

import java.util.UUID;

public class Book extends Product{

    private String author;

    public Book(UUID id, String description, Integer price, String author) {
        super(id, description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
