package io.anviksha.lib;

//  sealed class must have permits clause,
//  which comes after extends and implements clauses
//  Only the classes in the permitted are allowed to subclass

//  sealed classes can be abstract
//  sealed can also be applied to interfaces
public sealed class Vehicle permits TwoWheeler, FourWheeler, SixWheeler {
}
