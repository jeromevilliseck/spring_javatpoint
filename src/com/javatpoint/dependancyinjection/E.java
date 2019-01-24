package com.javatpoint.dependancyinjection;

//Autowiring mode by Type
public class E {
    B member; //Aggregation link

    public E() {
        LoggerSingleton.getInstance().info("e is created");
    }

    public B getB() {
        return member;
    }

    public void setC(B b) {
        this.member = b;
    }

    void print(){
        LoggerSingleton.getInstance().info("hello e");
    }

    void display(){
        this.print();
        member.print();
    }
}
