import java.lang.*;

class StringClassAndPrinting{
	
	public static void main(String args[]){
	/*
	The 'System' class has a object 'out' attached to the monitor/console that has various printing methods:
	
	1. System.out.print() print only.
	
	2. System.out.println() print and them place the cursor on the next line(we can also use \n inside quotes to add a new line).
	
	3. System.out.prinf() like in C language, can receive one String with controlled characters/format specifiers (like %f for
	  float and %c for char), and zero or more other variables.
	  Format Specifier
	  %[argument_index$][flags][width]conversion
	  argument_index: 1$, 2$, 3$, ... (order that each variable appear as arguments)
	  flag: 
	  '-'
    '+'
    '0'
    ''
    '('
	  conversion:
	  char c
	  int d, o, x (for decimal, octal or hexadecimal)
	  float f, e, g (for float, or engineering notation)
	  String s
	  
	4. System.out.format() works the same as printf
	*/
	
	  int x=10;
	  float y=120.32f, z=0.00074f;
	  char w='ç';
	  
	  System.out.printf("%d\n",x);
	  // show z in engineering notation with 1 place after dot
	  System.out.printf("%.1e",z);
	  // show y with a total width of 6 places, including 2 places after dot
	  System.out.printf("\n%6.2f",y);
	  // show the same variable multiple times, in an order different from the argument's
	  System.out.printf("\n%3$d %3$d %2$g %2$e %1$c",w,z,x);
	  // add 10 places after the variable value
	  System.out.printf("\n%-12d",x);
	  
	
	  // 1 and 2 can receive 1 argument of multiple types, this is called 'overload'.
		byte A=8;
		char C='B';
		String F="Hi there!";
		System.out.println(A);
		System.out.print(F);
		System.out.println(C);
		
		
		//The add sign '+', means concatenation if one of the operands is a String, and the result is a String.
		//For more them two operands the precedence is left to right.
		int B = 100;
		System.out.print("A is "+A+", B is "+B+ ", so A plus B is "+(A+B)+"\n");
		
		
	
	}

}
