package io.anviksha;

import io.anviksha.lib.Drivable;
import io.anviksha.lib.FourWheeler;
import io.anviksha.lib.Vehicle;

public class Main {
    public static void main(String[] args) {
        Drivable d = new Vehicle(); //  allowed


        //  Though FourWheeler doesn't implement Drivable directly,
        //  it is a subclass of Vehicle which does
        Drivable d1 = new FourWheeler();

        //  This is narrowing-reference conversion
        //  Since Vehicle is non-sealed,
        //  Car could have been a subclass of FourWheeler
        //  In runtime the ClassCastException will be thrown,
        //  but the compiler allows this risky enterprise
        //  as a remote possibility cannot be deterministically ruled out

        //  If the FourWheeler is a final class, then the possibility
        //  of Car extending FourWheeler is ruled out deterministically
        //  In such cases, Car and Drivable are said to be disjoint types
        //  Disjoint type conversion through cast is not allowed
        Drivable d2 = (Drivable) new Car();
    }
}

class Car {

}