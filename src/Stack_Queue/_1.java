package Stack_Queue;

// 기능개발

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    	int[] answer = {};
    	int day;

        Queue<Integer> q=new LinkedList<Integer>();
        ArrayList<Integer> array=new ArrayList<Integer>();
        
        for(int i=0;i<progresses.length;i++){
            day=(int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            q.offer(day);
        }
        
        while(!q.isEmpty() ){
            int cnt = 1;
            int period = q.poll();
            while(!q.isEmpty() && period >= q.peek()){
                q.poll();
                cnt++;
            }
            array.add(cnt);
        }
        
        answer=new int[array.size()];
        for(int i=0;i<array.size();i++){
            answer[i]=array.get(i);
        }
        return answer;
    }
}
