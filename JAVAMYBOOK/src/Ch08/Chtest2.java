package Ch08;

import java.util.Scanner;

class Grade {
	int math;
	int english;
	int korea;

	public Grade(int math, int english, int korea) {
		this.math = math;
		this.english = english;
		this.korea = korea;
	}

	void average() {
		int sum = math + english + korea;
		System.out.printf("수학 영어 국어의 평균점수는 %d입니다" + sum / 3);
	}
}

public class Chtest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수학 점수를 입력하세요");
		int math = sc.nextInt();
		System.out.print("영어 점수를 입력하세요");
		int english = sc.nextInt();
		System.out.print("국어 점수를 입력하세요");
		int korea = sc.nextInt();

		Grade Grade = new Grade(math, english, korea);
		Grade.average();
	}
}
