import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++)	{	
        	int N = sc.nextInt();
        	int speed =0;
        	int dis =0;
        	for(int i=0; i<N; i++) {
        		int order = sc.nextInt();
        		if(order == 0) {
        			
        		} else if(order == 1) {
        			speed += sc.nextInt();
        		} else if(order ==2) {
        			speed -= sc.nextInt();
        		}
        		if(speed<0) {
        			speed = 0;
        		} 
        			dis += speed;
        	}
        
        		System.out.println("#"+test_case+" "+ dis);
        	
            
            
           
    }
  }
}
