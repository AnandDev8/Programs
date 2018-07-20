import   java.io.*;
import java.net.*;
class RevClient
{
public static void main(String args[])throws Exception
{
String sentence;
String modifiedSentence;
BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
Socket clientSocket=new Socket("localhost",3456);
DataOutputStream outToServer=new DataOutputStream(clientSocket.getOutputStream());
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
sentence=inFromUser.readLine();
modifiedSentence=inFromServer.readLine();
System.out.println("From server:"+ modifiedSentence);
clientSocket.close();
}
}
