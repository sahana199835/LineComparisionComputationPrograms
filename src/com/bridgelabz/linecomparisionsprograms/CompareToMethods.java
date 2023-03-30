package com.bridgelabz.linecomparisionsprograms;

public class CompareToMethods {
	public static void main(String[] args) {
		public static void comparingTwoLines() {

			System.out.println("Welcome to Line Comparison Computation Program! ");

			Scanner input = new Scanner(System.in);
			
	        // Co-ordinates of Line1 are:
	        System.out.println("Enter the co-ordinates of Line 1 (x1,y1) :");
	        double x1 = input.nextDouble();
	        double y1 = input.nextDouble();
	        
	        System.out.println("Enter the co-ordinates of Line 1 (x2,y2) :");
	        double x2 = input.nextDouble();
	        double y2 = input.nextDouble();
	       
	        // Co-ordinates of Line2 are:
	        System.out.println("Enter the endpoints of Line 2 (u1,v1 ) :");
	        double u1 = input.nextInt();
	        double v1 = input.nextInt();
	        
	        System.out.println("Enter the co-ordinates of Line 1 (u2,v2) :");
	        double u2= input.nextInt();
	        double v2 = input.nextInt();
	        
	@@ -50,10 +50,13 @@
	       {
	           System.out.println("Line1 is equal to Line2");
	       }

	      input.close();


	
		}
	
		public static void main(String[] args) {
			comparingTwoLines();
		}
	}



}
