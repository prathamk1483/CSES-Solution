import java.util.*;
 
public class Codechef {
    public static boolean get(long a, long b) {
        long sum = a + b;
        return sum % 3 == 0 && Math.min(a, b) >= sum / 3;
    }
 
    public static void helper(Scanner sc, StringBuilder out) {
        long a = sc.nextLong();
        long b = sc.nextLong();
 
        boolean ans = get(a, b);
        out.append(ans ? "YES" : "NO");
        out.append("\n");
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            helper(sc, out);
        }
        System.out.print(out);
    }
}
