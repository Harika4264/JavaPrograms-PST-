import java.util.Scanner;
public class SumOfNonPrimeIndex {
    static boolean isPrime(int n){
        if(n<=1)
        return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(!isPrime(i)){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of non-prime index values:"+sum);
    }
}