package _07;

// 5. �ܾ����

import java.util.Scanner;

public class _07_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); // �빮�� ��� �����̱� ������ �Է°��� ��� �빮�ڷ� ������

        int[] count = new int[26]; // ���ĺ� ����(A~Z)��ŭ 26ũ���� �迭 ������

        for (int i = 0; i < str.length(); i++) { // ���ĺ� �� ����� �ϰ� �Է� ���ڿ� ���̸�ŭ �ݺ��� ����
            int num = str.charAt(i) -'A'; // char 'A' = 65/ ���ڸ� �����ϰ� char���� int������ �ٲ��ֱ� ���� �ƽ�Ű �ڵ� ���� ����
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) { // ���ĺ� ����(�迭 ũ��)��ŭ �ݺ��� ����
            if(max < count[i]){ // ���� ���� ���� ���ĺ��� ã�� ũ�⸦ ���Ͽ� ū ���� max�� ��´�.
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){ // max�� count ���� ���ٸ� ?�� ����Ѵ�. ���� �� ū�� ������ ������!
                answer = '?';
            }
        }
        System.out.println(answer); // ī��Ʈ�� ���� ū ���ĺ��� ����Ѵ�
    }
}