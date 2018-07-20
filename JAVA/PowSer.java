import java.io.*;
import java.net.*;
class PowSer
{
public static void main(String args[]) throws Exception
{
int a;
int b;
int pow;
String as;
String bs;
String pows;
ServerSocket ws=new ServerSocket(4567);
while(true)
{
Socket cs=ws.accept();
BufferedReader inFromClient=new BufferedReader(new InputStreamReader(cs.getInputStream()));
DataOutputStream out=new DataOutputStream(cs.getOutputStream());
as=inFromClient.readLine();
a=Integer.parseInt(as);
System.out.println(as);
System.out.println(a);
bs=inFromClient.readLine();
b=Integer.parseInt(bs);
System.out.println(bs);
System.out.println(b);
int calc=1;
for (int i=1;i<=b;i++)
{
calc=calc*a;
}
//System.out.println(calc);
pow=calc;
pows=Integer.toString(pow);
out.writeBytes(pows+'\n');
}
}
}