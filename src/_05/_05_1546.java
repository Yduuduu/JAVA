package _05;
// 5. 평균
// 스캐너를 사용하여 score 값들을 전부 더해서 총점을 구한 후 
// 입력받은 값중 최댓값을 사용하여 모든 점수에 (점수/M)*100 으로 연산한 뒤 새로운 평균을 구해야함

import java.util.Scanner;

public class _05_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); // 과목의 수를 입력받음
		double[] subject = new double[count]; // 과목별 점수
		// 반드시 연산 할 때 최소한 자료형 1개 이상은 double 형으로 써야함. 
		// 그러면 자동 형변환이 되면서 자료형이 큰 쪽으로 (int 에서 double) 변환이 되기 때문.
		int max = 0; // 과목 최대 점수.
		double sum = 0; // 점수의 합.
		
		// 과목 별로 점수를 입력 받고, 최대 점수를 구함(총점)
		for(int i=0; i<count; i++) {
			subject[i] = sc.nextFloat(); // 점수를 담는다
			max = (int)Math.max(max, subject[i]); // max() 함수는 두 인자 값 중 큰 값을 리턴하는 함수
		}
		
		// 배열의 크기만큼 반복하여 배열 전체를 점수 조작 (총점 / 최고점 * 100) / 과목 개수
		for(int i=0; i<count; i++) { 
			subject[i] = (double)subject[i] / max * 100; 
			// 계산할 때 평균값을 구해야 하기 때문에 int를 double로 형변환을 해줘야함	
			sum += subject[i]; // sum변수에 바뀐값을 더해간다
		}
		sc.close();
		
		// 조작된 점수의 평균 출력
		System.out.println(sum/count);
	}
}
