package io.anviksha.lib;

//  Since this subclass extends a sealed class
//  it must explicitly declare whether it is final, sealed, or non-sealed
public sealed class TwoWheeler extends Vehicle permits Scooter {
}
