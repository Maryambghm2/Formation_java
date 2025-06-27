package org.example.demo1;

import org.example.exception.DividedByZeroException;

public class Calcul {

    public double addition(double a, double b) {
        return a + b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        throw new  DividedByZeroException("Pas de division par 0!!!");
    }
}
