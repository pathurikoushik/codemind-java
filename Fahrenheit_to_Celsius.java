import java.util.*;
public class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        double b=(a-32)/1.8;
        System.out.printf("%.2f",b);
        sc.close();
}
}