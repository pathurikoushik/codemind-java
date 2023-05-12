import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,b;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                c++;
            }
        }
        System.out.printf("%d",c);
        sc.close();
    }
}