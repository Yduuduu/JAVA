package _09;

// 1. 소수 찾기

import java.util.Scanner;

public class _09_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			boolean isPrime = true;
			
			if(a==1)
				continue;
			for(int j=2; j<=Math.sqrt(a); j++) {
				if(a%j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
