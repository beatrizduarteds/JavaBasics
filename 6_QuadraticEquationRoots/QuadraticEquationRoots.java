import java.lang.*;
import java.util.Scanner;

class QuadraticEquationRoots{
  public static void main(String[] args){
	  System.out.println("Let's find the roots of your quadratic equation");
	  System.out.println("Enter the a, b and c coefficients values:");
	  int a, b, c;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("a = ");
	  a = sc.nextInt();
    System.out.print("b = ");
	  b = sc.nextInt();
	  System.out.print("c = ");
	  c = sc.nextInt();
	  float r1, r2; 
	  // If an a,b and c coefficients values combination generates a square root of a negative number the root result will be NaN
	  r1 = (float)(Math.sqrt(Math.powExact(b,2)-4*a*c)-b)/(2*a);// Using "double" type for r1 and r2, it works without casting
	  r2 = (float)(-Math.sqrt(Math.powExact(b,2)-4*a*c)-b)/(2*a);
	  System.out.println("The quadratic equation's roots are "+ r1 + " and "+ r2);
	  
	  
	}
}	
