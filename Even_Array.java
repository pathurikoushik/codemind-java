import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            s++;
        }
        if(s==n)
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
        sc.close();
    }
}