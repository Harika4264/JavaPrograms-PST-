import java.util.Scanner;
public class SumOfLastDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lastDigitA=Math.abs(a%10);
        int lastDigitB=Math.abs(b%10);
        int sum=lastDigitA+lastDigitB;
        System.out.println(sum);
        sc.close();
    }
}