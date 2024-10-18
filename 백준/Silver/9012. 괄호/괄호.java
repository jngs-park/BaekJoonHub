import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static int T;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			char[] temp = br.readLine().toCharArray();
			int check = 0;
			
			for(char a : temp) {
				if(check >= 0) {
				if(a == '(') {
					check += 1;
				}else if(a == ')'){
					check -= 1;
				}
				}else {
					break;
				}
			}
			
			if(check == 0)
				sb.append("YES").append("\n");
			else
				sb.append("NO").append("\n");
			
		}
		System.out.println(sb);
		}	
}