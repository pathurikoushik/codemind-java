import java.util.*;
public class codemind
{
    public static int gcd(int d, int e)
    {
        while(e>0){
            if(d>e){
                int temp=e;
                e = d;
                d = temp;
            }
            e%=d;
        }
        return d;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= s.nextInt();
        }
        int res=arr[0];
        for(int i: arr){
            res = gcd(res, i);
        }
        System.out.println(res);
    }
}