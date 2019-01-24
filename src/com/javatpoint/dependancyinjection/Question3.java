package com.javatpoint.dependancyinjection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question3 extends GenericQuestion {
    private Map<String, String> answers;

    public Question3() {
    }

    public Question3(int id, String name, Map<String, String> answers) {
        super(id, name);
        this.answers = answers;
    }

    String displayMap(){
        StringBuilder stringSet = new StringBuilder();

        Set<Entry<String, String>> set = answers.entrySet();
        for (Entry<String, String> entry : set) {
            stringSet.append("Answer:=").append(entry.getKey()).append("Posted_by:=").append(entry.getValue()).append("\r\n");
        }

        return stringSet.toString();
    }

    @Override
    public String toString() {
        return String.format("Question3 %n number: %d %n answers: %s %n name: %s \r\n", id, answers, name);
    }


}
