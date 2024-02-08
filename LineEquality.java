package com.bridgelabz5;

import java.util.Scanner;

public class LineEquality {
	

	public static void main(String[] args) {
   //     Point startPoint1 = new Point(1, 2);
//        Point endPoint1 = new Point(4, 5);
//        Point startPoint2 = new Point(1, 2);
//        Point endPoint2 = new Point(4, 5);
//        Point startPoint3 = new Point(1, 2);
//        Point endPoint3 = new Point(5, 6);
//
//       
//        Line line1 = new Line(startPoint1, endPoint1);
//        Line line2 = new Line(startPoint2, endPoint2);
//        Line line3 = new Line(startPoint3, endPoint3);
        int x1 , y1 , x2, y2;
	       
        Scanner sc=new Scanner(System.in);
        int[][] lines = new int[2][4]; 
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter values for x1, x2, y1, and y2 for line " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                lines[i][j] = sc.nextInt();
            }
        }
        
       
        int x1Line1 = lines[0][0];
        int x2Line1 = lines[0][1];
        int y1Line1 = lines[0][2];
        int y2Line1 = lines[0][3];
        
       
        int x1Line2 = lines[1][0];
        int x2Line2 = lines[1][1];
        int y1Line2 = lines[1][2];
        int y2Line2 = lines[1][3];
        
        
	
   Point startPoint1 = new Point(x1Line1, y1Line1);
   Point endPoint1 = new Point(x2Line1, y2Line1);
   Point startPoint2 = new Point(x1Line2, y1Line2);
   Point endPoint2 = new Point(x2Line2, y2Line2); 

   
   Line line1 = new Line(startPoint1, endPoint1);
   Line line2 = new Line(startPoint2, endPoint2);
   
   if(line1.isEqual(line2))     
        System.out.println("Line 1 is equal to Line 2: ");
   else    System.out.println("Line 1 is not  equal to Line 2: ");
    }
}
