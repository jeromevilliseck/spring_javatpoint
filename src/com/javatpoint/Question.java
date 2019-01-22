package com.javatpoint;

import java.util.List;

public class Question extends GenericQuestion{
    private List<String> answers;

    public Question(){}

    public Question(int id, String name, List<String> answers) {
        super(id, name);
        this.answers = answers;
    }

    void displayInfo(){
        System.out.println(id + " " + name);
        System.out.println("answers are:");

        for (String answer : this.answers) {
            System.out.println(answer);
        }
    }
}
