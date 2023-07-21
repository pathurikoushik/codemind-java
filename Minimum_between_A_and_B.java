import java.util.*;
public class codemind
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,b,c,i;
      n=sc.nextInt();
      int[] a=new int[n];
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      b=sc.nextInt();
      c=sc.nextInt();
      int min=99999999;
      for(i=0;i<n;i++)
      {
          if(a[i]>=b && a[i]<=c && a[i]<min)
          {
              min=a[i];
          }
      }
      if(min==99999999)
      System.out.println("-1");
      else
       System.out.println(min);
    }
}