import java.util.*;
public class Solution{
    public static String twoStrings(String s1,String s2){
        HashSet<Character> set=new HashSet<>();
        for(char c:s1.toCharArray())
        {
            set.add(c);
        }
        for(char c:s2.toCharArray())
        {
            if(set.contains(c)){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.println(twoStrings(s1,s2));
        }
        sc.close();
        
    }
}