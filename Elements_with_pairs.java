import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,s=0;
        n=sc.nextInt();
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            System.out.printf("%d ",a[i]);
        }
        if(n%2!=0)
        {
            System.out.println("0");
        }
    }
}