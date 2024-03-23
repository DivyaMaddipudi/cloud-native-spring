package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value = "p")
public class Person {
    @Autowired
    private final Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void travel() {
        vehicle.move();
    }
}
