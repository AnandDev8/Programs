import java.io.*;
import java.net.*;
class UDPSer
{
public static void main(String args[])throws Exception
{
DatagramSocket ser=new DatagramSocket(6789);
byte[] rdata=new byte[1024];
byte[] sdata=new byte[1024];
while(true)
{
DatagramPacket rp=new DatagramPacket(rdata,rdata.length);
serverSocket.receive(rp);
String sen=new String(rp.getData());
 InetAddress IPAddress = receivePacket.getAddress();
int port =rp.getPort();
String cap=sen.toUpperCase();
sdata= cap.getBytes();
DatagramPacket sendPacket =new DatagramPacket(sendData, sendData.length, IPAddress,port);
ser.send(sPacket); 

}