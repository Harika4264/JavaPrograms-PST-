import java.util.*;
public class Main{
    public static int minExercises(int E,int[] A){
        List<Integer> list=new ArrayList<>();
        for(int a:A){
            list.add(a);
            list.add(a);
        }
        list.sort(Collections.reverseOrder());
        int count=0;
        for(int val:list){
            E-=val;
            count++;
            if(E<=0){
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int E=sc.nextInt();
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(minExercises(E,A));
    }
}