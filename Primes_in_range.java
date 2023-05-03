import java.util.Scanner;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int c=0;
       for(int i=a;i<=b;i++)
       {
           if(i==1)
           {
               continue;
           }
           else
           {
               int d=0;
               for(int j=2;j*j<=i;j++)
               {
                   if(i%j==0)
                   {
                       d+=1;
                   }
               }
               if(d==0)
               {
                   c+=1;
               }
           }
       }
       System.out.println(c);
    }
}