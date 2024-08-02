package io.anviksha;

import io.anviksha.lib.Car;
import io.anviksha.lib.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle v = new Vehicle();  //  a sealed class can be used both as type and value

        Vehicle v1 = new Car(); //  ok
    }
}

//  Cannot extend a sealed class unless your class is permitted
//  even though the sealed class is publicly visible
//class Truck extends Vehicle {
//
//}