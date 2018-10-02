package do_while;

import java.util.Scanner;

public class Ariketa6 {
	public static void main(String[] arg) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many asterik do you want me to show?");
		num = sc.nextInt();
		do {
			switch (num) {
		case 1 : System.out.println("*"); break;
		case 2 : System.out.println("**"); break;
		case 3 : System.out.println("***"); break;
		case 4 : System.out.println("****"); break;
		case 5 : System.out.println("*****"); break;
		case 6 : System.out.println("******"); break;
		case 7 : System.out.println("*******"); break;
		case 8 : System.out.println("********"); break;
		case 9 : System.out.println("*********"); break;
		case 10 : System.out.println("**********"); break;
		default : System.out.println("I can only show 10 asterisk.");
			}
		System.out.println("How many asterik do you want me to show?");
		num = sc.nextInt();
		} while(num != 0);
		System.out.println("The program has been stopped.");
	}
}
