import java.io.*;
class Rev
{
public static void main(String args[])throws Exception
{
String s;
String rev="";
int f=1;
BufferedReader name=new BufferedReader(new InputStreamReader(System.in));
s=name.readLine();
int len=s.length();
for(int i=len-1; i>=0;i--)
rev=rev+ s.charAt(i);
System.out.println(rev);
if (s.equals(rev))
System.out.println("Entered string is a palindrome.");
else
System.out.println("Entered string is not a palindrome.");
}
}