// Problem: HSH09
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/hashing/HASH02/problems/HSH09?tab=statement
// Solved on: 2026-10-09T06:23:45.292Z

import java.util.Scanner;

public class Main {
    static final int M = 999983;
    static final int MX = 1000000000;

    static int[] Hash = new int[M];

    // Hash Function
    static int f(int x) {
        return x % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int c=0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
   
        long ans = 0; // Use long for ans to avoid overflow
        for (int i = 0; i < n; i++) {
            if (a[i] > -31623 && a[i] < 31623) {
                ans += Hash[f(a[i] * a[i])];
            }
            Hash[f(a[i])]++;
        }

        System.out.println(ans);
        
        // Write your code here
    }
}
