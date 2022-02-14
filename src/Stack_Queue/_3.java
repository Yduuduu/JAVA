package Stack_Queue;

// 다리를 지나는 트럭

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; 
        int temp_weight = 0, idx=0;
        
        Queue<Integer> q = new LinkedList<>(); 
        
        while(true){
            if(idx == truck_weights.length)break;
   
            if(q.size() == bridge_length){
                temp_weight-=q.poll();                
            } else if(temp_weight+truck_weights[idx]>weight){
                q.offer(0);
                answer++;             
            }else{
                q.offer(truck_weights[idx]);
                temp_weight+=truck_weights[idx];
                answer++;
                idx++;
            }            
        }
        return answer + bridge_length;
    }
}