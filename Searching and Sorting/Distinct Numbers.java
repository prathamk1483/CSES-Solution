import java.io.*;
import java.util.*;
 
class Codechef {
    public static void helper(BufferedReader br, StringBuilder out) throws IOException {
        int t = Integer.parseInt(br.readLine());
        Set<Integer> s = new HashSet<>();
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            s.add(Integer.parseInt(st.nextToken()));
        }
        
        out.append(s.size()).append("\n");
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        helper(br, out);
 
        System.out.print(out);
    }
}
