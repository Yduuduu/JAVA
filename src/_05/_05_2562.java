package _05;
// 2. ÃÖ´ñ°ª

import java.util.Scanner;

public class _05_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
	}
}
