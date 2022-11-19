import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int T = 10;
        for(int test_case=1; test_case<=T; test_case++) {
        	int N = sc.nextInt();
        	int[][] arr = new int[N][N];
        	int cnt = 0;
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++) {
        			arr[i][j] = sc.nextInt();
        		}
        	}
        	for(int i=0; i<N; i++) {
        			int sign = 0;
        			
        		for(int j=0; j<N; j++) {
        			if(arr[j][i] == 1) {
        				sign = 1;
        			}
        			else if(arr[j][i] == 2) {
        				if(sign == 1) {
        					sign = 0;
        					cnt++;
        				}
        			}
        			
        		}
        	}
        	System.out.println("#"+test_case+" "+cnt);
        
       
        }
        	
       
        }
        

}