import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
	
		for(int test_case = 1; test_case <= 10; test_case++)
		{            
		    int num = sc.nextInt();
            int[][] arr = new int[8][8];
            int count = 0;
            int tmp = 0;
            
            for (int i = 0; i < 8; i++) {
                 String str = sc.next();
            for ( int j = 0; j < 8; j++) {
                     arr[i][j] = str.charAt(j);
                     }
            }
                            
             for (int i = 0; i < 8; i++) {
                 for (int j = 0; j < 8 - num + 1; j++) {
                     tmp = 0;
                     for (int k = 0; k < num/2; k++) {
                         if (arr[i][j + k] != arr[i][j + num - 1 - k]) {
                             tmp = -1;
                         }
                     }
                         if (tmp == 0) {
                             count++;
                         }
                     }
                 } //가로
             
                for(int i =0; i < 8 - num + 1; i++) {
                for(int j = 0; j < 8 ; j++) {
                     tmp =0;
                    for(int k=0;k< num / 2; k++ ) {
                        if(arr[ i + k ][ j ]!=arr[ i +num - 1 - k ][ j]) {
                            tmp =-1;
                        }
                    }
                    if(tmp ==0) {
                        count++;
                    }//세로
                    
                }
            }
                 System.out.println("#" + test_case + " " + count);                      
		}
	}
}