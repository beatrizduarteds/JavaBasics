import java.lang.*;
import java.net.*;
import java.io.*;


public class ReverseEcho extends Thread{

  Socket sktThread;

  public ReverseEcho(Socket skt)
  {
    sktThread = skt;
  }

  public void run(){
    try{
      // create an object to read this client's message (we need to convert the data types)
      BufferedReader br=new BufferedReader(new InputStreamReader(sktThread.getInputStream()));
      
      // create an object to write a message to this client
      PrintStream ps = new PrintStream(sktThread.getOutputStream());
      
      // create the message variable to store this client's message
      String msg;
      
      // reverse all messages this client sends until 'end' or 'dne' is sent
      do{
        // get this client's message
        msg=br.readLine();  
        
        // reverse this client's message (we can use a builtin reverse method)
        StringBuilder sb=new StringBuilder(msg); // create an object to use the reverse method
        sb.reverse(); // reverse the message
        msg=sb.toString(); // convert to String
        
        // write the reversed message to this client in the output stream
        ps.println(msg);
      }while(!msg.equals("dne"));
      
      sktThread.close();
      
    }catch(Exception e){}
    
  }

  
  public static void main(String args[]) throws Exception
  {
    // create a server socket object to connect with each client by the port number
    ServerSocket ss=new ServerSocket(2500);
    
    // reference a client socket
    Socket skt;
    
    // reference a client socket thread
    ReverseEcho re;
    
    // create a variable to count the number of clients
    int count=1;

      do{
        // be ready to accept a connection (the 'accept' method returns a socket value)
        skt=ss.accept();
        System.out.println("A new client just arrive! Client count: "+count++);
        
        // create a new socket thread for this client
        re=new ReverseEcho(skt);
        
        // start this client socket thread
        re.start();
                
      }while(true); // since the program will not pass this line (infinite loop) we don't need to close the ss after that
  }
}
