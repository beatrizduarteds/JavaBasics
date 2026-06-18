import java.lang.*;
import java.util.*;

class ReadingFromKeyboard{
	public static void main(String args[]){
	// Read two numbers and show their sum
	Scanner s = new Scanner(System.in);
	int a, b, c;
	System.out.println("Enter two numbers please:");
	a = s.nextInt();
	b = s.nextInt();
	c = a + b;
	System.out.println("The sum is "+ c);
	
	// Read and show a full name
	/* Why before only worked when I create a new object? Because If I call nextLine() immediately after nextInt(), nextLine() sees a leftover newline character and assumes that the user has already submitted an empty line. This makes it look like my program skipped the second prompt. I have to call an extra scanner.nextLine() immediately after any numeric input to "clear the buffer" before reading a string.*/
	s.nextLine();
	System.out.println("May I know your name?");
	String x = s.nextLine();
	System.out.println("Oh hello Mr/Mrs "+ x);
	
	// Take a binary and show its decimal
	System.out.println("Give me a binary number");
	s.useRadix(2); // 2 here means binary
	int decimal = s.nextInt();
	System.out.println("This binary number is "+decimal+ " in decimal!");
	}
}
