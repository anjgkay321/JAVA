package Ch13;

interface A {
	void ab();
}

interface B {
	void ab();
}

class C {

}

class D {

}

class E extends D implements A, B {

	@Override
	public void ab() {
		System.out.println("ABAB");

	}

}

public class C05InterfaceMain {

	public static void main(String[] args) {

		E ab = new E();
		ab.ab();
//		C c  =  new C();
//		c.a();
//		
//		A a = c;
//		a.a();
	}
}
