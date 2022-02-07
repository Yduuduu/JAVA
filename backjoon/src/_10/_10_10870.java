package _10;

// 2. 피보나치 수 5

import java.util.Scanner;

public class _10_10870 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
		System.out.println(fibonacci(N));
 
	}

	static int fibonacci(int N) {
		if (N == 0)	return 0;
		if (N == 1)	return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
}