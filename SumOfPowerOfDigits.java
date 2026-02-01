import java.util.Scanner;
public class SumOfPowerOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int power=sc.nextInt();
        int sum=0;
        n=Math.abs(n);
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,power);
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}