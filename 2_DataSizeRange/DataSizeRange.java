import java.lang.*;

class DataSizeRange{
  public static void main(String[] args){
    System.out.println("Primitive data type: "+Byte.TYPE);
    System.out.println("Minimum value: "+Byte.MIN_VALUE);
    System.out.println("Maximum value: "+Byte.MAX_VALUE);
    System.out.println("Size in bytes: "+Byte.BYTES);
    System.out.println("Size in bits: "+Byte.SIZE);
    //You can change "Byte" to Short/Integer/Long/Float/Character to see about other data types
    
    System.out.println("---------------------------------------------------");
    System.out.println("Primitive data type: "+Boolean.TYPE);
    System.out.println("Possible values: "+Boolean.FALSE+ " "+Boolean.TRUE);
  }
}
