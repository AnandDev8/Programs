import java.io.*;
import java.net.*;
class TCPrev
{
public static void main(String args[])throws Exception
{
String word;
String check;
String stat;
ServerSocket conn=new ServerSocket(6789);
while(true)
{
Socket connect=welcomeSocket.accept();
BufferedReader in=new BufferedReader(new InputStreamReader(connect.getInputStream()));
DataOutputStream out=new DataOutputStream(connect.getOutputStream());
word=in.readLine();
check=word.reverse();
if(word==check)
stat="String is Palindrome";
else
stat="String is not Palindrome";
out.writeBytes(stat);
}
}
}