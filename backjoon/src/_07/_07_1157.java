package _07;

// 5. 단어공부

import java.util.Scanner;

public class _07_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); // 대문자 출력 문제이기 때문에 입력값을 모두 대문자로 변경함

        int[] count = new int[26]; // 알파벳 갯수(A~Z)만큼 26크기의 배열 선언함

        for (int i = 0; i < str.length(); i++) { // 알파벳 수 계산을 하고 입력 문자열 길이만큼 반복문 실행
            int num = str.charAt(i) -'A'; // char 'A' = 65/ 문자를 추출하고 char에서 int형으로 바꿔주기 위해 아스키 코드 값을 빼줌
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) { // 알파벳 개수(배열 크기)만큼 반복문 실행
            if(max < count[i]){ // 가장 많이 사용된 알파벳을 찾고 크기를 비교하여 큰 값을 max에 담는다.
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){ // max와 count 값이 같다면 ?를 출력한다. 다음 더 큰게 나오기 전까지!
                answer = '?';
            }
        }
        System.out.println(answer); // 카운트가 가장 큰 알파벳을 출력한다
    }
}