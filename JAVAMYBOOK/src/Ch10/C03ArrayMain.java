package Ch10;

public class C03ArrayMain {
	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60, 65, 67 }, { 70, 80, 90, 96, 11, 56 },
				{ 100, 110, 120, 15, 22, 33, 44 }, };
		System.err.println("행의 길이 :" + arr.length);
		System.err.println("행의 길이 :" + arr[0].length);
		System.err.println("행의 길이 :" + arr[1].length);
	}
}
