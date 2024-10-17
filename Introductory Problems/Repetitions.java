import java.util.*;
public class Codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		long a = 1 , t = 1 , g = 1, c =1;
		long max = 1;
		char prev = n.charAt(0);
		for(int i = 1;i<n.length();i++){
			if(n.charAt(i) == prev){
				if(n.charAt(i) == 'A') a++;
				else if(n.charAt(i) == 'T') t++;
				else if(n.charAt(i) == 'G') g++;
				else if(n.charAt(i) == 'C') c++;
			}
			else{
				prev = n.charAt(i);
				a =1;t = 1 ; g = 1 ; c =1;
			}
			max = Math.max(max,Math.max( a, Math.max(t , Math.max(g,c)) ));
		}
		
		System.out.println(max);
	}
}
