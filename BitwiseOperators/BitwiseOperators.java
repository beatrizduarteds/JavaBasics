import java.util.*;

class BitwiseOperators{
// Bitwise operations are faster, and can be performed only in Integer types.
// In the background this decimal literals/values are represented in binary (with 4 bytes for int, 1 byte for byte, etc), and the operation is done in each pair of bits.
// That's why 10ˇ6 is 14

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
		// It adds 1 and changes the sign
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
		// The sign is untouched
		System.out.println(" 10<<1 = "+(10<<1));
		System.out.println("-5<<2 = "+(-5<<2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("The RIGHT SHIFT operator in Java is '>>':");
		// n>>k result in  n=n/(2^k)
		// It divides the number/variable by 2^k, where k is the given number on the right.
		// The binary operation is: shift each bit by k places to the right, and add 0's to the empty places (more significant bits).
		// The sign is untouched
		System.out.println(" 10>>1 = "+(10>>1));
		System.out.println("-20>>2 = "+(-20>>2));
		
		System.out.println("");
		System.out.println("");
		System.out.println("The UNSIGNED RIGHT SHIFT operator in Java is '>>>':");
		// The binary operation is the same of >> but in the end it shifts one more place to the right to add a 0 as the most significative number
		// It changes negative to positive
		System.out.println(" 80>>>3 = "+(80>>>3));
		System.out.println("-10>>>1 = "+(-10>>>1)); // In this case will show a big integer(4 bytes) number because of all the one's to the left 11111111 11111111 11111111 11111010)
		System.out.println("");
		System.out.println("");
		
		// To declare a varible as a binary -10, for example, we can use:
		int x = -0b1010;
		
		// To see the number in binary format we can use:
		System.out.println(" 10 in binary: "+Integer.toBinaryString(10));
		System.out.println("-10 in binary: "+Integer.toBinaryString(x)); // negative numbers are shown with more bits since the first is 1

	}

}
