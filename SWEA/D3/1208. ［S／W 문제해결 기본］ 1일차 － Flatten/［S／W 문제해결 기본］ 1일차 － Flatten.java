import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 10;
        for(int test_case=1; test_case<=T; test_case++) {
        	
        	int N =sc.nextInt();
        	int[] arr = new int[100];
        	int cnt=0;
        	
        	
        	for(int i=0; i<100; i++) {
        		arr[i] = sc.nextInt();
        		
        	}
        	Arrays.sort(arr);
        	
        	for(int i =0; i<N; i++) {
        	
        	arr[0]++;
        	arr[99]--;
        	Arrays.sort(arr);
        	cnt = arr[99] - arr[0];
        		  
        	
        	}
        	System.out.println("#"+test_case+" "+cnt);
        		
        		
        	
        	
        }
}
}