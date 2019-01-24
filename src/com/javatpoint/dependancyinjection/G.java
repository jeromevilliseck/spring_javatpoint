package com.javatpoint.dependancyinjection;

public class G implements Printable{
    @Override
    public void print(){
        LoggerSingleton.getInstance().info("hello G");
    }
}
