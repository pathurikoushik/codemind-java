import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2!=0)
            {
                c=i;
            }
        }
        System.out.printf("%d",c);
    }
}