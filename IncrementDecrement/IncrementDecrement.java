import java.lang.*;

class IncrementDecrement{
	public static void main(String args[]){
		byte a=1;
		int b;
		float c;
		double d;
		char e;
		// Applied to a standing alone variable the position of the increment/decrement signs don't make any difference:
		a++; // 2
		System.out.println(a);
		++a; // 3
		System.out.println(a);
		
		// Inside an expression the position of the increment/decrement signs matter:
		// To the left the increment/decrement is applied to it's variable first, and them used in the expression.
		// To the right the variable is first used in the expression, and them the increment/decrement is applied to itself.
		b = 10 * a++; // b = 30 and them a = 4
		System.out.println(b);
		b = 10 * ++a; // a = 5 and them b = 50
		System.out.println(b);
		
		// It works the same with float/double type variables:
		c = ++a * 10.10f; // a = 6 and them c = 60.60, it appears as 60.600002 because of the fractional binary representation in float types, it is truncated and them multiplied by 6, leading to a rounded number near to 60.600002
		System.out.println(c);
		d = --a + 40.40; // a = 5 and them d = 45.4
		System.out.println(d);
		
		//We can also increment/decrement char type variables
		e = 'C';
		e--; // B
		System.out.println(e);
		
		
		
		c=a+1; //in this case "1" is a literal so we need to use casting
}

}
