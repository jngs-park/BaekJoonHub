#include <iostream>
#include <vector>
#include <math.h>

#define initIO ios::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL);

using namespace std;

int main() {
    initIO;

    int T, N;
    vector<int> peoples;
    cin >> T;

    for (int test_case = 1; test_case <= T; test_case++) {
        cin >> N;

        peoples.resize(N);
        int min = 100001;
        for (int i = 0; i < N; i++) {
            cin >> peoples.at(i);

            if (min > abs(peoples.at(i))) {
                min = abs(peoples.at(i));
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (abs(peoples.at(i)) == min)
                count++;
        }

        cout << "#" << test_case << " " << min << " " << count << "\n";
    }

    return 0;
}

/* JAVA
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
        	int[] arr = new int[100001];
        	int cnt=0;
        	int min=100000;
        	
        	for(int i=0; i< N; i++) {
        		 arr[Math.abs(sc.nextInt())]++;
        	}
        	for(int i=0; i<100000; i++) {
        		if(arr[i]>0) {
        			if(i<min) {
        				min = i;
        				cnt = arr[i];
        			}
        			
        			
        		}
        	}
        	System.out.println("#"+test_case+" "+min+" "+cnt);
  }
}
}
*/