import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int tc = 1; tc <= T; tc++)
        {
            int N = sc.nextInt();
            int[][] a = new int[N][N];
            for(int i=0; i<N;i++){
                for(int j=0; j<N;j++) a[i][j] = sc.nextInt();
            }
            System.out.println("#"+tc+" ");
            for(int i=0; i<N;i++){
                for(int j=0; j<N; j++){
                    System.out.print(a[N-1-j][i]);
                }
                System.out.print(" ");
                for(int j=0; j<N; j++){
                    System.out.print(a[N-1-i][N-1-j]);
                }
                System.out.print(" ");
                for(int j=0; j<N; j++){
                    System.out.print(a[j][N-1-i]);
                }
                System.out.println();
            }
             
        }
    }
}