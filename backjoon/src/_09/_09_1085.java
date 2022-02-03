package _09;

//7. 직사각형에서 탈출

import java.util.Scanner;

public class _09_1085{
	public static void main (String[] args)	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		System.out.print(Math.min(Math.min(w-x, x),Math.min(h-y, y)));
	}
}