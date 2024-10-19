import java.io.*;
import java.util.*;

public class Codechef {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            long r = Long.parseLong(line[0]);
            long c = Long.parseLong(line[1]);

            long max = Math.max(r, c);

            if (max % 2 == 0) {
                if (max == r) {
                    output.append(max * max - c + 1).append("\n");
                } else {
                    output.append((max - 1) * (max - 1) + r).append("\n");
                }
            } else {
                if (max == r) {
                    output.append((max - 1) * (max - 1) + c).append("\n");
                } else {
                    output.append(max * max - r + 1).append("\n");
                }
            }
        }

        System.out.print(output);
    }
}
