package ONE.DaoTests;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ONE.Controller.FrontController;
import ONE.Domain.BookDTO;

class ControllerTests {

	FrontController fc = FrontController.getInstance();

	@Test
	@Disabled
	void test1() {
		// View에서 요청정보 담기
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);

		// 회원가입 인자전달
		params.put("book_Code", 123123);
		params.put("Classification_id", 11111);
		params.put("book_author", "aa");
		params.put("book_name", "bb");
		params.put("publisher", "cc");
		params.put("isreserve", 1);
		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}

	}

	@Test
	@Disabled
	
	void test2() {
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 4);
				
		params.put("book_Code", 321);
//		params.put("Classification_id", 11111);
//		params.put("book_author", "a");
//		params.put("book_name", "b");
//		params.put("publisher", "c");
//		params.put("isreservel", 1);
		
		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}

	}

	@Test
	@Disabled
	void test3() {
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 3);
		
		params.put("book_Code", 321);
		params.put("Classification_id", 11111);
		params.put("book_author", "aa");
		params.put("book_name", "bb");
		params.put("publisher", "cc");
		params.put("isreservel", 1);
		
		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}

	@Test
	@Disabled
	void test4() {
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 2);
		
		params.put("book_Code", 321);
		
		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
			
		}
	}

	@Test
//	@Disabled
	void test5() {
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 3);
		
		
		// 요청하기
		Map<String, Object> response = fc.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}

	@Test
	@Disabled
	void test6() {

	}
}
