package com.javatpoint.dependancyinjection;

import java.util.logging.Level;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void displayInfo(){
        LoggerSingleton.getInstance().log(Level.INFO, "Hello : {0} \r\n", name);
    }
}
