package com.penghui.beanFacoryPostProcessorTest.entity;

import org.springframework.context.annotation.Bean;

public class User {

    private String username;
    private String password;
    private Order order;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void myinit(){
        System.out.println("myinit");
    }

    public void myclose(){
        System.out.println("myclose");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", order=" + order +
                ", address=" + address +
                '}';
    }
}
