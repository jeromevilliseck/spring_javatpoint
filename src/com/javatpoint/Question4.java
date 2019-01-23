package com.javatpoint;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;

public class Question4 extends GenericQuestion{
    private Map<Answer, User> answers;

    public Question4(int id, String name, Map<Answer, User> answers) {
        super(id, name);
        this.answers = answers;
    }

    void displayInfo(){
        LoggerSingleton.getInstance().log(Level.INFO, "question id : {0}", id);
        LoggerSingleton.getInstance().log(Level.INFO, "question name : {0}", name);
        LoggerSingleton.getInstance().log(Level.INFO, "question answers");

        Set<Entry<Answer, User>> set = answers.entrySet();

        for (Entry<Answer, User> entry : set) {
            Answer ans = entry.getKey();
            User user = entry.getValue();
            LoggerSingleton.getInstance().log(
                    Level.INFO, "Answer Information: {0}, posted by {1} \r\n", new Object[]{ans, user});
        }
    }
}
