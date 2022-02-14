package Stack_Queue;

// «¡∏∞≈Õ

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<priorities.length; i++){
            q.offer(priorities[i]);
        }
        
        while(!q.isEmpty()){
            boolean flag = false;
            for(int i=1; i<q.size(); i++){
            	if(q.peek() < (int)(q.toArray()[i])) {
            		flag = true;
            		break;
            	}
            }
            
            for(int i=0; i<q.size(); i++) {
            	System.out.print(q.toArray()[i] + ",");
            }
            System.out.println();
            
            if(flag){
                q.offer(q.poll());
                location--;
                if(location < 0){
                    location = q.size()-1;
                }
            }
            
            else{
                if(location == 0){
                    answer++;
                    q.clear();
                }
                
                else{
                    q.poll();
                    answer++;
                    location--;
                    
                    if(location < 0){
                        location = q.size()-1;
                    }
                }
            }
        }  
        return answer;   
    }
}
