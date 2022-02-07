package Sort;

// K¹øÂ°¼ö

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
	int[] answer = new int[commands.length];
		
	for(int i = 0; i < commands.length; i++) {
			
		int start = commands[i][0];
		int end = commands[i][1];
		int select = commands[i][2];
		int[] splitArray = new int[end - start + 1];
		int index = 0;
		for(int j = start-1; j<end; j++) {
			splitArray[index] = array[j];
			index++;
		}
			
		Arrays.sort(splitArray);
		answer[i] = splitArray[select-1];
	}
	return answer;			
    }
}