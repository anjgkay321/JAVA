package Ch17;

import java.util.ArrayList;
import java.util.List;

public class C02Ex {
	public static void func1(List<String> list) {
		// ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		// 짝수의 값만 입력받는 코드를 작성하세요.
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		for (int i = 0; i < list.size(); i++) {
			int num = Integer.parseInt(list.get(i));
			if (num % 2 == 0) {
				System.out.println(num);
			}

		}
	}

	public static List<String> func2(List<String> list) {
		// ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 필터링해서 리턴하는 함수를 만드세요
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");

		for (int i = 0; i < list.size(); i++) {
			int num = Integer.parseInt(list.get(i));
			if (num >= 5) {
				System.out.println(num);
			}

		}
		return null; // 바꿔주세요 작업시
	}

	public static int func3(List<String> list) {
		// ArrayList에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요
		try {
			list.add("1");
			list.add("2");
			list.add("홍길동");
			list.add("길동");
			list.add("동");
			list.add("바동");
			list.add("홍동");
			list.add("뉴동");
			list.add("3");
			list.add("4");
			list.add("5");
			list.add("6");
			list.add("7");
			list.add("8");
			list.add("9");
			list.add("10");
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		return -1; // 바꿔주세요 작업시
	}

	public static void main(String[] args) {
		List<String> li = new ArrayList();
		func1(li);

		List<String> returndList = func2(li);
		int sum = func3(returndList);
		System.out.println(sum);
	}

}
