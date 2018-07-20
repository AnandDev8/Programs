import java.io.*;
import java.net.*;
class TCPServer
{
public static void main(String args[]) throws Exception
{
String clientSentence;
String capitalSentence;
ServerSocket welcomeSocket=new ServerSocket(3456);
while(true)
{
Socket connectionSocket=welcomeSocket.accept();
BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//new DataOutputStream (connectionSocket.getInputStream());
DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
clientSentence=inFromClient.readLine();
capitalSentence=clientSentence.toUpperCase()+'\n';
outToClient.writeBytes(capitalSentence);
}
}
}
