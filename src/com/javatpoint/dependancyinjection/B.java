package com.javatpoint.dependancyinjection;

//Autowiring mode by type : aggregate member
public class B {
    private static final String WELCOME_MESSAGE = "hello b";

    public B() {
        LoggerSingleton.getInstance().info("b is created");
    }

    void print(){
        LoggerSingleton.getInstance().info(WELCOME_MESSAGE);
    }
}
