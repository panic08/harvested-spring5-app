package ru.alishev.springcourse.models;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    private int id;

    @NotEmpty(message = "Name shouldn't be empty")
    @Size(min = 3, max = 10, message = "Name should be min 3 max 10")
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
