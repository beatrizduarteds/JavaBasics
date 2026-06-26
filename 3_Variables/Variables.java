import java.lang.*;

class Variables{
  public static void main(String[] args){
    byte b = -128;
    short s = 32767;
    float f = 3.4e38f; // Or "float f = (float)3.4E+38;"
    double d = 88.1; // Default, it works without casting.
    char c = '\u00C7'; //See Unicode character table at https://character-table.netlify.app/brazilian-portuguese/#character-table
    boolean bool = true; // It must be exactly the lowercase letters only, "false" or "true" words.
    System.out.println("Look at the value of different data type variables:");
    System.out.println("byte variable = "+b);
    System.out.println("short variable = "+s);
    System.out.println("float variable = "+f);
    System.out.println("double variable = "+d);
    System.out.println("char variable = "+c);
    System.out.println("boolean variable = "+bool);
  }
}
