import java.util.*;
public class Solution{
        static int longestPalindrome(String s){
        int n=s.length();
        int max=1;
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>=0 && r<n && s.charAt(1)==s.charAt(r)){
                max=Math.max(max,r-l+1);
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                max=Math.max(max,r-l+1);
                l--;
                r++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String doubled=s+s;
        for(int i=0;i<n;i++){
            String rotation=doubled.substring(i,i+n);
            System.out.println(longestPalindrome(rotation));
        }
    }
}