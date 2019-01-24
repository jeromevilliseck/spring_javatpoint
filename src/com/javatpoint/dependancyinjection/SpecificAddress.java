package com.javatpoint.dependancyinjection;

public class SpecificAddress extends Address {
    private String addressLine1;

    public SpecificAddress(String addressLine1, String city, String state, String country) {
        super(city, state, country);
        this.addressLine1 = addressLine1;
    }

    @Override
    public String toString() {
        return "SpecificAddress{" +
                "addressLine1='" + addressLine1 + '\'' +
                '}';
    }
}
