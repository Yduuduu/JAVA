package _06;

// 2. ¼¿ÇÁ ³Ñ¹ö

public class _06_4673 {

	public static int D(int num) {
		int sum = num;
		while(num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = D(i);	
			if(n < 10001) {
				check[n] = true;
			}
		}
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}
}