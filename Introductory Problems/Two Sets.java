import java.io.*;
import java.util.*;

public class Codechef {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(int a, int b) {
        return (long) a * (b / gcd(a, b));
    }

    static long modPow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }
        return primes;
    }
    static void inputArray(Object arr, int n) {
        FastReader sc = new FastReader();
        if (arr instanceof int[]) {
            for (int i = 0; i < n; i++) {
                ((int[]) arr)[i] = sc.nextInt();
            }
        } else if (arr instanceof long[]) {
            for (int i = 0; i < n; i++) {
                ((long[]) arr)[i] = sc.nextLong();
            }
        } else if (arr instanceof double[]) {
            for (int i = 0; i < n; i++) {
                ((double[]) arr)[i] = sc.nextDouble();
            }
        } else if (arr instanceof String[]) {
            for (int i = 0; i < n; i++) {
                ((String[]) arr)[i] = sc.nextLine();
            }
        } else if (arr instanceof char[]) {
            String line = sc.nextLine();
            for (int i = 0; i < n && i < line.length(); i++) {
                ((char[]) arr)[i] = line.charAt(i);
            }
        } else if (arr instanceof boolean[]) {
            for (int i = 0; i < n; i++) {
                ((boolean[]) arr)[i] = sc.nextInt() != 0;
            }
        }
    }


    private static void helper(Scanner sc, StringBuilder out){
        int n = sc.nextInt();
        int arr[] = new int[n];
        inputArray(arr,n);
        //write your code here


        out.append("\n");
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        StringBuilder finaloutput = new StringBuilder();


        long n = sc.nextLong();
        long sum = (1L*n*(1L*(n+1)))/2;
        if(sum%2 == 0){
            sum/=2;
            finaloutput.append("YES").append("\n");
            List<Long> a1 = new ArrayList<>();

            while(sum > n){
                a1.add(n);
                sum-=n;
                n--;
            }
            a1.add(sum);
            finaloutput.append(a1.size()).append("\n");
            for(long i: a1) finaloutput.append(i).append(" ");
            finaloutput.append("\n");
            finaloutput.append(n-1).append("\n");
            while(n > 0){
                if(sum != n){
                    finaloutput.append(n).append(" ");
                }
                n--;
            }
            finaloutput.append("\n");
        }
        else finaloutput.append("NO").append("\n");
        out.println(finaloutput);
        out.flush();
    }
}
