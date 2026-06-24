import java.lang.*;

class IncrementDecrement{
	public static void main(String args[]){
		byte a=1;
		int b;
		float c;
		double d;
		char e;
		// Applied to a standing alone variable the position of the increment/decrement signs don't make any difference
		a++; // 2
		System.out.println(a);
		++a; // 3
		System.out.println(a);
		
		// Combined with other variables or methods, the position of the increment/decrement signs matter
		// To the left, the increment/decrement is applied to it's variable first, and then the variable's value is used.
		// To the right, the current value of the variable is copied first, then the increment/decrement is applied to
		// the variable, and after that the previous copied value is used (this "error" can be hidden by using double
		// and fixed by using BigDecimal).
		// Order summary:
		// For ++x or --x: increment/decrement variable -> read in the memory -> use
		// For x++ or x--: read in the memory -> save a copy in a temporarily slot -> increment/decrement variable -> use the copy
		b = 10 * a++; // copy 3, a = 4, and then b = 30
		System.out.println(b);
		b = 10 * ++a; // a = 5 and then b = 50
		System.out.println(b);
		
		// It works the same with float/double type variables:
		c = ++a * 10.10f; // a = 6 and then c = 60.60, it appears as 60.600002 because of the fractional binary representation in
		// float types, it is truncated and then multiplied by 6, leading to a rounded number near to 60.600002
		System.out.println(c);
		d = --a + 40.40; // a = 5 and then d = 45.4
		System.out.println(d);
		d = 10 * a++ + 5 * ++a; // copy 5, a = 6, 10 * 5, a = 7, 5 * 7, and then d = 85.0
		System.out.println(d);
		
		// We can also increment/decrement char type variables
		e = 'C';
		e--; // B
		System.out.println(e);
		System.out.println(e--); // B because 'e' is decrement after printing
		
		// This format is not allowed in this case because "1" is a Integer literal so we need "a" to be int or a bigger data type
		// a = a + 1;
		
		/* References
		 https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html
		 https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
		 https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.14
		 https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/math/BigDecimal.html
		*/
  }

}
