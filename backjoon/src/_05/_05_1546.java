package _05;
// 5. ���
// ��ĳ�ʸ� ����Ͽ� score ������ ���� ���ؼ� ������ ���� �� 
// �Է¹��� ���� �ִ��� ����Ͽ� ��� ������ (����/M)*100 ���� ������ �� ���ο� ����� ���ؾ���

import java.util.Scanner;

public class _05_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); // ������ ���� �Է¹���
		double[] subject = new double[count]; // ���� ����
		// �ݵ�� ���� �� �� �ּ��� �ڷ��� 1�� �̻��� double ������ �����. 
		// �׷��� �ڵ� ����ȯ�� �Ǹ鼭 �ڷ����� ū ������ (int ���� double) ��ȯ�� �Ǳ� ����.
		int max = 0; // ���� �ִ� ����.
		double sum = 0; // ������ ��.
		
		// ���� ���� ������ �Է� �ް�, �ִ� ������ ����(����)
		for(int i=0; i<count; i++) {
			subject[i] = sc.nextFloat(); // ������ ��´�
			max = (int)Math.max(max, subject[i]); // max() �Լ��� �� ���� �� �� ū ���� �����ϴ� �Լ�
		}
		
		// �迭�� ũ�⸸ŭ �ݺ��Ͽ� �迭 ��ü�� ���� ���� (���� / �ְ��� * 100) / ���� ����
		for(int i=0; i<count; i++) { 
			subject[i] = (double)subject[i] / max * 100; 
			// ����� �� ��հ��� ���ؾ� �ϱ� ������ int�� double�� ����ȯ�� �������	
			sum += subject[i]; // sum������ �ٲﰪ�� ���ذ���
		}
		sc.close();
		
		// ���۵� ������ ��� ���
		System.out.println(sum/count);
	}
}
