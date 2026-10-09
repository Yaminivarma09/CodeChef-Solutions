// Problem: HSH05
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/hashing/HASH01/problems/HSH05?tab=statement
// Solved on: 2026-10-09T06:08:37.620Z

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int MX = 10001;
        int[] Hash = new int[MX];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if((long)a[i]*a[i]<MX)
            {
            c=c+Hash[a[i]*a[i]];
            }
            Hash[a[i]]++;
        }
          System.out.println(c);
        //Write your solution here
    }
}
