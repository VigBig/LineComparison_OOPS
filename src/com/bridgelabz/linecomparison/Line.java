package com.bridgelabz.linecomparison;

public class Line extends Point {
     double length1 = 0.0, length2 = 0.0;

    public void calculateLine(){
        length1 = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        length2 = Math.sqrt((Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));

        System.out.println("Length of Line 1 is: " + length1);
        System.out.println("Length of Line 2 is: " + length2);
    }

    public void lineEquality(){
        System.out.println("Comparing lines with .equals() method");
        if( (Double.toString(length1) ).equals( Double.toString(length2) ) == true){
            System.out.println("The Lines are equal");
        }
        else{
            System.out.println("The Lines are NOT equal");
        }
    }

    public void lineComparison(){
        System.out.println("Comparing lines with .compareTo() method");
        int compare_to =  (Double.toString(length1) ).compareTo( Double.toString(length2) );

//      "compare_to" variable holds the integer value outputted by .compareTo() method.
//      If compare_to is -ve , then Line 1 is smaller ,
//      else if compare_to is +ve , then Line 1 is larger
//      else Line 1 is equal to Line

        if(compare_to <0){
            System.out.println("Line 1 is LESSER than Line 2");
        } else if (compare_to >0) {
            System.out.println("Line 1 is GREATER than Line 2");
        }
        else {
            System.out.println("Line 1 is EQUAL to Line 2");
        }
    }
}
