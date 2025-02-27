package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10번 반복 -"HELLO WORLD"
		// 탈출용 변수 :i =0
		// 탈출용 조건식 :i <10
		// 탈출용 연산식 :i++
		// while(조건식){
		// 조건식이 true 인 동안 실행되는 종속문장
		// }

		// 01 기본 - HELLO WORLD 10회 반복
//		int i = 0;
//		while (i < 10) {
//			System.out.println("HELLO WORLD");
//			i++;
//		}
		// 02 기본 - HELLO WORLD n회 반복
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반복할 횟수 :");
//		int n = sc.nextInt();
//
//		int i = 0;
//		while (i < n) {
//			System.out.println("HELLO WORLD");
//			i++;}

		// 03 기본 - 1부터 10까지의 합

//		int i = 1; // 탈출용 변수
//		int sum = 0;
//		while (i <= 10) {
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("sum: " + sum);

		// 04 문제 -1부터 n까지의 합
//		Scanner sc = new Scanner(System.in);
//		System.out.print("반복할 횟수를 정하세요");
//		int n = sc.nextInt();
//		int i = 0;
//		int sum = 0;
//		while (i <= n) {
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;
//		}
//		System.err.println(sum);
		// 05 문제 - N부터 M까지의 합 (N<M) - N>=M인경우 N과 M을 swap하고 진행합니다

//		Scanner sc = new Scanner(System.in);
//		System.out.print("n을 입력하세요");
//		int n = sc.nextInt();
//		System.out.print("m을 입력하세요");
//		int m = sc.nextInt();
//		int sum = 0;
//		while (n < m) {
//			n++;
//			sum = sum + n;
//			System.out.println(n);
//		}
//		while (n > m) {
//			m++;
//			sum = sum + m;
//			System.out.println(m);
//		}
//		System.out.println(" m과n을 반복해서 더한 합은?" + sum);

		// 06 N - M까지 수중(N<M) 짝수의합, 홀수의 합을 각각 구해서 출력하세요
		// 예시)
		// n= 3(키보드로 입력된 값)
		// m = 7(키보드로 입력된 값)
		// 짝수의 합 : 10
		// 홀수의 합 : 15

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>=m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int i = n;
//		int odd_sum =0; 	//홀수합
//		int even_sum = 0;	//짝수합
//		while(i<=m) {
//			System.out.println("i : " + i);
//			if(i%2==0)
//				even_sum+=i;
//			else
//				odd_sum+=i;
//				
//			i++;
//		}
//		System.out.println("짝수 합 : " + even_sum);
//		System.out.println("홀수 합 : " + odd_sum);

		// 07 1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i=1;
//		int sum=0;
//		while(i<=n) {
//			if(i%4==0)
//				System.out.println("i : " + i);
//			else
//				sum+=i;
//			i++;
//		}
//		System.out.println("SUM : " + sum);

		// 08 구구단 N단을 출력합니다(2<=N<=9)

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		while (n < 2 || n > 9) {
			System.out.println("구구단의 범위는 2 - 9 사이값을 입력하셔야됩니다");
			System.out.print("n 입력 : ");
			n = sc.nextInt();
		}

		int i = 1;
		while (i < 10) {
			System.out.printf("%d x %d = %d\n", n, i, n * i);
			i++;
		}

	}
}
