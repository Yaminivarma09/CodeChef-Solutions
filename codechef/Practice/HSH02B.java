// Problem: HSH02B
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/hashing/HASH01/problems/HSH02B
// Solved on: 2026-10-09T05:47:20.810Z

import java.util.Scanner;

public class Main {
    static final int M = 999983;

    static int f(int x) {
        return x % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            System.out.println("x = " + x + ", f(x) = " + f(x));
        }
    }
}
