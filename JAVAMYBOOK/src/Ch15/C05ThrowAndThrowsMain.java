package Ch15;

class A {
	public void Ex1() throws NullPointerException {
		System.out.println("Ex1 process..1");
		throw new NullPointerException("Ex1 NULL Exception");

	}
}
//class A {
//	public void Ex1() {
//		try {
//			System.out.println("Ex1 process..1");
//			throw new NullPointerException("Ex1 NULL Exception");
//		} catch (NullPointerException e) {
//			System.out.println("Ex1()에서 Null 에외처리");
//		}
//		System.out.println("Ex1 process..2");
//	}
//}

class B {
	public void Ex2() throws NullPointerException {
		System.out.println("Ex2 process..1");
		throw new NullPointerException("Ex1 NULL Exception");

	}
}

public class C05ThrowAndThrowsMain {
	public static void main(String[] args) {
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		A a = new A();
		B b = new B();
		try {
			a.Ex1();
			b.Ex2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("실행코드3");
	}
}
