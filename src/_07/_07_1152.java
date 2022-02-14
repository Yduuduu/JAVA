package _07;

// 6. 단어의 개수
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class _07_1152 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String S = sc.nextLine();
		sc.close();
 
		StringTokenizer st = new StringTokenizer(S," ");
		
		System.out.println(st.countTokens());		
	}
}