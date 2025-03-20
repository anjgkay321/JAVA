package Ch31;

interface Calculator {
	int calculate(int num1, int num2);
}

public class C03LAMDA {
	public static void main(String[] args) {
		Calculator add = (a, b) -> {
			int sum = 0;
			sum = a + b;

			return sum;
		};
		Calculator sub = (a, b) -> {
			int sum = 0;
			sum = a - b;

			return sum;
		};
		Calculator mul = (a, b) -> {
			int sum = 0;
			sum = a * b;

			return sum;
		};
		Calculator div = (a, b) -> {
			int sum = 0;
			sum = a / b;
			return sum;
		};

		System.out.println(add.calculate(10, 20)); // 덧셈
		System.out.println(sub.calculate(30, 10)); // 뺄셀
		System.out.println(mul.calculate(10, 20)); // 곱셈
		System.out.println(div.calculate(100, 5)); // 나눗셈
	}
}
