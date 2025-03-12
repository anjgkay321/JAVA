package Ch18;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력하세요 : ");
		int height = sc.nextInt(); // 값을 받아 다이아몬드 모양의 높이를 설정하는 변수

		if (height % 2 == 0) {// height가 짝수일 경우 출력하고 프로그램 종료
			System.out.println("홀수로 입력해 주세요"); // 홀수가 아닌 값을 입력하면 경고 메시지 출력
		} else { // height가 홀수일 경우 다이아몬드 모양을 출력
			for (int i = 0; i < height; i++) { // i는 0부터 받은값(height)를 출력
				if (i <= height / 2) { // i가 height / 2 이하일 때는 윗부분 또는 가운데
					for (int j = 0; j < (height / 2) - i; j++) { // 공백의 개수는 (height / 2) - i로 감소
						System.out.print(" "); // 공백을 출력하여 다이아몬드 모양을 만듬
					}
					for (int k = 0; k <= 2 * i; k++) { // 2 * i만큼 별을 출력 (별의 개수는 증가)
						System.out.print("*"); // 별 출력
					}
				} else { // i가 height / 2 보다 클 경우, 다이아몬드의 아랫부분 처리
					for (int j = 0; j < i - (height / 2); j++) { // 공백의 개수는 점점 늘어남
						System.out.print(" "); // 아랫부분의 공백 출력
					}
					for (int k = 0; k <= ((height - 1) * 2) - 2 * i; k++) { // 별의 개수는 점점 감소
						System.out.print("*"); // 별 출력
					}
				}
				System.out.println(); // 줄 바꿈
			}
		}
	}
}
