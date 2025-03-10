package Ch15;

public class C02ArrayIndexBoundExceptionMain {
	public static void main(String[] args) {
		try {
			int[] arr = { 10, 20, 30 };

			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e);
		}

		System.out.println("HelloWorld");
	}
}
