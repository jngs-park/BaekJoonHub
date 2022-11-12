import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = 0;
        for (int a = 1; a <= n; a++) {
            
            b = b + a;
        } System.out.println(b);
            
        
    }
}