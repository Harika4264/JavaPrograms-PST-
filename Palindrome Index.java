import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
    public static int palindromeIndex(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                if(isPalindrome(s,left+1,right))
                return left;
                else if(isPalindrome(s,left,right-1))
                return right;
                else
                return -1;
            }
            left++;
            right--;
        }
        return -1;
    }
    private static boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            System.out.println(palindromeIndex(s));
        }
        sc.close();
    }
}