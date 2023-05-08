import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,i,d;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        d=(int)Math.log10(a[i])+1;
        if(d%2==0)
        {
            c++;
        }
        }
        if(c==0)
        System.out.print("-1");
        else
        System.out.print(c);
    }
}