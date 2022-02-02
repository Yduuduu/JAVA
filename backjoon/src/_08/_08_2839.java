package _08;

// 7. º≥≈¡πË¥ﬁ

import java.util.Scanner;

public class _08_2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int bong = 0;
		
		while(true) {
			if(N%5==0) {
				bong += N/5;
				System.out.println(bong);
				break;
			} else {
				N -= 3;
				bong ++;
			}
			
			if(N<0) {
				System.out.println("-1");
				break;
			}
		}
	}
}
