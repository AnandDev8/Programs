import java.io.*;
import java.net.*;
import java.util.Date;
class Ser
{
public static void main(String args[])throws Exception
{
ServerSocket s=new ServerSocket(5678);
while(true)
{
System.out.println("Connection...");
Socket soc=s.accept();
DataOutputStream out=new DataOutputStream(soc.getOutputStream());
out.writeBytes("server Date:"+new Date().toString()+"\n");
out.close();
soc.close();
}
}
}
