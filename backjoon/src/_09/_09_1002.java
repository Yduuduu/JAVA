package _09;

import java.util.Scanner;

// 11. ≈Õ∑ø

public class _09_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++){
			int x[]=new int[3];
			int y[]=new int[3];
			int r[]=new int[3];
			
			for(int i=1; i<=2; i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				r[i] = sc.nextInt();
				} 
			double distance = Math.sqrt(Math.pow(x[1]-x[2],2) + Math.pow(y[1]-y[2],2));
			int sum = r[1]+r[2]; 
			int sub = Math.abs(r[1]-r[2]);
			
			if (distance==0 && sub==0){
				System.out.println(-1); 
			}else if (distance < sub || distance > sum){
				System.out.println(0); 
			} else if(distance == sub || distance == sum) {
				System.out.println(1); 
			} else {
				System.out.println(2); 
			} 
			} sc.close(); 
	} 
}


