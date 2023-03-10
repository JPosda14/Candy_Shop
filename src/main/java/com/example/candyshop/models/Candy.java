package com.example.candyshop.models;

public class Candy {
    private String name;
    private DfCandy Df;
    private static Integer id;

    public Candy(String name, DfCandy df) {
        this.name = name;
        this.Df = df;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DfCandy getDf() {
        return Df;
    }

    public void setDf(DfCandy df) {
        Df = df;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Candy.id = id;
    }
}
