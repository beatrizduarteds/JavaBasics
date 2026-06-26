import java.lang.*;

class Arithmetic {
    public static void main(String[] args) {
        // Examples of type manipulation
        byte a = 10;
        short b = 20;
        float c = 30.3f;
        long d = 40l;
        double e = 100.100;
        char i = 40;
        // The result type will be always equal to the largest type of the category, e. g. arithmetic between short and byte will result in a int.
        int f = b/a; // long works too because it is larger than int
        float g = c + d; // double works too because it is larger than float
        double h = c + e;
        int j = i + f; // long works too because it is larger than int
        
        // Precedence examples
        System.out.println(10+10/2); // equals to 15
        System.out.println(10/2*5); // equals to 25, with * and / (same precedence) the process is left to right
        System.out.println(10/(2*5)); // equals to 1
        
        
    }
    
}

