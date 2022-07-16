package ru.netology;

import ru.netology.calc.Ints;
import ru.netology.calc.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(15, 25));
        System.out.println(intsCalc.mult(6, 9));
        System.out.println(intsCalc.pow(2, 10));
    }
}
