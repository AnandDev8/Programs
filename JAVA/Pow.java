import java.io.*;
import java.net.*;
class Pow
{
String a,b,pow1;
public static void main(String args[]) throws Exception
{
BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
Socket clientSocket=new Socket("localhost",4567);
DataOutputStream outToServer=new DataOutputStream(clientSocket.getOutputStream());
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
System.out.println("Enter the first number");
a=inFromUser.readLine();
outToServer.writeBytes(a +'\n');
System.out.println("Enter the power ");
b=inFromUser.readLine();
outToServer.writeBytes(b +'\n');
pow1=inFromServer.readLine();
System.out.println("Power:" + pow1);
clientSocket.close();
}
}