package Ch06;

import java.util.Scanner;

public class C03SWITCH {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("----------JOIN MENU----------");
			System.out.println("1 이메일 인증");
			System.out.println("2 아이디 입력");
			System.out.println("3 패스워드 입력");
			System.out.println("4 패스워드확인 확인");
			System.out.println("5 연락처 이력");
			System.out.println("6 회원가입 요청");
			System.out.println("7 종료");
			System.out.println("----------JOIN MENU----------");
			System.out.print("번호 입력 :");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("이메일 인증처리 작업 -");
				break;
			case 2:
				System.out.println("이메일 개인정보 입력 작업 -");
				break;
			case 3:
				System.out.println("회원가입 작업 -");
				break;
			case 4:
				System.out.println("JOIN 메뉴 종료-");
				System.exit(-1);
				break;
			default:
				System.out.println("잘못된 메뉴번호를 입력하였습니다 -");
				break;
			}

		}
	}
}
