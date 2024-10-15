import java.util.*;
public class Codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean visited[] = new boolean[n+1];
		for(int i=0;i<n-1;i++){
			visited[sc.nextInt()] = true;
		}
		for(int i=1;i<=n;i++){
			if(!visited[i]){
				System.out.println(i);
			}
		}
	}
}
