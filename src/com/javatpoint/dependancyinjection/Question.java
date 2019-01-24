package com.javatpoint.dependancyinjection;

import java.util.List;
import java.util.logging.Level;

public class Question extends GenericQuestion{
    private List<String> answers;

    public Question(){}

    public Question(int id, String name, List<String> answers) {
        super(id, name);
        this.answers = answers;
    }

    void displayInfo(){
        LoggerSingleton.getInstance().log(Level.INFO, "id:{0} \r\n name:{1} \r\n", new Object[]{id, name});

        for (String answer : this.answers) {
            LoggerSingleton.getInstance().log(Level.INFO, "answers: {0} \r\n", answer);
        }
    }
}
