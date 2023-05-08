import java.util.*;
public class Codmind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i+=2)
        {
            for(int j=0;j<a[i];j++)
            {
                System.out.printf("%d ",a[i+1]);
            }
        }
    }
}