package _09;

// 4. 소수 구하기

import java.util.Scanner;

public class _09_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean[] prime = new boolean[N+1];
		prime[0] = true;
		prime[1] = true;
        
		for(int i = 2; i <= N; i++){
			if(prime[i] == false){
				if(i >= M)
					System.out.println(i);
				for(int j = i+i; j <= N; j+=i)
					prime[j] = true;
            }
		}
    }
}