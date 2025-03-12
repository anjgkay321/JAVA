package Ch18;

import java.util.Scanner;

public class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int height = sc.nextInt();// height 변수에 입력값을 저장

		for (int i = 0; i < height; i++) { // // i는 0부터 입력받은 수까지 반복
			for (int j = 0; j < (height - 1) - i; j++) { // (height - 1) - i는 현재 줄에서 출력해야 할 공백의 개수
				System.out.print(" "); // 공백 입력
			}
			for (int k = 0; k <= 2 * i; k++) {// 2 * i는 현재 줄에 출력할 별의 개수 배수로 증가할수 있도록함
				System.out.print("*"); // 별입력
			}
			System.out.println(); // 줄바꿈
		}

	}
}
