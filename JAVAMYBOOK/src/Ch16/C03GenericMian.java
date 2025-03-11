package Ch16;

class Person {
	String name;
	String age;
	String addr;

	// 생성자
	public Person(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

}

class Man extends Person {
	// 생성자
	public Man(String name, String age, String addr) {
		super(name, age, addr);
	}

	@Override
	public String toString() {
		return "Man";
	}

}

class Woman extends Person {
	// 생성자
	public Woman(String name, String age, String addr) {
		super(name, age, addr);

	}

	@Override
	public String toString() {
		return "Woman";
	}

}

class Couple<X extends Person, Y extends Person> {
	private X Member1;
	private Y Member2;

	// 생성자
	public Couple(X member1, Y member2) {
		super();
		Member1 = member1;
		Member2 = member2;
	}

	// toString
	@Override
	public String toString() {
		return "Couple [Member1=" + Member1 + ", Member2=" + Member2 + "]";
	}

}

public class C03GenericMian {
	public static void main(String[] args) {
		Couple<Man, Woman> couple1 = new Couple<Man, Woman>(new Man("철수", "50", "대구"), new Woman("영희", "40", "울산"));
		System.out.println("couple1 : " + couple1);

		Couple<Man, Woman> couple2 = new Couple<Man, Woman>(new Man("철수2", "50", "대구"), new Woman("영희2", "40", "울산"));
		System.out.println("couple1 : " + couple2);

//		Couple<Integer, Integer> couple3 = new Couple<Integer, Integer>(100, 100);
//		System.out.println("couple1 : " + couple3);
	}
}
