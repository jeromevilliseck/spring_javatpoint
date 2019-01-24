package com.javatpoint.dependancyinjection;

class SingletonA {
    private static final SingletonA singleInstance = new SingletonA(); //The constant object, the singleton

    private SingletonA(){
        LoggerSingleton.getInstance().info("private constructor");
    }

    public static SingletonA getSingletonA(){
        LoggerSingleton.getInstance().info("factory method");
        return singleInstance;
    }

    public void msg(){
        LoggerSingleton.getInstance().info("hello user");
    }


}
