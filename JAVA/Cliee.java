import java.io.*;
import java.net.*;
class Cliee
{
String ip;
public static vodi main(String args[])throws Exception
{
BufferedReader ipget=new BufferedReader(new InputStreamReader(System.in));
Socket cli=new Socket(5678);
DataOutputStream out=new DataOutputStream(cli.getOutputStream());
BufferedReader in=new BufferedReader(new InputStreamReader(cli.getinputStream()));
ip=in.writeBytes();
System.out.println("Hostname:"+ip);
cli.close();
}
}

