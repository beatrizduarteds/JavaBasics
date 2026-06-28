import java.net.*;
import java.io.*;

class Client{

	public static void main(String args[]) throws Exception //handle IO exception
  {
	
		// create a socket client object to connect to the serve by it's IP addres and port number
		Socket skt=new Socket("localhost", 2500); // 10.91.90.93
		
		// create a stream buffer to read from the keyboard
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
		
		// create an object to read the server's message (we need to convert the data types)
    BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
    
    // create an object to write a message to the server
    PrintStream ps = new PrintStream(skt.getOutputStream());
		
		// create the message variable to store the input message
    String msg;
    
    do{
      // get the input message
      msg=kb.readLine();  
      
      // write the message to the server in the output stream
      ps.println(msg);
      
      // read the server's answer
      msg=br.readLine();
      
      // print the server's answer
      System.out.println("From Server: "+msg);
      
    }while(!msg.equals("dne"));  
    
		
	}
}
