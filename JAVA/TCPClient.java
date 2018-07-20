import  java.io.*;
import java.net.*;
class TCPClient
{
String sentence;
String modifiedSentence;
public static void main(String args[])
{

BufferedReader inFromUser=new InputStreamReader(System.in);
Socket clientSocket=new Socket("localhost",3456);
DataOutputStream outToServer=new DataOutputStream(clientSocket.getOutputStream());
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getinputStream()));
sentence.inFromUser.readLine();
outToserver.writeBytes(sentence+'\n');
modifiedSentence=inFromServer.readLine();
System.out.println("From server:"+ modifiedSentence);
clientSocket.close();
}
}