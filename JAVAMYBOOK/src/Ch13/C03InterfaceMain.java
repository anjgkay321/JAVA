package Ch13;

import java.util.Scanner;

interface Remocon {
	int MAX_VOL = 100; // public static final
	int MIN_VOL = 0; // public static final

	void setVolumn(int vol);

	void powerOn();

	void powerOff();
}

interface Browser {
	void SearchURL(String url);
}

class Tv implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolumn(int vol) {
		if (MAX_VOL <= vol) {
			System.out.printf("TV 최대볼륨은 %d입니다\n", MAX_VOL);
		} else if (MIN_VOL >= vol) {
			System.out.printf("TV 최소볼륨은 %d입니다\\n", MIN_VOL);
		} else {
			System.out.printf("현재 TV 볼륨은 %d 입니다\n", vol);
		}

	}

}

class SmartTv extends Tv implements Browser {

	@Override
	public void SearchURL(String url) {
		System.out.println(url + "로 이동합니다");

	}

}

class Radio implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("RADIN를 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("RADIN를 끕니다");

	}

	@Override
	public void setVolumn(int vol) {
		if (MAX_VOL < vol) {
			System.out.printf("RADIN 최대볼륨으로 %d입니다\n", MAX_VOL);
		} else if (MIN_VOL > vol) {
			System.out.printf("RADIN 최소볼륨은 %d입니다\n", MIN_VOL);
		} else {
			System.out.printf("현재 RADIN 볼륨은 %d 입니다\n", vol);
		}
	}

}

public class C03InterfaceMain {
	public static void TurnOn(Remocon controller) {
		controller.powerOn();

	}

	public static void TurnOff(Remocon controller) {

		controller.powerOff();

	}

	public static void setVolumn(Remocon controller) {
		Scanner sc = new Scanner(System.in);
		System.out.println("볼륨을 입력하세요");
		int vol = sc.nextInt();
		controller.setVolumn(vol);
	}

	public static void Internet(Browser browser, String url) {
		browser.SearchURL(url);
	}

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		SmartTv smartTv1 = new SmartTv();
		Radio radio1 = new Radio();
		TurnOn(smartTv1);
		TurnOn(tv1);
		TurnOn(radio1);

		Internet(smartTv1, "www.naver.com");

		TurnOff(tv1);
		TurnOff(radio1);

		setVolumn(tv1);
		setVolumn(radio1);

	}
}
