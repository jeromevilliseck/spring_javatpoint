package com.javatpoint.dependancyinjection;

//Autowiring mode by name
public class A {
    C member; //Aggregation link

    public A() {
        LoggerSingleton.getInstance().info("a is created");
    }

    //Autowiring mode by constructor
    public A(C c4){
        this.member = c4;
    }

    public C getC() {
        return member;
    }

    public void setC(C c) {
        this.member = c;
    }

    void print(){
        LoggerSingleton.getInstance().info("hello a");
    }

    void display(){
        this.print();
        member.print();
    }
}
