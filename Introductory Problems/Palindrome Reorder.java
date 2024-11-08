import java.util.*;
 
public class Codechef {
    public static void helper(Scanner sc, StringBuilder out) {
        String s = sc.nextLine();
        int[] counter = new int[26];
        for (char c : s.toCharArray()) {
            counter[c - 'A']++;
        }
 
        int odds = 0;
        char oddChar = '@';
        for (int i = 0; i < 26; i++) {
            if (counter[i] % 2 != 0) {
                odds++;
                oddChar = (char) (i + 'A');
            }
        }
        if (odds > 1) {
            out.append("NO SOLUTION").append("\n");
            return;
        }
 
        char[] ans = new char[s.length()];
        int idx = 0;
        int endIdx = s.length() - 1;
        for (int i = 0; i < 26; i++) {
            while (counter[i] > 1) {
                ans[idx] = (char) (i + 'A');
                ans[endIdx] = (char) (i + 'A');
                idx++;
                endIdx--;
                counter[i] -= 2;
            }
        }
        if (odds == 1) {
            ans[idx] = oddChar;
        }
 
        for (char c : ans) {
            out.append(c);
        }
        out.append("\n");
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
 
        helper(sc, out);
 
        System.out.print(out);
    }
}
