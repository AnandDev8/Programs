import java.io.*;
import java.net.*;
class UDPcli
{
public static void main(String args[])throws Exception
{
BufferedReader user=new BufferedReader(new InputStreamReader(System.in));
DatagramSocket d1=new DatagramSocket();
bytes[] sendata=new bytes[1024];
bytes[] rdata=new bytes[1024];
InetAddress ip=InetAddress.getByName("localhost")
String word=user.readLine();
sendata=word.getBytes();
DatagramPacket spacket=new DatagramPacket(sendata,sendata.length,ip,6789);
d1.sendPacket(spacket);
DatagramPacket rpacket=new DatagramPacket(rdata,rdata.length);
d1.receivePacket(rpacket);
String cap=new String(rpacket.getData());
System.out.println("From Server:"+ cap);
}
}
