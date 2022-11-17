import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            System.out.print("#"+tc+" ");
            for(int i=0; i<n; i++) System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
	