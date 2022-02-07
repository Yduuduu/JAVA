package _09;

import java.util.Scanner;

// 10. 택시 기하학

public class _09_3053 {
	public static void main (String[] args)	{
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		double pi = 3.14159265359;
		
		double u = pi * r * r;
		double t = r * r * 2;
		
		System.out.println(u);
		System.out.println(t);
	}
}
