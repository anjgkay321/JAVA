package Ch23;

public class C01ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("TASK01...");
			Thread.sleep(500);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("TASK02...");
			Thread.sleep(500);
		}

	}

}
