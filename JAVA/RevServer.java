import java.io.*;
import java.net.*;
class RevServer
{
public static void main(String args[]) throws Exception
{
String clientSentence;
ServerSocket welcomeSocket=new ServerSocket(6789);
String rev="";
while(true)
{
Socket connectionSocket=welcomeSocket.accept();
BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
clientSentence=inFromClient.readLine();
int len=clientSentence.length();
for(int i=len-1; i>=0;i--)
rev=rev+clientSentence.charAt(i);
if (clientSentence.equals(rev))
outToClient.writeBytes("string is a palindrome");
else
outToClient.writeBytes("string is not a palindrome");
}
}
}
