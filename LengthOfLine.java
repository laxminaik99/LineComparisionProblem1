package com.bridgelabz5;

import java.util.*;


public class LengthOfLine {

	public static void main(String[] args) {
		
		 // Taking the coordinates of first line as input
        int x1 , y1 , x2, y2;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for x1,x2 and y1,y2:");
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        
        double LengthOfLine=Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length Of Line = "+LengthOfLine);

	}

}
