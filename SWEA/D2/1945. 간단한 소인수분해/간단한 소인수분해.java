import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++)	{	
        	int n = sc.nextInt();
        
        	int a=0;
        	int b=0;
        	int c=0;
        	int d=0;
        	int e=0;
        	
        	int tmp =n;
        	
        	while(tmp%2==0) {
        		a++;
        		tmp/=2;
        	}
        	tmp = n;
			while(tmp%3 == 0) {
				b++;
				tmp /= 3;
			}
			
			tmp = n;
			while(tmp%5 == 0) {
				c++;
				tmp /= 5;
			}
			
			tmp = n;
			while(tmp%7 == 0) {
				d++;
				tmp /= 7;
			}
			
			tmp = n;
			while(tmp%11 == 0) {
				e++;
				tmp /= 11;
			}
			
			System.out.println("#"+test_case+" "+a+" "+b+" "+c+" "+d+" "+e);
            
            
           
    }
  }
}