package Ch12;

class Super {
	int n1;
}

class Sub extends Super {
	int n2;

}

public class C06UpDownCastingMain {
	public static void main(String[] args) {
		// NoCasting(자료형의 일치)
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;

		// UpCasting(상위클래스 참조변수 = 하위클래형 객체)(자동 형변환)
		// 상속관계로 연결된 모든 하위객체를 연결할수 있다
		Super ob3 = new Sub();
		ob3.n1 = 100;
//		ob3.n2 = 200;// 접근불가능
		Super ob4 = ob2;
		ob4.n1 = 100;
//		ob4.n2 = 100;
		Sub ob5 = ob2;
		ob5.n1 = 100;
		ob5.n2 = 100;
		// DownCasting(하위클래형 참조변수 = 상위클래스 객체)(강제 형변환)
		// Upcasting 된 상태에서 확장된 멤버에 접근하기 위한 용도
		Sub ob6 = (Sub) ob1;
		Sub ob7 = (Sub) ob3;

	}
}
