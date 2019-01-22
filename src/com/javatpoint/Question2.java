package com.javatpoint;

import java.util.List;

public class Question2 extends GenericQuestion {
    private List<Answer> answers;

    public Question2(int id, String name, List<Answer> answers) {
        super(id, name);
        this.answers = answers;
    }

    void displayInfo(){
        System.out.println(this.id + " " + this.name);
        System.out.println("answers are");

        for (Answer answer : this.answers) {
            System.out.println(answer);
        }
    }
}
