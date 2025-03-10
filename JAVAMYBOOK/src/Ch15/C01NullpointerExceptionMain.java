package Ch15;

public class C01NullpointerExceptionMain {
	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
//			System.out.println("예외발생 : " + e);
//			System.out.println(e.getCause()); // 예외 이유 출력
//			System.out.println(e.toString()); // 예외 메세지 출력
			System.out.println(e.getStackTrace());
			e.printStackTrace(); // 예외 정보 출력
		}

		System.out.println("HelloWrold");
		System.out.println("HelloWrold");
	}
}
