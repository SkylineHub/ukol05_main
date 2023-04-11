package org.example;

import ukm.KOT0242.Factorial;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int factorial = Factorial.compute(n);
        System.out.println("Faktoriál čísla " + n + " je " + factorial);
    }
}