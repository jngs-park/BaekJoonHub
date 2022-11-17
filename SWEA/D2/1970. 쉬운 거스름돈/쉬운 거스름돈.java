import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int test = sc.nextInt();
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int[] b = new int[a.length];
			
			System.out.println("#"+t);
			
			for(int i = 0; i < b.length; i++) {
				b[i] = n / a[i];
				n = n % a[i];
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
	}
}