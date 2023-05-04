import java.util.*;
public class Codemind
{
    static int pal(int a)
    {
        int b,t=a,r=0;
        while(t!=0)
        {
            b=t%10;
            t=t/10;
            r=r*10+b;
        }
        if(r==a)
        {
            return 1;
        }
        else
        return 0;
    }
    static int prime(int a)
    {
        if(a==1)
        {
            return 0;
        }
        int i;
        for(i=2;i*i<=a;i++)
        {
            if(a%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        for(i=a+1;;i++)
        {
            if(pal(i)==1&&prime(i)==1)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}