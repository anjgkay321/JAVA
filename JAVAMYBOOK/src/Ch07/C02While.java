package Ch07;

import java.util.Scanner;

public class C02While {
	public static void main(String[] args) {
		// 2단에서 9단 출력
//		int dan = 1;
//		while (dan < 10) {

//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//		dan++;
//			System.out.println();
//		}
		// 9단 - 2단( 9x9 9x8 - 2x1)
//		int dan = 1;
//		while (dan < 10) {
//			dan++;
//			int i = 9;
//			while (i > 1) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i--;
//			}
//			System.out.println();
//		}
		// 2단 - N단(N<9)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("곱하기할 숫자를 적으세요");
//		int dan = sc.nextInt();
//		while (dan > 2) {
//			dan--;
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//		}
//		sc.close();
		// N단 - M단(N<M , N<9 , M<9)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("곱하기할 숫자를 적으세요");
//		int dan = sc.nextInt();
//		int dan1 = sc.nextInt();
//		while (dan <= dan1) {
//
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			dan++;
//			System.out.println();
//		}
//		sc.close();
		// 별찍기(기본높이:4)

		// *****
		// *****
		// *****
		// *****
//		int i = 0;
//
//		while (i < 4) {
//			int j = 0;
//			while (j < 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		// *
		// **
		// ***
		// ****
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 :");
//		int h = sc.nextInt();
//		int i = 0;
//
//		while (i < h) {
//			int j = 0;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		// ****
		// ***
		// **
		// *
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 :");
//		int h = sc.nextInt();
//		int i = 0;
//
//		while (i < 4) {
//			int j = 0;
//			while (j < 4 - i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		// *
		// ***
		// *****
		// *******
//		int i = 0;
//
//		while (i < 7) {
//			int j = 0;
//			while (j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i += 2;
//		}
		// *******
		// *****
		// ***
		// *
//		int i = 0;
//
//		while (i < 7) {
//			int j = 0;
//			while (j <= 6 - i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i += 2;
//		}
		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *
//		int i = 0;
//
//		while (i < 7) {
//			int j = 0;
//
//			while (j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i += 2;
//		}
		//
//		i = 0;
//		while (i < 5) {
//			int j = 0;
//			while (j <= 4 - i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i += 2;
//		}
		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******
//		int i = 0;
//		while (i < 7) {
//			int j = 0;
//			while (j <= 6 - i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i += 2;
//		}
//		i = 0;
//		while (i < 8) {
//			int j = 0;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i += 2;
//		}

		// *로 트리모양 만들기
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
//		int i = 0;
//		while (i <= h) {
//			int j = h - 1;
//			while (j >= i) {
//				System.out.print(" ");
//				j--;
//			}
//			int k = 0;
//			while (k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		// *로 역트리 만들기

//		int i = 0;
//		while (i < h) {
//			int j = 0;
//			while (j < i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = h * 2 - 1;
//			while (k >= i * 2 + 1) {
//				System.out.print("*");
//				k--;
//			}
//			System.out.println();
//			i++;
//		}
		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *
//		i(행)		j(공백)		k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-----------------------------------------
//		i<4		j=0		k=0
//				j++		k++
//				j<3-i		k<=2*i
//
//		4		0-0		0-4
//		5		0-1		0-2
//		6		0-2		0-0
//		-----------------------------------------
//		i>=4		j=0		k=0
//				j++		k++
//				j<=i-4		k<= 12-2*i
//
//		i=0
//		i++
//		i<7

//		int i=0;
//		while(i<7) {
//			
//			if(i<4) {
//				//공백(↓)
//				int j=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별(↑)
//				int k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				
//			}else {
//				
//				//공백(↑)
//				int j=0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}	
//				//별(↓)
//				int k=0;
//				while(k<= 12-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//		}

//		i(행)		j(공백)		k(별)
//		0		0-2				0-0
//		1		0-1				0-2
//		2		0-0				0-4
//		3		x				0-6
//		-----------------------------------------
//		i<=(h/2)	j=0			k=0
//					j++			k++
//					j<(h/2)-i	k<=2*i
//
//		4			0-0				0-4
//		5			0-1				0-2
//		6			0-2				0-0
//		-----------------------------------------
//					j=0				k=0
//					j++				k++
//					j<=i-(h/2+1)	k<=((h-1)*2)-2*i

		int i = 0;
		while (i < h) {

			if (i <= (h / 2)) {
				// 공백(↓)
				int j = 0;
				while (j < (h / 2) - i) {
					System.out.print(" ");
					j++;
				}
				// 별(↑)
				int k = 0;
				while (k <= 2 * i) {
					System.out.print("*");
					k++;
				}

			} else {

				// 공백(↑)
				int j = 0;
				while (j <= i - (h / 2 + 1)) {
					System.out.print(" ");
					j++;
				}
				// 별(↓)

				int k = 0;
				while (k <= ((h - 1) * 2) - 2 * i) {
					System.out.print("*");
					k++;
				}

			}

			System.out.println();
			i++;
		}

	}
}
