class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;    // 곱샘이니 1 로 초기화 시켜줘야한다.!
        
        for(int i=0; i<num_list.length; i++) {
        	sum += num_list[i];
        	mul *= num_list[i];
        }
        if( mul < (sum*sum) ) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        return answer;
    }
}