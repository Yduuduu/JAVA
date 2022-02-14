package _09;

import java.util.Scanner;

// 6. °ñµå¹ÙÈåÀÇ ÃßÃø

public class _09_9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n =sc.nextInt();
			
			int div, rem;
			div = n/2;
			rem = n -div;
			while(true) {
				if(isPrime(div) && isPrime(rem)) {
					break;
				} else {
					div--;
					rem++;
				}
			}
			System.out.println(div + " " + rem);
		}
	}


	static boolean isPrime(int n) {
		boolean check = true;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0)
				check = false;
		}
		return check;
	}
}