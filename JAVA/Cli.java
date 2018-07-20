import java.io.*;
import java.net.*;
class Cli
{
public static void main(String args[]) throws Exception
{
Socket soc=new Socket("localhost",5678);
BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
System.out.println(in.readLine());
}
}
