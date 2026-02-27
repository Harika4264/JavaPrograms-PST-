import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result{
    public static int alternatingCharacters(String s){
        int deletions=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                deletions++;
            }
        }
        return deletions;
    }
}
public class Solution{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(Result.alternatingCharacters(s));
        }
        sc.close();
    }
}
