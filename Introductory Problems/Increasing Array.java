import java.util.*;
public class Codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];

		for(int i=0;i<n;i++) arr[i] = sc.nextLong();
		if(n == 1){
			System.out.println(0);
			return;
		}
		long prev = arr[0];
		long ans = 0;
		for(int i=1;i<n;i++){
			if(prev > arr[i]){
				ans += (prev -arr[i]);
				arr[i] += (prev-arr[i]);
			}
			prev = arr[i];
		}
		System.out.println(ans);
	}
}
