package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Point {
     int x1 = 0, y1 = 0,x2 = 0,y2 =0, x3= 0, y3 =0, x4 = 0 , y4 = 0;

    public void getPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end point co-ordinates for the Line 1:");
        System.out.println("Enter X1 value is :");
        x1 = sc.nextInt();

        System.out.println("Enter Y1 value is :");
        y1 = sc.nextInt();

        System.out.println("Enter X2 value is :");
        x2 = sc.nextInt();

        System.out.println("Enter Y2 value is :");
        y2 = sc.nextInt();

        System.out.println("Enter end point co-ordinates for Line 2:");
        System.out.println("Enter X3 value is :");
        x3 = sc.nextInt();

        System.out.println("Enter Y3 value is :");
        y3 = sc.nextInt();

        System.out.println("Enter X4 value is :");
        x4 = sc.nextInt();

        System.out.println("Enter Y4 value is :");
        y4 = sc.nextInt();

    }
}
