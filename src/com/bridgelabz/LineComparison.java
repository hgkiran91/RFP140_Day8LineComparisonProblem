package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Welcome to Line Comparison");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate x1 : ");
        double x1 = sc.nextDouble();
        System.out.println("Enter co-ordinate y1 : ");
        double y1 = sc.nextDouble();
        System.out.println("Enter co-ordinate x2 : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter co-ordinate y2 : ");
        double y2 = sc.nextDouble();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line : " + length);
    }
}
