class Perfect
{
   public static void main(String args[])
   {
      int a,r,x=0,i;
      for(i=1;i<a;i++)
      {
         r=a%i;
         if(r==0)
         {
            x+=i;
         }
      }
      if(x==a)
      System.out.println(a+" is a perfect number");
      else
      System.out.println(a+" is not a perfect number");
   } 
}