package Ch17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C07Ex {
	static Map<String, Object> map = new HashMap();

	// 01 함수의 파라미터 형으로 사용되는 경우
	public static void setMap(Map<String, Object> params) {
		// params console에 출력

		// params를 map 에 저장
		map.putAll(params);
		for (String key : params.keySet()) {
			Object value = params.get(key);
			System.out.println(params + " : " + map.get(key));

			map.putAll(params);

		}
	}

	@Override
	public String toString() {
		return "C07Ex []";
	}

	// 02 함수의 리턴형으로 사용되는 경우
	public static Map<String, Object> getMap() {
		return map;
	}

	public static void main(String[] args) {
		// 01 파라미터 생성
		Map<String, Object> params = new HashMap();
		// 02 데이터 전달
		String[] value = { "정보처리기사", "빅데이터분석기사", "네트워크 관리사", "--" };

		params.put("자격증", value);
		setMap(params);
		params.clear();
		// 02 데이터 전달
		List<String> hobby = new ArrayList();
		hobby.add("등산");
		hobby.add("독서");
		hobby.add("게임");
		params.put("취미", hobby);
		setMap(params);

		// 03 데이터 확인
		// getMap이용해서 저장된 데이터 확인(출력)

	}
}
