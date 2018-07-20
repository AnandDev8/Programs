import java.io.*;
import java.net.*; 
class PalindromeUDPClient {
    public static void main(String args[]) throws Exception
    {
      BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));//create input stream
      DatagramSocket clientSocket = new DatagramSocket();//create client socket
      InetAddress IPAddress = InetAddress.getByName("localhost");//translate hostname to ip address using DNS
      byte[] sendData = new byte[1024];
      byte[] receiveData = new byte[1024];
      String word1 = inFromUser.readLine();
      sendData = word1.getBytes();
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);//create datagram with data-to-send, length,ip address,port
      clientSocket.send(sendPacket);//send datagram to server
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      clientSocket.receive(receivePacket);//read datagram from server
      String result = new String(receivePacket.getData());
      System.out.println("FROM SERVER:" + result);
      clientSocket.close();
    }
}