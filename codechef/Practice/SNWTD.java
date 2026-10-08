// Problem: SNWTD
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/binary-search-new/BINARYSP07/problems/SNWTD?tab=statement
// Solved on: 2026-10-08T17:34:51.662Z

import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    static int getDigitSum(int num) 
    {
        int sum=0;
        while(num>0) 
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        FastScanner sc=new FastScanner(System.in);
        while(true) 
        {
            String nStr=sc.next();
            if(nStr==null) 
            break;
            int N=Integer.parseInt(nStr);
            int[] A=new int[N];
            for(int i=0;i<N;i++) 
            {
                A[i]=sc.nextInt();
            }
            int D=sc.nextInt();

            int ans=-1;
            for(int i=0;i<N;i++) 
            {
                if(getDigitSum(A[i])==D) 
                {
                    ans=A[i];
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    static class FastScanner 
    {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int head = 0;
        private int tail = 0;
        public FastScanner(InputStream stream) 
        {
            this.stream = stream;
        }

        private int read() 
        {
            if (head >= tail) {
                try { head = 0; tail = stream.read(buf, 0, buf.length); }
                catch (IOException e) { return -1; }
                if (tail <= 0) return -1;
            }
            return buf[head++];
        }

        public String next() {
            int c = read();
            while (c <= 32) { if (c == -1) return null; c = read(); }
            StringBuilder res = new StringBuilder();
            while (c > 32) { res.appendCodePoint(c); c = read(); }
            return res.toString();
        }

        public int nextInt() {
            int c = read();
            while (c <= 32) { if (c == -1) throw new InputMismatchException(); c = read(); }
            int sgn = 1;
            if (c == '-') { sgn = -1; c = read(); }
            int res = 0;
            while (c > 32) {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            }
            return res * sgn;
        }
    }
}