import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,b,c,s=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<b || a[i]>c)
            {
                s+=a[i];
            }
        }
        System.out.println(s);
    }
}