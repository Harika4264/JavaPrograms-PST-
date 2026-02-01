import java.util.Scanner;
public class DigitsumOpt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.print("Enter choice (even/odd):");
        String choice=sc.next();
        int sum=0;
        n=Math.abs(n);
        while(n>0){
            int digit=n%10;
            if(choice.equalsIgnoreCase("even") && digit%2==0){
                sum+=digit;
            }
            n/=10;
        }
        System.out.println("Sum of" + choice + "digits=" + sum);
        sc.close();
    }
}