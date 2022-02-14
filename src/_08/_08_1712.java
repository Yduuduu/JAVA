package _08;

// 1. 손익분기점

import java.util.Scanner;

public class _08_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fixed = sc.nextInt();
		int vari = sc.nextInt();
		int cost = sc.nextInt(); 
		int q; 
		if (vari >= cost) { 
			System.out.println(-1);
		} else { 
			q =  fixed / (cost - vari);
			System.out.println(q + 1);
		}
	}
}