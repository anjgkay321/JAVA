package Ch31;

import java.util.Scanner;

interface printer {
//	void print_1(String message);

//	String print_2(String message);
////
	String print_3();

}

public class C02LAMDA {
	public static void main(String[] args) {
		// 01
//		printer printer = (message) -> {
//			System.out.println(message);
//		};
//		printer.print_1("Hello World");
//		// 02
//		printer printer = (message) -> {System.out.println(message);};
//		printer.print_2("Hello World");

		// 03
		printer printer = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 : ");
			String str = sc.nextLine();
			sc.close();
			return str;
		};
		String returnValue = printer.print_3();
		System.out.println(returnValue);
	}
}
