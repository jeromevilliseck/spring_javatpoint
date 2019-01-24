package com.javatpoint.dependancyinjection;

import java.util.logging.Logger;

class LoggerSingleton {
    private static Logger singleInstance = Logger.getAnonymousLogger(); //

    private LoggerSingleton(){}

    static Logger getInstance(){
        return singleInstance;
    }
}
