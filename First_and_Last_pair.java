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
        }
        i=0;
        int j=n-1;
        while(i<j)
        {
            System.out.printf("%d %d ",a[i],a[j]);
            i+=1;
            j-=1;
        }
        if(n%2!=0)
        {
            System.out.printf("%d 0",a[i]);
        }
    }
}