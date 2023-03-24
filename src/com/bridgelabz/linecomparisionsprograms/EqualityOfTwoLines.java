package com.bridgelabz.linecomparisionsprograms;

import java.util.Scanner;

public class EqualityOfTwoLines {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		/*  Every Line Segment has two end points.
		 *    .-------------------------------.
		 *  (x1,y1)                         (x2,y2)  
		 */

        System.out.println("Enter the endpoints of Line 1 (x1 y1 x2 y2):");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();


        System.out.println("Enter the endpoints of Line 2 (x1 y1 x2 y2):");
        int x1_2 = input.nextInt();
        int y1_2 = input.nextInt();
        int x2_2= input.nextInt();
        int y2_2 = input.nextInt();


        if ( x1 == x1_2 && y1 == y1_2 && x2 == x2_2 && y2 == y2_2 ) 
        {
            System.out.println("The two lines are equal");
        } 
        else 
        {
            System.out.println("The two lines are not equal");
        }

        input.close();


}


	}


