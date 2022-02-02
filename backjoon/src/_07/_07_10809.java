package _07;

// 3. ¾ËÆÄºª Ã£±â

import java.util.Scanner;
public class _07_10809 {
       public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String input = sc.next();
             
             for (char c = 'a' ; c <= 'z' ; c++)
                    System.out.print(input.indexOf(c) + " ");
       }
}
