import java.io.*;
import java.net.*;
 
class PalindromeUDPServer {
  public static void main(String args[]) throws Exception
    {
      
      DatagramSocket serverSocket = new DatagramSocket(9876);//create datagram socket to 9876
 
      byte[] receiveData = new byte[1024];
      byte[] sendData  = new byte[1024];
 
      while(true)
        {
 	  int i,j=0;
          DatagramPacket receivePacket =
             new DatagramPacket(receiveData, receiveData.length);
 
          serverSocket.receive(receivePacket);
 
          String word1 = new String(receivePacket.getData());
		word1=word1.trim();
	  String[] array = new String[word1.length()];
 	  for(i = 0; i < word1.length(); i++)
	  {
		array[i] = String.valueOf(word1.charAt(i));
	  }
          InetAddress IPAddress = receivePacket.getAddress();//Get ip address port #, of sender
 
          int port = receivePacket.getPort();//Get ip address port #, of sender
			
		i=0;
		j=word1.length()-1;
		System.out.println("j" + j);
		while (i<word1.length())
		{
			if(array[i].equals(array[j]))
			{
				i++;
				j--;
			}
			else
			{
				break;
			}

		}
		String result;
 		if(i==word1.length())
                {
			result="palindrome";
		}
		else
                {
			result="not a palindrome";
		}
		
          sendData = result.getBytes();
 
          DatagramPacket sendPacket =
             new DatagramPacket(sendData, sendData.length, IPAddress,
                               port);//create datagram to send to client
 
          serverSocket.send(sendPacket);//write out datgram to socket
        }//End of while loop, loop back and wait for another datagram
    }
}
 