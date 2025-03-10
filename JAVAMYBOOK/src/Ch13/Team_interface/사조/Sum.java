package Ch13.Team_interface.사조;

public class Sum implements Calculation {

	@Override
	public void sum(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	@Override
	public void sum(int... args) {
		int sum = 0;

		for (int num : args) {
			sum += num;
		}
		System.out.println(sum);

	}

	@Override
	public void sum(double... args) {
		double sum = 0;

		for (double num : args) {
			sum += num;
		}
		System.out.println("합계는 :" + sum);

	}

	@Override
	public void sum(String... args) {
		String sum = "";

		for (int i = 0; i < args.length; i++) {
			sum += args[i];
			if (i < args.length - 1) {
				sum += "+"; // 마지막 항목이 아닐 때만 "+" 추가
			}
		}

		System.out.printf("합계는 : %s\n", sum);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sub(int... args) {
	}

	@Override
	public void sub(double... args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sub(String... args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mul(int... args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mul(double... args) {

	}

	@Override
	public void mul(String... args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void div(int a, int b) {
		int div = a / b;

		System.out.println(div);
	}

	@Override
	public void div(int... args) {
		int div = 1;

		for (int num : args) {

			div /= num;

		}

		System.out.println(div);

	}

	@Override
	public void div(double... args) {
		double div = 1;

		for (double num : args) {

			div /= num;

		}

		System.out.println(div);

	}

	@Override
	public void div(String... args) {
		String string = "";

		for (int i = 0; i < args.length; i++) {

			if (i == (args.length - 1)) {

				string += args[i];

			} else {

				string += args[i] + "/";

			}

		}

		System.out.println(string);
	}
}
