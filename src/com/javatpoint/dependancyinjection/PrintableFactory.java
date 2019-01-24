package com.javatpoint.dependancyinjection;

public class PrintableFactory {
    public static Printable getPrintable(){
        //return new F();
        return new G(); //Return any one instance, either A or B
    }
}