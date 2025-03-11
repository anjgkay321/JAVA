package Ch17;

import java.util.ArrayList;
import java.util.List;

public class Ch01List {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		// 추가
		list.add("HTML/CSS/JS"); // 0
		list.add("JQUERY"); // 1
		list.add("NODEJS"); // 2
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SETVLET");
		list.add("SPRING");

		// 조회

		System.out.println("개수 확인 : " + list.size());
		System.out.println("개수 확인 : " + list.get(2));
		System.out.println("개수 확인 : " + list.indexOf("JAVA"));
		list.forEach(System.out::println);

		// 삭제
		list.remove(0);
		list.remove("JQUERY");
		for (String el : list)
			System.out.println(el);

		// 전체삭제
		list.clear();
	}

}
