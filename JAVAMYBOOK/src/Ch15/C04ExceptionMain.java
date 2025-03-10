package Ch15;

public class C04ExceptionMain {

	public static void main(String[] args) {

//		try {
//			String str = null;
//			str.toString();
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		}
//		try {
//			int arr[] = { 10, 20, 30 };
//			arr[5] = 100;
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		try {
//			Integer.parseInt("a1234");
//		} catch (NumberFormatException e) {
//			System.out.println(e);
//		}
//		try {
//			Animal animal = new Dog();
//			Cat yummi = (Cat) animal;
//		} catch (ClassCastException e) {
//			System.out.println(e);
//		}
		try {
			String str = null;
			str.toString();

			int arr[] = { 10, 20, 30 };
			arr[5] = 100;

			Integer.parseInt("a1234");

			Animal animal = new Dog();
			Cat yummi = (Cat) animal;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 자원 정리 작업
			System.out.println("Finally Test..");
		}

		System.out.println("HelloWorld");
	}

}
