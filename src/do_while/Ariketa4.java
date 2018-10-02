package do_while;

import java.util.Scanner;

public class Ariketa4 {
	public static void main (String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		do{System.out.println("Enter a number:");
		num = sc.nextInt();
		num = num * num;
		System.out.println("This is its square: "+ num);
		} while(num != 0);
		System.out.println("The program has been stopped.");
	}
}
