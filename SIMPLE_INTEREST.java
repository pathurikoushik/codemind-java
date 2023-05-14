import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        int b=(p*t*r)/100;
        System.out.printf("%d",b);
        sc.close();
}
}