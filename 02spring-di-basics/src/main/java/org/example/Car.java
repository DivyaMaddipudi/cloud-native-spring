package org.example;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "v1")
@Primary
public class Car implements Vehicle{

    public Car() {

    }

    public void move() {
        System.out.println("Car is moving");
    }

}
