package com.javatpoint.dependancyinjection;

public class EmployeeWithCity extends Employee {
    private String city;

    //No constructor, setter injection
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeWithCity{" +
                "city='" + city + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
