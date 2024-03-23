package org.example;


import org.springframework.stereotype.Component;

@Component(value = "v2")
public class Bike implements Vehicle{
    public void move() {
        System.out.println("Bike is moving");
    }
}
