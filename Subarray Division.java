import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        for(int i=0;i<=n-m;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum+=s[j];
            }
            if(sum==d){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
