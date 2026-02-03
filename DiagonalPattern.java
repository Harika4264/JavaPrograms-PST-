public class DiagonalPattern {
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n=arr.length;
        for(int d=0;d<2*n-1;d++){
            int row=d<n?d:n-1;
            int col=d<n?0:d-n+1;
            while(row>=0 && col<n)
            {
                System.out.print(arr[row][col]+ " ");
                row--;
                col++;
            }
        }
    }
}