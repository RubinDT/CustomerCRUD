package com.testingmongo.customercrud.model;

import org.springframework.data.annotation.Id;

public class Customer {

    @Id
    public String customerId; //this is assigned by MongoDB

    public int age;
    public String firstName;
    public String lastName;

    public Customer(){}

    public Customer(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }

    public Customer(String firstName, String lastName, int age, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.customerId = id;


    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
