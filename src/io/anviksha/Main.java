package io.anviksha;

import io.anviksha.lib.Drivable;
import io.anviksha.lib.Vehicle;

public class Main {
    public static void main(String[] args) {
        Drivable d = new Vehicle(); //  allowed
    }
}

//  a sealed interface cannot be implemented by non-permitted classes
//class Truck implements Drivable {
//
//}

//  a sealed interface cannot be extended by non-permitted interfaces
//interface AutoDrivable extends Drivable {
//
//}