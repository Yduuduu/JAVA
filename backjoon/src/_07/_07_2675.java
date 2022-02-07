package _07;

// 4. 문자열 반복

import java.util.Scanner;

public class _07_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int index = sc.nextInt();
        
        for (int i = 0; i < index; i++) {
            int reqeat = sc.nextInt();
            String str = sc.next();
            
            for (int j = 0; j < str.length(); j++) {
                for (int r = 0; r < reqeat; r++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}