import java.io.*;
import java.net.*;
class TCPrev
{
String word1;
String chk;
public static void main(String args[])
{
BufferedReader user=new BufferedReader(new InputStreamReader(System.in));
Socket cli=new Socket("localhost",6789);
DataOutputStream out=new DataOutputStream(cli.getOutputStream());
BufferedReader in=new BufferedReader(new InputStreamReader(cli.getInputStream()));
chk=in.readLine();
System.out.println("From server:"+ chk);
cli.close();
}
}
