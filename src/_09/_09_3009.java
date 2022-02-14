package _09;

//8. 네 번째 점

import java.util.Scanner;

public class _09_3009 {
	public static void main (String[] args)	{
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt(); 
		int y1 = sc.nextInt(); 
		
		int x2 = sc.nextInt(); 
		int y2 = sc.nextInt();
		
		int x3 = sc.nextInt(); 
		int y3 = sc.nextInt(); 
		
		int x = 0; 
		int y = 0;
		
		if(x1 == x2) {
			x = x3; 
		}else if(x1 == x3){
			x = x2; 
		}else if(x2 == x3){
			x = x1; 
		}else { 
			System.out.println(-1); 
		} 
		
		if(y1 == y2) {
			y = y3; 
		}else if(y1 == y3){
			y = y2; 
		}else if(y2 == y3) {
			y = y1; 
		}else {
			System.out.println(-1); 
		} 		
		System.out.println(x+ " " +y);
	}	
}
