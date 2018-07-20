import java.io.*;
import java.net.*;
 
class ArmUDPServer {
  public static void main(String args[]) throws Exception
    {
      DatagramSocket serverSocket = new DatagramSocket(9876);//create datagram socket to 9876
 
      byte[] receiveData = new byte[1024];
      byte[] sendData  = new byte[1024];
      int n;
      String result;
      while(true)
        {
 	  int i,j=0;
          int n1,n2,n3,n4;		
          DatagramPacket receivePacket =new DatagramPacket(receiveData, receiveData.length);
          serverSocket.receive(receivePacket);
          String no = new String(receivePacket.getData());
	  no=no.trim();
	  n=Integer.parseInt(no);
	  int s;
	  System.out.println(n);
          InetAddress IPAddress = receivePacket.getAddress();
          int port = receivePacket.getPort();
	  int r=0;
	  n1=n%10;
	  n2=n/10;
	  n3=n2%10;
	  n4=n2/10;
	   System.out.println(n1);
	System.out.println(n3);
	System.out.println(n4);
	  if(((n4*n4*n4)+(n3*n3*n3)+(n1*n1*n1))==n)
                {
			result="Arm";
		}
		else
                {
			result="not a Arm";
		}
          sendData = result.getBytes();
          DatagramPacket sendPacket =new DatagramPacket(sendData, sendData.length, IPAddress, port);
          serverSocket.send(sendPacket);
        }
    }
}
 