package Ch04;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		// 자동 import : ctrl + shift + o
		// 자동 formatting : ctrl + shift : f
		Scanner sc = new Scanner(System.in);

		System.out.printf("num1 입력 :");
		int num1 = sc.nextInt(); // 엔터(\n) ,스페이스바
		System.out.printf("num2 입력 :");

		int num2 = sc.nextInt();
		System.out.printf("num3 입력 :");

		int num3 = sc.nextInt();
		System.out.printf("num4 입력 :");

		int num4 = sc.nextInt();

		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d \n", num1, num2, num3, num4, sum);
		sc.close();
	}
}
