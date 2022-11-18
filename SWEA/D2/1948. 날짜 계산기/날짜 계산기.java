import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int m1 =sc.nextInt();
            int d1 =sc.nextInt();
            int m2 =sc.nextInt();
            int d2 =sc.nextInt();
            int sum=0;
            int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
            
            System.out.print("#"+test_case+" ");
            if(m2 == m1) {
            	System.out.println(d2-d1+1);
            } else {
            	for(int i=m1; i<m2; i++) {
            		sum += arr[i-1];
            		
            	}
            	sum -= d1;
        		sum += d2;
        		System.out.println(sum+1);
            }
            
            
            
           
    }
  }
}
