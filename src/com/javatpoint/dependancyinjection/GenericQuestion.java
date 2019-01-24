package com.javatpoint.dependancyinjection;

public abstract class GenericQuestion {
    int id;
    String name;

    public GenericQuestion() {
    }

    public GenericQuestion(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
