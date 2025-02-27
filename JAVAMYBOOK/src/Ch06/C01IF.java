package Ch06;

import java.util.Scanner;

public class C01IF {
	public static void main(String[] args) {
		// --------------------------------------
		// 단순IF문
		// --------------------------------------

//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 :");
//		int age = sc.nextInt();
//		if (age >= 8)
//			System.out.println("학교를 다닙니다");
//		System.out.println("첫번째 IF 코드블럭 종료 ...");
//
//		if (age < 8)
//			System.out.println("학교를 다니지 않습니다");
//		System.out.println("두번째 IF 코드 블럭 종료 ...");
//
//		System.out.println("프로그램을 종료합니다");
//
//		sc.close();

		// ------------------------------------------
		// IF - ELSE
		// ------------------------------------------

//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 :");
//		int age = sc.nextInt();
//		if (age >= 8)
//			System.out.println("학교를 다닙니다");
//		else
//			System.out.println("학교를 다니지 않습니다");
//
//		System.out.println("프로그램을 종료합니다");
//
//		sc.close();

		// 1문제
		// 정수한개값을 입력받아 3의배수이면 해당수를 출력하세요]
		// 3의배수이면서5의 배수라면 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 :");
//		int num1 = sc.nextInt();
//
//		if (num1 % 3 == 0)
//			System.out.printf("%d는 3의 배수입니다 \n", num1);
//
//		if (num1 % 3 == 0 && num1 % 5 == 0)
//			System.out.printf("%d는 3의 배수이면서 5의 배수입니다", num1);
//
//		sc.close();

		// 2문제
		// 두개의 정수를 입력받아 큰수 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 :");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 :");
//		int num2 = sc.nextInt();
//
//		if (num1 > num2)
//			System.out.printf("%d이 %d보다 크다", num1, num2);
//
//		if (num1 < num2)
//			System.out.printf("%d이 %d보다 크다", num2, num1);
//		sc.close();

		// 3문제
		// 3개의 정수를 입력받아 큰수 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요 :");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 :");
//		int num2 = sc.nextInt();
//		System.out.print("세번째 숫자를 입력하세요 :");
//		int num3 = sc.nextInt();
//		// 풀이 1
//		int max = num1; // 최대값(max)이 n1 이라고 가정 시작 -!
//
//		if (max < num2) {
//			max = num2;
//		}
//		if (max < num3) {
//			max = num3;
//		}
//
//		System.out.println("큰 수 :" + max);
//		sc.close();

		// 4문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요 :");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 :");
//		int num2 = sc.nextInt();
//		System.out.print("세번째 숫자를 입력하세요 :");
//		int num3 = sc.nextInt();
//
//		int sum = num1 + num2 + num3;
//
//		System.out.printf("3개의 합은 %d 이고 평균인 %d입니다", sum, sum / 3);
		// 5문제
//		입력한 수가 짝수이고, 3의 배수라면 출력
//		입력한 수가 홀수이고, 5의 배수라면 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 :");
//		int num1 = sc.nextInt();
//
//		if (num1 % 2 == 0 && num1 % 3 == 0)
//			System.out.printf("%d는 짝수이면서 3의 배수입니다", num1);
//		else if (num1 % 2 == 1 && num1 % 5 == 0)
//			System.out.printf("%d는 홀수이면서 5의 배수입니다", num1);
//		else
//			System.out.println("아무것도 해당되지 않습니다 종료합니다.");

		// -----------------------
		// IF - ELSE IF - ELSE
		// -----------------------
		// 과목1,2,3,4 중 하나라도 40점 미만이면 불합격
		// 과목평균이 100점만점 기준으로 60점 미만이면 불합격
		// 아니면 합격

//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		if(과목1<40) {
//			System.out.println("불합격");
//		}
//		else if(과목2<40)	// 과목1>=40 && 과목2<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목3<40)	// 과목1>=40 && 과목2>=40 && 과목3<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목4<40) // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4<40
//		{
//			System.out.println("불합격");
//		}
//		else if(평균<60) // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균<60
//		{
//			System.out.println("불합격");
//		}
//		else // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균>=60
//		{
//			System.out.println("합격");
//		}
		// 문제
		// 시험점수를 받아서 점수별로 a b c d 를 주고 나머지 점수는 f 출력하는프로그램 만들기

//		Scanner sc = new Scanner(System.in);
//		System.out.println("시험점수 :");
//		int score = sc.nextInt();
//
//		if (score >= 90) {
//			System.out.printf("%d는 A입니다", score);
//		} else if (score >= 80) {
//			System.out.printf("%d는 B입니다", score);
//		} else if (score >= 70) {
//			System.out.printf("%d는 C입니다", score);
//		} else if (score >= 60) {
//			System.out.printf("%d는 D입니다", score);
//		} else if (score <= 59) {
//			System.out.printf("%d는 A입니다", score);
//		}

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요! 나이:");
		int age = sc.nextInt();
		if (age < 8) {
			System.out.printf("%d살은 요금이 1000입니다", age);
		} else if (age < 14) {
			System.out.printf("%d살은 요금이 2000입니다", age);
		} else if (age < 20) {
			System.out.printf("%d살은 요금이 2500입니다", age);
		} else if (age >= 20) {
			System.out.printf("%d살은 요금이 3000입니다", age);
		}

	}

}
