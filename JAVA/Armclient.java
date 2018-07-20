import java.io.*;
import java.net.*;
 
class Armclient {
    public static void main(String args[]) throws Exception
    {
 
      BufferedReader inFromUser =
        new BufferedReader(new InputStreamReader(System.in));
 
      DatagramSocket clientSocket = new DatagramSocket();
 
      InetAddress IPAddress = InetAddress.getByName("localhost");
 
      byte[] sendData = new byte[1024];
      byte[] receiveData = new byte[1024];
	
 	System.out.println("ENTER THE NUMBER");
      String word1 = inFromUser.readLine();
 
      sendData = word1.getBytes();

      DatagramPacket sendPacket =
         new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
 
      clientSocket.send(sendPacket);
 
      DatagramPacket receivePacket =
         new DatagramPacket(receiveData, receiveData.length);
 
      clientSocket.receive(receivePacket);
 
      String result =
          new String(receivePacket.getData());
 
      System.out.println("FROM SERVER:" + result);

      clientSocket.close();
 
    }
}