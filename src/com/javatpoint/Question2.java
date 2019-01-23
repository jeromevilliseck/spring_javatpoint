package com.javatpoint;

import java.util.List;
import java.util.logging.Level;

public class Question2 extends GenericQuestion {
    private List<Answer> answers;

    public Question2(int id, String name, List<Answer> answers) {
        super(id, name);
        this.answers = answers;
    }

    void displayInfo(){
        LoggerSingleton.getInstance().log(Level.INFO, "id:{0} \r\n name:{1} \r\n", new Object[]{id, name});

        for (Answer answer : this.answers) {
            LoggerSingleton.getInstance().log(Level.INFO, "answers: {0} \r\n", answer);
        }
    }
}
