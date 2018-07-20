import java.io.*;
import java.net.*;
 
class Armserver {
  public static void main(String args[]) throws Exception
    {
      
      DatagramSocket serverSocket = new DatagramSocket(9876);
 
      byte[] receiveData = new byte[1024];
      byte[] sendData  = new byte[1024];
 
      while(true)
        {
 	  int sum=0;
          DatagramPacket receivePacket =
             new DatagramPacket(receiveData, receiveData.length);
 
          serverSocket.receive(receivePacket);
		
         String word1 = new String(receivePacket.getData());
		word1=word1.trim();
          int n = Integer.parseInt(word1);
	  int s=n;
          int r;
 	  while(n>0)
	  {
		r=n%10;
		sum=sum+r*r*r;
		n=n/10;
	  }
         InetAddress IPAddress = receivePacket.getAddress();
	int port = receivePacket.getPort();
       String result;
	if(sum==s)
	{
		result="ARMSTRONG";
	}
	else
	{
		result="Not-ARMSTRONG ";
	}
          
          sendData = result.getBytes();
 
          DatagramPacket sendPacket =
             new DatagramPacket(sendData, sendData.length, IPAddress,
                               port);
 
          serverSocket.send(sendPacket);
        }
    }
}
 