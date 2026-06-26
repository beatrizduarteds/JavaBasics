import java.lang.*;
import java.util.Scanner;

class Cuboid{ // A cube has all sides with the same size, a cuboid has at least one side with a different size.

  public static void main(String args[]){
    float height, length, breadth, totalArea, volume;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the cuboid dimensions:");
    System.out.print("height = ");
    height = sc.nextFloat();
    System.out.print("length = ");
    length = sc.nextFloat();
    System.out.print("breadth = ");
    breadth = sc.nextFloat();
    
    totalArea = 2*(height*length+height*breadth+length*breadth);
    volume = height*length*breadth;
    
    System.out.println("The cuboid total area and volume are "+totalArea+" and "+volume);
  }
}
