package _09;

// 3. ���μ�����

import java.util.Scanner;

public class _09_11653 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 2;
		
		while(i<=n) {
			if(n%i ==0) {
				System.out.println(i);
				n /= i;
			} else {
				i++;
			}
		}		
	}
}
