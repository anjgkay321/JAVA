package Ch33;

@FunctionalInterface
interface Func1 {
	void say(String message);
}

public class C01FunctionalInterfaceMain {
	public static void main(String[] args) {
		// 01
		Func1 func1 = (message) -> {
			System.out.println(message + "_!");
		};
		func1.say("Hello World");

		Func1 func1_1 = System.out::println;
		func1_1.say("Hello World");
	}
}
