import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,b,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        b=s/n;
        for(i=0;i<n;i++)
        {
            if(a[i]<=b)
            {
              c++;
            }
        }
        System.out.printf("%d",c);
        sc.close();
    }
}