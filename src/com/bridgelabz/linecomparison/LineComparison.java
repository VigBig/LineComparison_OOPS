package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Line line = new Line();
        line.getPoints();
        line.calculateLine();
        line.lineEquality();
        line.lineComparison();
    }
}
