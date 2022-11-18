import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++)	{	
        	int P = sc.nextInt();
        	int Q = sc.nextInt();
        	int R = sc.nextInt();
        	int S = sc.nextInt();
        	int W = sc.nextInt();
        	
        	int A_pay = (W / 1) * P;
        	int B_pay =0;
        	
        	if(W>R) {
        		 B_pay = Q + ((W-R)/1)*S;
        	} else {
        		 B_pay = Q;
        	}
        	
        	if(A_pay > B_pay) {
        		System.out.println("#"+test_case+" "+B_pay);
        	} else {
        		System.out.println("#"+test_case+" "+A_pay);
        	}
        	
  }
}
}