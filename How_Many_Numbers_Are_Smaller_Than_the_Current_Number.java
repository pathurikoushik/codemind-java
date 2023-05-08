import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int c=0;
            for(j=0;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    c++;
                }
            }
            System.out.printf("%d ",c);
        }
    }
}