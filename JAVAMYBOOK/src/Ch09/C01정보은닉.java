package Ch09;

class C01Person {
	String name;
	int age;
	String addr;

	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// getter 함수(데이터를 외부로 변환)
	public String getName() {
		return this.name;
	}

	// setter 함수(기존데이터를 수정)
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class C01정보은닉 {
	public static void main(String[] args) {
		C01Person person1 = new C01Person("홍길동", 55, "대구");
		System.out.println(person1.getName());

	}

}
