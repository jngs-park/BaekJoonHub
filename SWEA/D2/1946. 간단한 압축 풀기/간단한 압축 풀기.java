import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
         
        for(int tc = 1; tc <= T; tc++) {
            int num = sc.nextInt();
            int N;
            int sum = 0;
            String arr[] = new String[num];
            int numArr[] = new int[num];
            for(int i = 0; i<num; i++) {
                arr[i] = sc.next();             
                numArr[i] = sc.nextInt();
            }
            int cnt = 0;
            System.out.println("#" + tc + " ");
            for(int i = 0; i<arr.length; i++) {
                for(int j = 0; j<numArr[i]; j++) {
                    System.out.print(arr[i]);
                    cnt++;
                    if(cnt==10) {
                        System.out.println();
                        cnt = 0;
                    }
                }
            }
            System.out.println();
             
             
             
             
             
        }
    }
     
}