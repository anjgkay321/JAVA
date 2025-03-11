package Ch17;

import java.util.HashSet;
import java.util.Set;

public class Ch03SetMain {
	public static void main(String[] args) {
		Set<String> Set = new HashSet();
		// 추가
		Set.add("HTML/CSS/JS"); // 0
		Set.add("JQUERY"); // 1
		Set.add("NODEJS"); // 2
		Set.add("SCSS");
		Set.add("REACT");
		Set.add("JAVA");
		Set.add("JSP/SETVLET");
		Set.add("SPRING");
		Set.add("Boot");
		Set.add("Boot");
		// 확인
		System.out.println("개수확인 : " + Set.size());

		// 조회(idx x -> Iterator)
//		Iterator<String> iter = Set.iterator();
//		while (iter.hasNext())
//			System.out.println(iter.next());

		for (String el : Set)
			System.out.println(el);

		Set.clear();
	}

}
