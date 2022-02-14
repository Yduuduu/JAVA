package _09;

// 2. ¼Ò¼ö

import java.util.Scanner;

public class _09_2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean arr[] = new boolean[n+1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<=Math.sqrt(n+1); i++) {
			for(int j=i*i; j<n+1; j+=i) {
				arr[j] = true;
			}
		}
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=m; i<n+1; i++) {
			if(arr[i] == false) {
				if(min>i) {
					min = i;
				}sum += i;
			}
		}
		if(sum==0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
