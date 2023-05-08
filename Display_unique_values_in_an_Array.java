import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.printf("%d ",a[i]);
                 d=1;
            }
        }
        if(d==0)
        {
            System.out.println("-1");
        }
    }
}