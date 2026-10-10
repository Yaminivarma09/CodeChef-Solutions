// Problem: HASHP02
// Platform: codechef
// Language: public static int longestPalindromeLength(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    for (char ch : s.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }
    
    int length = 0;
    boolean oddFound = false;
    for (int count : freq.values()) {
        if (count % 2 == 0) {
            length += count;
        } else {
            length += count - 1;
            oddFound = true;
        }
    }
    if (oddFound) {
        length += 1;
    }
    return length;
}
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/hashing/HASH04/problems/HASHP02?tab=solution
// Solved on: 2026-10-10T17:03:37.960Z

public static int longestPalindromeLength(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    for (char ch : s.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }
    
    int length = 0;
    boolean oddFound = false;
    for (int count : freq.values()) {
        if (count % 2 == 0) {
            length += count;
        } else {
            length += count - 1;
            oddFound = true;
        }
    }
    if (oddFound) {
        length += 1;
    }
    return length;
}
