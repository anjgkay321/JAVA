package Ch12;

class C08Super {
	void func1() {
		System.out.println("C08.Super.func1() call!");
	}

	void func2() {
	}
}

class C08Sub extends C08Super {
	void func2() {
		System.out.println("C08.C08Sub.func2() call!");
	}
}

public class C08UpDownCastingMain {
	public static void main(String[] args) {
		C08Super ob1 = new C08Super();
		ob1.func1();

		System.out.println("---------------------");
		C08Sub ob2 = new C08Sub();
		ob2.func1();
		ob2.func2();
		System.out.println("---------------------");
		C08Super ob3 = new C08Sub();
		ob3.func1();
		ob3.func2();

		// Upcasting
		// 확장된(멤버추가) 멤버변수 접근하다? O X 정답 x
		// 확장된(멤버추가) 멤버함수 접근 가능하다? O X 정답 x
		// 재정의된 메서드 접근가능? O X 정답 O
	}
}
