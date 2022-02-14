package Stack_Queue;

// 주식개발

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        int sec=0;
        
        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
	            if(prices[i] <= prices[j]) {
	                sec++;
	            } else if(prices[i] > prices[j]) {
	                sec++;
	                break;
	            }
            }
        answer[i] = sec;
        sec =0;
        }
    return answer;
    }
}