package Ch16;

class Animal {
	String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

}

class Panda extends Animal {
	public Panda(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// 생성자

	@Override
	public String toString() {
		return "Panda [name = " + name + "]";
	}

}

class Tiger extends Animal {

	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tiger [name = " + name + "]";
	}

}

public class C04GenericMain {

	public static <T> void PrintByGeneric(T[] arr) {
		for (T el : arr)
			System.out.println(el);
	}

	// OBJECT
	public static void PrintByObject(Object[] animal) {
		for (Object el : animal) {
			System.out.println(el);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger arr1[] = { new Tiger("시베리안 호랑이"), new Tiger("신사동호랭이") };
		PrintByGeneric(arr1);
		Panda arr2[] = { new Panda("판다"), new Panda("래서판다") };
		PrintByGeneric(arr2);

		Object arr3[] = { new Tiger("시베리안 호랑이"), new Tiger("신사동호랭이"), new Panda("판다"), new Panda("래서판다") };
		PrintByGeneric(arr3);
	}

}
