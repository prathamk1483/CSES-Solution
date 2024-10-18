//////////////////////////////////////////////////////////////////////             THIS IS THE WORKING SOLUTION           /////////////////////////////////////////////////////////////////////

import java.util.*;
public class Codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		if(n == 2 || n == 3){
			System.out.print("NO SOLUTION");
			return;
		}
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i += 2) sb.append(i).append(" ");
        for (int i = 1; i <= n; i += 2) sb.append(i).append(" ");
        System.out.print(sb.toString());
		return;
	}
}




//////////////////////////////////////////////////////////////////////             THIS GIVES TLE                  ////////////////////////////////////////////////////////////////////////////////////




import java.util.*;
public class Codechef{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		if(n == 2 || n == 3){
			System.out.print("NO SOLUTION");
			return;
		}
		for(long i=2;i<=n;i+=2)	System.out.print(i+" ");
		for(long i=1;i<=n;i+=2)	System.out.print(i+" ");
		
		return;
	}
}
