import java.util.*;
 
public class Codechef {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        while(n > 0){
            ans += n/5;
            n/=5;
        }
 
        System.out.println(ans);
    }
}
