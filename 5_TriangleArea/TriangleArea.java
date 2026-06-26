import java.lang.*;
import java.util.Scanner;

class TriangleArea{
  public static void main(String args[]){
    
    System.out.println("###### First Way To Calculate a Triangle Area ######");
    float base, height, area;
    System.out.println("Insert the **base** value:");
    Scanner sc = new Scanner(System.in);
    base = sc.nextFloat();
    System.out.println("Insert the **height** value:");
    height = sc.nextFloat();
    area = base*height/2f;
    System.out.println("The area of the triangle is "+ area);
    System.out.println("");
    
    System.out.println("###### Second Way To Calculate a Triangle Area ######");
    double a, b, c, s, areaa;
    System.out.println("Insert the three values of each side of the triangle:");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    s = (a+b+c)/2;
    areaa = Math.sqrt(s*(s-a)*(s-b)*(s-c)); // Math.sqrt() is from java.lang and it returns a double value
    System.out.println("The area of the triangle is "+ areaa);

    // Why it throws an exception if the user inserts a float point number?
    // Because I am using a PT-BR language on Ubuntu where the number format system is comma for decimals and point to miles, 
    // I was trying to insert a point for decimals, e. g. 10.2, but 10,2 works.
    
    // For the second way to calculate the triangle area, in some cases which the value of one or three of the sides
    // are bigger than "s" the result is NaN because it tries to calculate a square root of a negative number.
  }
}
