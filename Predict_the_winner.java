import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        int i,m=n/2,s=0,t=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i<=m)
            {
                s+=a[i];
            }
            else
            {
                t+=a[i];
            }
        }
        if(Math.abs(s-t)%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}