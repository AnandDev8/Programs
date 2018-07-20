class PerfectGen
{
   public static void main(String args[])
   {
      int a,r,x,i,num;
      for(a=1;a<=10000;a++)
      {
         x=0;
         for(i=1;i<a;i++)
         {
            r=a%i;
            if(r==0)
            {
               x+=i;
            }
         }
         if(x==a)
         System.out.println(a+"   ");
      }
   } 
}