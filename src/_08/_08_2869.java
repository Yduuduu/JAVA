package _08;

// 4. �����̴� �ö󰡰� �ʹ�. 

import java.util.Scanner;

public class _08_2869 {
	 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int up = sc.nextInt();	
		int down = sc.nextInt();
		int length = sc.nextInt();
 
		int day = (length - down) / (up - down);

		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}