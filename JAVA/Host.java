import java.io.*;
import java.net.*;
class Host
{String hostname;
public static void main(String args[])throws Exception
{
  InetAddress addr = InetAddress.getByName("192.168.10.164");
  InetAddress addr2 = InetAddress.getByName("CS-164.asas.kh.amrita.edu");
  String host = addr.getHostName();
  System.out.println("Ip address:"+ addr2.getHostAddress());
  System.out.println("Ip address:"+ host);
}
}