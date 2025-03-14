package Ch19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
//https://www.selenium.dev/downloads/

//크롬드라이브 다운로드 경로
//https://googlechromelabs.github.io/chrome-for-testing/#stable

public class C11SelenumAPIMain {

	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "src/Drivers/chromedriver.exe";

	public static void main(String[] args) {
		// 브라우저 옵션
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless"); // 백그라운드 실행
//		options.addArguments("--no-sandbox");   //리눅스 환경 sendbox사용여부

		// 브라우저 동작
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");

		// 특정 우치 요소 선택(키워드 입력하기)

		WebElement searchE1 = driver.findElement(By.id("query"));

		// 키워드 입력
		searchE1.sendKeys("노트북");

		// 엔터키 전달
		searchE1.sendKeys(Keys.RETURN);

		// 노트북 검색 이후에 쇼핑 버튼 클릭
		WebElement shoppingBtnE1 = driver.findElement(By.cssSelector(".api_pcpg_wrap .tab:nth-child(1)"));
		shoppingBtnE1.click();
	}

}
