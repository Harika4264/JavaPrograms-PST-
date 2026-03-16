import java.util.*;
class Student{}
class Rockstar{}
class Hacker{}
public class Solution{
    static String count(ArrayList<Object> mylist){
        int student=0;
        int rockstar=0;
        int hacker=0;
        for(Object obj:mylist){
            if(obj instanceof Student) 
            student++;
            if(obj instanceof Rockstar)
            rockstar++;
            if(obj instanceof Hacker)
            hacker++;
        }
        return student + " " + rockstar + " " + hacker;
    }
    public static void main(String[] args){
        ArrayList<Object> mylist=new ArrayList<Object>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            if(s.equals("Student")) mylist.add(new Student());
            else if(s.equals("Rockstar")) mylist.add(new Rockstar());
            else if(s.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}