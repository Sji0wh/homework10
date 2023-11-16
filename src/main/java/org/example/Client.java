package org.example;

public class Client {

    private String name;
    private double accountBalance;
    private int personalCode;

    private int firstValue;

    private int secondValue;

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else throw new IllegalArgumentException ("Name couldn't be empty");
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setPersonalCode(int personalCode) {
        if (personalCode > 0) {
        this.personalCode = personalCode;
    } else throw new IllegalArgumentException("Personal code error, value should be greater than 0");
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public Client() {
    }

    public String printWord () {
        return "Tere";
    }

    public int parametersDifference () {
        return firstValue - secondValue;
    }
}
