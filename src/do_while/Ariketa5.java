package do_while;

import java.util.Scanner;

public class Ariketa5 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		 do {System.out.println("Enter two numbers:");
		 	num1 = sc.nextInt();
			num2 = sc.nextInt();
		 }while (!((num1 == 123)&&(num2 == 321))||(((num2 == 123)&&(num1 == 321))));
		 System.out.println("The program has been stopped");
	}
}
