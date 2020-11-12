package com.company.GenericSoloution_3;

public class constriantedGenericList<T extends Number> {
    // this will only allows number to be stored here nothing esle
    private T[] items = (T[]) new Object[10];
}
