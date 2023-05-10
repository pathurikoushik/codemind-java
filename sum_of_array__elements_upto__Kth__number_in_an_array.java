import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,s;
        n=sc.nextInt();
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c+=a[i];
            if(s==a[i])
            {
                break;
            }
        }
        System.out.println(c);
    }
}