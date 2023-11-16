package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientAndPhoneTest {

    //Task 1
    @Test
    public void clientTest() {
        //First client creation
        Client firstClient = new Client();
        firstClient.setName("John");
        firstClient.setAccountBalance(256.25);
        firstClient.setPersonalCode(123);
        //Second client creation
        Client secondClient = new Client();
        secondClient.setName("Bob");
        secondClient.setAccountBalance(999.99);
        secondClient.setPersonalCode(456);
        //Third client creation
        Client thirdClient = new Client();
        thirdClient.setName("Sarah");
        thirdClient.setAccountBalance(456.99);
        thirdClient.setPersonalCode(123);
        //Test
        System.out.println(firstClient.printWord());
        secondClient.setFirstValue(25);
        secondClient.setSecondValue(5);
        secondClient.parametersDifference();
        int difference = secondClient.parametersDifference();
        //Assertion
        Assertions.assertEquals(20, difference);
        System.out.println(difference);
    }

    //Task 2
    @Test
    public void phoneTest() {
        Phone firstPhone = new Phone(+372372273, "Huawei", 100);
        Phone secondPhone = new Phone(+5756784, "Samsung", 150);
        firstPhone.displayPhoneModel();
        secondPhone.callPhoneNumber(secondPhone.getNumber());
    }
}
