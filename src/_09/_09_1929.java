package _09;

// 4. �Ҽ� ���ϱ�

import java.util.Scanner;

public class _09_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // ���� ��
		int N = sc.nextInt(); // ū ��

		boolean[] prime = new boolean[N+1]; // ū ���� �´� �迭�� false�� �ʱ�ȭ�Ͽ� �������ش� (0 ~ N)
		
		// �����佺�׳׽��� ü �˰���
		prime[0] = true; 
		prime[1] = true; // 1�� �Ҽ��� �ƴϱ⶧���� true
        
		// 2~N������ �Ҽ� ã��
		for(int i = 2; i <= N; i++){ 
			if(prime[i] == false){
				if(i >= M)
					System.out.println(i);
				for(int j = i+i; j <= N; j+=i) // i*i�� int�� ������ ��� �� �����Ƿ� i+i���� Ž��
					prime[j] = true;
            }
		}
    }
}