import java.net.*;
import java.io.*;

public class ReverseEcho{
  
  public static void main(String args[]) throws Exception //handle IO exception
  {
    // create a server socket object to connect with the client by the port number
    ServerSocket ss=new ServerSocket(2500);  
    
    // be ready to accept a connection (the 'accept' method returns a socket value)
    Socket skt=ss.accept();
    
    // create an object to read the client's message (we need to convert the data types)
    BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
    
    // create an object to write a message to the client
    PrintStream ps = new PrintStream(skt.getOutputStream());
    
    // create the message variable to store the client's message
    String msg;
    
    // reverse all messages the client sends until 'end' or 'dne' is sent
    do{
      // get the client's message
      msg=br.readLine();  
      
      // reverse the client's message (we can use a builtin reverse method)
      StringBuilder sb=new StringBuilder(msg); // create an object to use the reverse method
      sb.reverse(); // reverse the message
      msg=sb.toString(); // convert to String
      
      // write the reversed message to the client in the output stream
      ps.println(msg);
    }while(!msg.equals("dne"));  
    
    skt.close();
  }

}

