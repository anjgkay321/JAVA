package ONE.DaoTests;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ONE.Controller.FrontController;

class ControllerTests {
	
	FrontController fc = FrontController.getInstance();
	
	@Test
	void test1() {
		//View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		
		//회원가입 인자전달
		params.put("book_Code", 12345678);
		params.put("Classification_id", 11111);
		params.put("book_author", "ㅁㅇㄴ");
		params.put("book_name", "ㅇㅁㄴㄹㅇㄴㅁㄹ");
		params.put("publisher", "ㅁㄴㅇㄹㅇㄴㅁㄻ");
		params.put("isreservel", 2);
		//요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}

	}
	@Test
	@Disabled
	void test2() {
		
	}
	@Test
	@Disabled
	void test3() {
		
	}
	@Test
	@Disabled
	void test4() {
		
	}
	@Test
	@Disabled
	void test5() {
		
	}
	@Test
	@Disabled
	void test6() {
		
	}
}
