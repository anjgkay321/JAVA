package Ch08;

//홍길동이 		-       사과장수에게 사과를 구매한다
// 고객    		-		판매자
//보유금액(속성)    		보유금액(속성) 
//사과개수(속성)			사과개수(속성)
//						개당 가격(속성)
//구매하기							판매하기(기능)
// 1)특정 사과 장수에게 돈을 건넨다 -> 
// 								2)돈을 내 보유금액에 누적
//								3)사과개수 계산 ->나의 보유사과개수에서 차감 -> 사과개수 전달
// 4)나의 보유사과개수에 누적

class Buter {
	private int myMoney;
	private int appleCnt;

	// 모든 인자생성자
	public Buter(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	// toString

	@Override
	public String toString() {
		return "Buter [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}

	public void payment(Seller seller, int money) {
		// 내 보유금액에서 차감
		this.myMoney -= money;

		// Seller에 money를 전달하고 리턴되는 사과개수 누적
		int seller1 = seller.seceive(money);
		this.appleCnt = seller1;

	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getAppleCnt() {
		return appleCnt;
	}

	public void setAppleCnt(int appleCnt) {
		this.appleCnt = appleCnt;
	}

}

class Seller {
	private int myMoney;
	private int appleCnt;
	private int price;

	// 모든인자생성
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}

	public int seceive(int money) {
		// 구매자로부터 전달받은 money를 내 보유금액에 누적
		myMoney += money;
		// 전달받은금액/사과개수 를 리턴
		int apples = money / price;
		appleCnt -= apples;
		return apples;
	}

}

public class C10Main {
	public static void main(String[] args) {
		Seller seller = new Seller(10000, 100, 1000);

		Buter 홍길동 = new Buter(10000, 0);
		Buter 노홍철 = new Buter(5000, 0);

		홍길동.payment(seller, 5000);
		노홍철.payment(seller, 2000);

		System.out.println(홍길동);
		System.out.println("---------");
		System.out.println(노홍철);
		System.out.println("---------");
		System.out.println(seller);
	}
}
