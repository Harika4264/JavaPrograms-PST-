import java.util.Scanner;
public class BinarySearchExample{
    public static void main(String[] args){
        int[] arr={2,5,8,12,16,23,38,56,72,91};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to search:");
        int key=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index:"+mid);
                found=true;
                break;
            }
            else if(key<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(!found){
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}