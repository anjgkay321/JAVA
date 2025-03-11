package Ch17;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class C04Ex {
	public static void main(String[] args) {
		Set<Integer> Set = new HashSet();
		Random rnd = new Random();
		while (Set.size() < 6) {
			Set.add(rnd.nextInt(45) + 1);
		}
		System.out.println(Set);
		Set.stream().sorted((a, b) -> b - a).forEach(System.out::println);
	}

}
