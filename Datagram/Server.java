import java.lang.*;
import java.net.*;
import java.io.*;
/*
  In UDP (User Datagram Packets):
  - there's a single one way communication(packet transferring) between a sender and a receiver;
  - the packet can be lost;
  - both sender/receiver use a datagram socket and a datagram packet;
  - the purpose of the machine client/server doesn't matter.
*/

class Server{

	public static void main(String args[])throws Exception
	{
	  ///////////////////////receiving///////////////////////
	  // create a datagram socket passing the port number to receive/send packets
	  DatagramSocket ds=new DatagramSocket(2500);
		// create an array of bytes big enough to receive a packet
		byte[] b=new byte[1024];
		// create a datagram packet and assign the array of bytes to it (to receive we just need the array and it's length)
		DatagramPacket dp=new DatagramPacket(b,1024); // here we can see the packet sent before is lost (UDP)
		// receive a packet
		ds.receive(dp);
		// create a new string to store the message (getData returns an array of bytes) and trim the empty spaces from the message
		String msg = new String(dp.getData()).trim();		
		System.out.println("From Client: "+msg);
		
	  
		///////////////////////sending///////////////////////
		// create a string builder to reverse the message received
		StringBuilder sb=new StringBuilder(msg);
		sb.reverse();
		msg=sb.toString();
		// assign the reversed message to the datagram packet with the array of bytes, the size, the IP address and the port of who will receive it
		dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2501);
		// send the packet
		ds.send(dp);
		
		//close the datagram socket
		ds.close();	
	}

}
