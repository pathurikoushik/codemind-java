import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int m=n,i;
        int[] a=new int[n];
        int[] b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        int j,k;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        int s=0;
        for(i=0;i<n;i++)
        {
            int c=0;
            for(j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    c++;
                }
            }
            s+=c/2;
        }
        System.out.println(s);
    }
}