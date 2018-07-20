import java.io.*;
import java.net.*; 
class ArmUDPClient {
    public static void main(String args[]) throws Exception
    {
      BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName("localhost");
      byte[] sendData = new byte[1024];
      byte[] receiveData = new byte[1024];
      System.out.println("Enter the number");
      String no = inFromUser.readLine();
      sendData = no.getBytes();
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
      clientSocket.send(sendPacket);//send datagram to server
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      clientSocket.receive(receivePacket);
      String result = new String(receivePacket.getData());
      System.out.println("FROM SERVER:" + result);
      clientSocket.close();
    }
}