package com.javatpoint.dependancyinjection;

//Autowiring mode by name : aggregate member
public class C {
    private static final String WELCOME_MESSAGE = "hello c";

    public C() {
        LoggerSingleton.getInstance().info("c is created");
    }

    void print(){
        LoggerSingleton.getInstance().info(WELCOME_MESSAGE);
    }
}
