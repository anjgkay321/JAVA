package Ch08;

class Tv {
	String tv;
	int age;
	int size;

	public Tv(String tv, int age, int size) {
		this.tv = tv;
		this.age = age;
		this.size = size;
	}

	void show() {
		System.out.printf("%s티비는 %d만원이고 %d인치입니다", this.tv, this.age, this.size);
	}
}

public class Chtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv myTv = new Tv("lg", 17, 32);
		myTv.show();
	}

}
