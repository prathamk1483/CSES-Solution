import java.io.*;
import java.util.*;

public class Codechef {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long base = 2, ans = 1,MOD = 1000000007;
        while(n > 0){
            if((n&1) == 1){
                ans = (ans*base)%MOD;
            }
            base = base*base%MOD;
            n >>= 1;
        }

        System.out.println(ans);
    }


}
