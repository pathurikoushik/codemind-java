import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int nums:a)
        {
            if(nums<n)
            b[nums]++;
        }
        int sum=0,c=0;
        for(i=1;i<n;i++)
        {
            if(b[i]==i)
            {
                sum+=b[i];
                c++;
            }
        }
        if(c==0)
        System.out.println("-1");
        else
        System.out.printf("%.2f",(float)sum/c);
    }
}