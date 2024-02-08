package com.bridgelabz5;

import java.util.Scanner;



public class ComparisionOfTwoLines {

	public static void main(String[] args) {

		 int x1 , y1 , x2, y2;
	       
	        Scanner sc=new Scanner(System.in);
	        int[][] lines = new int[2][4]; 
	        
	        for (int i = 0; i < 2; i++) {
	            System.out.println("Enter values for x1, x2, y1, and y2 for line " + (i + 1) + ":");
	            for (int j = 0; j < 4; j++) {
	                lines[i][j] = sc.nextInt();
	            }
	        }
	        
	        // Accessing the coordinates for the first line
	        int x1Line1 = lines[0][0];
	        int x2Line1 = lines[0][1];
	        int y1Line1 = lines[0][2];
	        int y2Line1 = lines[0][3];
	        
	        // Accessing the coordinates for the second line
	        int x1Line2 = lines[1][0];
	        int x2Line2 = lines[1][1];
	        int y1Line2 = lines[1][2];
	        int y2Line2 = lines[1][3];
	        
	        
		 // Create points for lines
        Point startPoint1 = new Point(x1Line1, y1Line1);
        Point endPoint1 = new Point(x2Line1, y2Line1);
        Point startPoint2 = new Point(x1Line2, y1Line2);
        Point endPoint2 = new Point(x2Line2, y2Line2); // Second line is longer

        // Create lines
        Line line1 = new Line(startPoint1, endPoint1);
        Line line2 = new Line(startPoint2, endPoint2);

        // Compare lengths of lines
        int comparison = line1.compareLength(line2);
        if (comparison == 0) {
            System.out.println("Both lines are equal in length.");
        } else if (comparison < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Line 1 is longer than Line 2.");
        }
    }
}