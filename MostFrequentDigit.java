import java.util.Scanner;
public class MostFrequentDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        long n=sc.nextLong();
        int[] freq=new int[10];
        while(n>0){
            int digit=(int)(n%10);
            freq[digit]++;
            n/=10;
        }
        int maxFreq=0;
        int resultDigit=0;
        for(int i=0;i<10;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                resultDigit=i;
            }
        }
        System.out.println("Most frequently occurring digit:"+ resultDigit);
    }
}