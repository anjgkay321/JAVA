package Ch02;

public class C01진수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		10진수			2진수
//		0			   0
//		1			   1
//		2			  10
//		3			  11
//		4			 100
//		5			 101
//		6			 110
//		7			 111
//		8			1000
//		9			1001
//		------------------------------
//		1bit : 2^1 = 2(0~1)
//		2bit : 2^2 = 4(0~3)
//		3bit : 2^3 = 8(0~7)
//		4bit : 2^4 = 16(0~15)
//		5bit : 2^5 = 32(0~31)
//		6bit : 2^6 = 64(0~63)
//		7bit : 2^7 = 128(0~127)
//		8bit : 2^8 = 256(0~255)
//		9bit : 2^9 = 512(0~511)
//		10bit: 2^19 =1024(0~1023)
//		--------------------------------
//		1	1	1	1	1	1	1	1
//		*	*	*	*	*	*	*	*
//		2^7	2^6	2^5	2^4	2^3	2^2	2^1	2^0
//
//		128	64	32	16	8	4	2	1

		// 2진수 - > 10진수
		// 10101100 = 128 + 32 + 8 + 4
		// 10011010 = 128 + 16 + 8 + 2
		// 01101001 = 64 + 32 + 8 + 1
		// 10010010 = 128 + 16 + 2

		// 10진수 -> 2진수
		// 192 -> 11000000
		// 224 -> 11100000
		// 252 -> 11111100
		// 12 -> 00001100
		// 15 -> 00001111

		// %d : 10진수 서식문자
		// %o : 8진수 서식문자
		// %x : 16진수 서식문자
		// 코드 이쁘게 정리하기 : ctrl + shift + f
		System.out.printf("10진수 : %d\n", 0b00001111);
		System.out.printf("10진수 : %d\n", 173); // 10진수
		System.out.printf("10진수 : %d\n", 0255); // 8진수 (0 :8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 0xAD); // 16진수(0x:16진수를 의미하는 접두사)

		System.out.printf("8진수 : %o\n", 173); // 10진수
		System.out.printf("8진수 : %o\n", 0255); // 8진수 (0 :8진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n", 0xAD); // 16진수(0x:16진수를 의미하는 접두사)

		System.out.printf("16진수 : %x\n", 173); // 10진수
		System.out.printf("16진수 : %x\n", 0255); // 8진수 (0 :8진수를 의미하는 접두사)
		System.out.printf("16진수 : %x\n", 0xAD); // 16진수(0x:16진수를 의미하는 접두사)

	}

}
