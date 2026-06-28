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

class Client{

	public static void main(String args[])throws Exception
	{
		///////////////////////sending///////////////////////
		// create a datagram socket passing the port number to send/receive packets
		DatagramSocket ds=new DatagramSocket(2501);
		// create a message to be in the packet
		String msg="Hello Earth";
		// create a datagram packet with the packet(array of bytes), the size, the IP address and the port of who will receive it
		DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2500);
		// send the packet
		ds.send(dp);
		
		///////////////////////receiving///////////////////////
		// create an array of bytes big enough to receive a packet
		byte[] b=new byte[1024];
		// assign the array of bytes to the datagram packet (to receive we just need the array and it's length)
		dp=new DatagramPacket(b,1024); // here we can see the packet sent before is lost (UDP)
		// receive a packet
		ds.receive(dp);
		// create a new string to store the message (getData returns an array of bytes) and trim the empty spaces from the message
		msg = new String(dp.getData()).trim();		
		System.out.println("From Server: "+msg);
		
		ds.close();	
	}

}
