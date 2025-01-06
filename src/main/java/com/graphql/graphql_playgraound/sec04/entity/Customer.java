package com.graphql.graphql_playgraound.sec04.entity;

public class Customer {

    private Integer id;
    private String name;
    private Integer age;
    private String city;

    public Customer(Integer id, String name, Integer age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
}
