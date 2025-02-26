package Ch05;

import java.util.Scanner;

public class C02Ex {

	public static void main(String[] args) {

		// 1.문제(삼항연산자)
		// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		// 총점수 평균이 70점이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다

		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 점수 :");
//		int KoreanLanguage = sc.nextInt();
//
//		System.out.print("영어 점수 :");
//		int Englis = sc.nextInt();
//
//		System.out.print("수학 점수 :");
//		int Math = sc.nextInt();
//
//		double score = (double) (KoreanLanguage + Englis + Math) / 3;
//		String grade = (score >= 70 && KoreanLanguage >= 40 && Englis >= 40 && Math >= 40) ? "합격입니다" : "불합격입니다";
//		System.out.println("평균" + score + " 점은" + grade);

		// 2.미니문제(%연산자)
		// 키보드로 부터 정수값 2 를 입력받아
		// 두수의 합이 짝수이면 "짝수입니다"
		// 홀수이면 "홀수입니다" 를 출력하세요~
		System.out.print("두 수를 입력하세요");
		int num0 = sc.nextInt();
		int num1 = sc.nextInt();

		int score = num0 + num1;
		String grade = (score % 2 == 0) ? "짝" : "홀";
		System.out.println(grade + "입니다");

		// 3.문제
		// 국어 / 영어 / 수학 점수를 입력받아서
		// 국어 점수가 40점이상
		// 영어 점수가 40점이상
		// 수학 점수가 40점이상이면서 전체평균이 60점이상이면 합격을 출력
		// 아니면 불합격을 출력하세요
		// 삼항연산자와 논리연산자를 이용합니다.

	}

}