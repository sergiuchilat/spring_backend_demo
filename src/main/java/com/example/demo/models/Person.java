package com.example.demo.models;

public class Person {
    public static Integer counter = 1;
    private Integer id;
    private String name;

    public Person() {
        this.id = counter++;
        this.name = "Default Name";
    }

    public Person(String name) {
        this.id = counter++;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
