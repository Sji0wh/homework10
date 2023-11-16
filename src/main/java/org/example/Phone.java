package org.example;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public void displayPhoneModel() {
        System.out.println("Phone Model: " + model);
    }

    public void callPhoneNumber(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
