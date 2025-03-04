package Ch07;

import java.util.ArrayList;
import java.util.List;

public class C05기타반복처리 {
	public static void main(String[] args) {
		// Collection 객체를 이용 - 저장
		List<String> lists = new ArrayList();
		lists.add("JAVA");
		lists.add("JSP/SERVLET");
		lists.add("SPRING STS");
		lists.add("SPRINGBOOT");
		lists.add("REACT");
		lists.add("ORACLE");

		// 개량 for
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		System.out.println("-----------------------");

		for (String subject : lists) {
			System.out.println(subject);
		}
		// Stream forEach
		System.out.println("-----------------------");
		lists.stream().forEach((item) -> {
			System.out.println(item);
		});
	}
}
