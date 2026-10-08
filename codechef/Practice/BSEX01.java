// Problem: BSEX01
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/binary-search-new/BINARYSP07/problems/BSEX01?tab=statement
// Solved on: 2026-10-08T17:28:14.783Z

import java.util.Scanner;

public class Main {
    public static boolean searchMatrix(int[][] matrix, int rows, int cols, int target) {
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int[][] matrix=new int[N][M];
        for(int i=0;i<N;i++) 
        {
            for (int j=0;j<M;j++) 
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        if(searchMatrix(matrix,N,M,target)) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }

    }
}
