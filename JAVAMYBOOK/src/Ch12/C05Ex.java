package Ch12;

class Employee {
	public String name;
	private int age;
	private String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}

class Parttimer extends Employee {
	int timepay;

	public Parttimer(String name, int age, String addr, int timepay) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.timepay = timepay;
	}

	@Override
	public String toString() {
		return "Parttimer [timepay=" + timepay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

class Regular extends Employee {
	int Salary;

	public Regular(String name, int age, String addr, int Salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return "Regular [Salary=" + Salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

public class C05Ex {

	public static void main(String[] args) {

		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
