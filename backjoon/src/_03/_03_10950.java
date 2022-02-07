package _03;
// 2. A+B - 3

import java.util.Scanner;

public class _03_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
     
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
        	int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(b + c);
        }
	}
}
