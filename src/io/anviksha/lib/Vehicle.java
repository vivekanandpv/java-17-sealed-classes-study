package io.anviksha.lib;

//  sealed class must have permits clause,
//  which comes after extends and implements clauses
//  Only the classes in the permitted are allowed to subclass

//  sealed classes can be abstract
//  sealed can also be applied to interfaces

//  All the permitted subclasses and subinterfaces
//  must be accessible by the sealed class at compile time

//  All permitted subclasses and subinterfaces
//  must extend or implement the sealed class/interface directly

//  If the permitted classes are defined in the same file
//  as the sealed class, permits clause can be omitted
//  But a source file can have only one public type

//  Two sealed classes cannot have a common
//  permitted class as multiple inheritance is not allowed
//  This rule doesn't apply to sealed interfaces

//  Sealed class/interface itself cannot be declared in the permits clause
public sealed class Vehicle permits TwoWheeler, FourWheeler, SixWheeler {
}