// Problem: DSAAGP59B
// Platform: codechef
// Language: import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n and k
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Read the string
        String s = sc.next();
        
        // TreeMap maintains keys in sorted (lexicographical) order automatically
        TreeMap<Character, Integer> mp = new TreeMap<>();
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        // Print characters with a frequency greater than or equal to k
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() >= k) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
        
        sc.close();
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/hashing/HASH04/problems/DSAAGP59B?tab=solution
// Solved on: 2026-10-10T17:02:53.557Z

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n and k
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Read the string
        String s = sc.next();
        
        // TreeMap maintains keys in sorted (lexicographical) order automatically
        TreeMap<Character, Integer> mp = new TreeMap<>();
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        // Print characters with a frequency greater than or equal to k
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() >= k) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
        
        sc.close();
    }
}