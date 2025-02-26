package CH03;

public class C05TypeChange {
	public static void main(String[] args) {
		// 나누는 대상이 int 형이기 때문에 소수점은 나오지 않는다
		int num1 = 10, num2 = 4;
		double dnum1 = num1 / num2;
		double dnum2 = (double) num1 / num2;
		double dnum3 = (num1 * 1.0) / num2;
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);

	}

}
