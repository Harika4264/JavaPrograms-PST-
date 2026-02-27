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
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int leftDiagonal=0;
        int rightDiagonal=0;
        for(int i=0;i<n;i++){
            leftDiagonal+=arr[i][i];
            rightDiagonal+=arr[i][n-1-i];
        }
        int result=Math.abs(leftDiagonal-rightDiagonal);
        System.out.println(result);
        sc.close();
    }
}
