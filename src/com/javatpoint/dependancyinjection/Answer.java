package com.javatpoint.dependancyinjection;

public class Answer extends GenericAnswer {
    private String by;

    public Answer() {
    }

    public Answer(int id, String name, String by) {
        super(id, name);
        this.by = by;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "by='" + by + '\'' +
                '}';
    }
}
