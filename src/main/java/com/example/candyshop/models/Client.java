package com.example.candyshop.models;

import com.example.candyshop.utilities.Id;

public class Client {
    private String name;
    private Integer id;

    private String password;

    public Client(String name, String password) {
        this.name = name;
        this.id = Id.id++;
        this.password = password;
    }

    public Client(){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
