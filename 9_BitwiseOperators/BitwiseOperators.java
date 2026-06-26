import java.lang.*;

class BitwiseOperators{
// Bitwise operations are faster, and can be performed only on Integer types.
// In the background decimal literals/values are represented in binary (with 4 bytes for int, 1 byte for byte, etc), and the operation between two numbers is done on each pair of bits.
// That's why 10ˇ6 is equal to 14.

	public static void main(String args[]){

		System.out.println("The OR operator in Java is '|':");
		System.out.println("");
		System.out.println(" A | B | A|B");
		System.out.println(" -----------");
		System.out.println(" 0 | 0 |  "+(0|0));
		System.out.println(" 0 | 1 |  "+(0|1));
		System.out.println(" 1 | 0 |  "+(1|0));
		System.out.println(" 1 | 1 |  "+(1|1));
		System.out.println("10|6 = "+(10|6));
		System.out.println("");
		System.out.println("");
		
		System.out.println("The AND operator in Java is '&':");
		System.out.println("");
		System.out.println(" A | B | A&B");
		System.out.println(" -----------");
		System.out.println(" 0 | 0 |  "+(0&0));
		System.out.println(" 0 | 1 |  "+(0&1));
		System.out.println(" 1 | 0 |  "+(1&0));
		System.out.println(" 1 | 1 |  "+(1&1));
		System.out.println("10&6 = "+(10&6));
		System.out.println("");
		System.out.println("");
		
		System.out.println("The NOT operator in Java is '~':");
		// It adds 1 and changes the sign.
		// The binary operation in each bit is: NOT, the result of NOT is the sign of the final value (0 to +, 1 to -), and the final value is the second complement of the result of NOT.
		System.out.println("");
		System.out.println(" A | ~A");
		System.out.println(" ------");
		System.out.println(" 0 | "+~0);
		System.out.println(" 1 | "+~1);
		System.out.println("~7 = "+~7);
		
		System.out.println("");
		System.out.println("");
		System.out.println("The XOR operator in Java is '^':");
		System.out.println("");
		System.out.println(" A | B | A^B");
		System.out.println(" -----------");
		System.out.println(" 0 | 0 |  "+(0^0));
		System.out.println(" 0 | 1 |  "+(0^1));
		System.out.println(" 1 | 0 |  "+(1^0));
		System.out.println(" 1 | 1 |  "+(1^1));
		System.out.println("10^6 = "+(10^6));
		
		System.out.println("");
		System.out.println("");
		System.out.println("The LEFT SHIFT operator in Java is '<<':");
		// n<<k result in  n=n*(2^k)
		// The binary operation is: shift each bit by k places to the left, and add 0's to the empty places (less significant bits).
		// The sign is untouched.
		System.out.println(" 10<<1 = "+(10<<1));
		System.out.println("-5<<2 = "+(-5<<2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("The RIGHT SHIFT operator in Java is '>>':");
		// n>>k result in  n=n/(2^k)
		// It divides the number/variable by 2^k, where k is the given number on the right.
		// The binary operation is: shift each bit by k places to the right, and add 0's to the empty places (more significant bits).
		// The sign is untouched.
		System.out.println(" 10>>1 = "+(10>>1));
		System.out.println("-20>>2 = "+(-20>>2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("The UNSIGNED RIGHT SHIFT operator in Java is '>>>':");
		// The binary operation is the same of >> but in the end it shifts one more place to the right to add a 0 as the most significative number.
		// It changes negative to positive.
		System.out.println(" 80>>>3 = "+(80>>>3));
		System.out.println("-10>>>1 = "+(-10>>>1)); // in this case will show an Integer(4 bytes) big number because of all the one's to the left 11111111 11111111 11111111 11111010)
		System.out.println("");
		System.out.println("");
		
		// To declare a variable as a binary -10, for example, we can use
		int x = -0b1010;
		
		// To see an Integer number in binary format we can use
		System.out.println(" 10 in binary: "+Integer.toBinaryString(10));
		System.out.println("-10 in binary: "+Integer.toBinaryString(x)); // negative numbers are shown with more bits since the first is 1

		// Merging is setting one or more bits of a binary number as 1 using the OR operator.
		// Merging 15 and 8 in a variable and showing each number
		int a = 0b00000000;
		int b = 0b11111000;
		a=a|b;
		System.out.println("In "+Integer.toBinaryString(a)+" the nibbles numbers are "+Integer.toString(a>>4&0b00001111)+" and "+Integer.toString(a&0b00001111)+".");
		System.out.println("");
		System.out.println("");
		
		
		// Masking is using the AND operator to find out if one or more bits of a binary number is 1.
		// Finding if the 8th and 1st bit of a binary number is 1 using masking
		int c =0b10001010; // to use byte type we need to add cast and put the bitwise operations between round brackets
		System.out.println("In "+Integer.toBinaryString(c)+" the 8th bit is "+((c&0b10000000)>>7)+", and the 1st bit is "+(c&0b00000001)+"."); // the SHIFT precedes the AND
		System.out.println("");
		System.out.println("");
		
		
		// Swapping is using the XOR operator 3 consecutive times to swap the values between two variables without a third variable.
		int X=64, Y=100;
		System.out.println("X was "+X+" and Y was "+Y+".");
		X=X^Y;
		Y=X^Y;
		X=X^Y;
		System.out.println("Now X is "+X+" and Y is "+Y+".");
		
    // Widening or Upcasting is assigning a compatible and smaller type variable(source) into a larger one(destiny), it's done implicitly by the compiler.
    // Narrowing or Downcasting  is assigning a compatible and larger type variable(source) into a smaller one(destiny) by force using casting, it's done explicitly and it might result in some lost data.
    /* Size and compatibility table    
                                      destiny 
                  byte  short int long  float double  char  boolean
        byte        ✓     ✓    ✓    ✓     ✓     ✓      x       x
        short       x     ✓    ✓    ✓     ✓     ✓      x       x
        int         x     x    ✓    ✓     ✓     ✓      ✓       x
source  long        x     x    x    ✓     ✓     ✓      x       x
        float       x     x    x    x     ✓     ✓      x       x
        double      x     x    x    x     x     ✓      x       x
        char        x     x    ✓    ✓     ✓     ✓      ✓       x
        boolean     x     x    x    x     x     x      x       ✓
    
		*/
	}

}
