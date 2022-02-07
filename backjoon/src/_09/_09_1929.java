package _09;

// 4. 소수 구하기

import java.util.Scanner;

public class _09_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // 작은 값
		int N = sc.nextInt(); // 큰 값

		boolean[] prime = new boolean[N+1]; // 큰 값에 맞는 배열을 false로 초기화하여 생성해준다 (0 ~ N)
		
		// 에라토스테네스의 체 알고리즘
		prime[0] = true; 
		prime[1] = true; // 1은 소수가 아니기때문에 true
        
		// 2~N구간의 소수 찾기
		for(int i = 2; i <= N; i++){ 
			if(prime[i] == false){
				if(i >= M)
					System.out.println(i);
				for(int j = i+i; j <= N; j+=i) // i*i는 int의 범위를 벗어날 수 있으므로 i+i부터 탐색
					prime[j] = true;
            }
		}
    }
}