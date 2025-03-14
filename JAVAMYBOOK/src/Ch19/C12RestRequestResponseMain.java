package Ch19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C12RestRequestResponseMain {
	public static void main(String[] args) throws IOException, InterruptedException {
		// URL, PARAM 지정
		String url = "https://www.daegufood.go.kr/kor/api/tasty.html";
		String mode = "json";
		String addr = "중구";
		url = url + "?mode=" + mode + "&addr=" + addr; 

		// HttpRequest 객체 생성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		// HttpClient 객체 생성
		HttpClient httpClient = HttpClient.newHttpClient();

		// 응답 받기
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		// 응답 상태 코드 확인
		if (response.statusCode() != 200) {
			System.out.println("Error: Unable to fetch data. HTTP Status Code: " + response.statusCode());
			return;
		}

		// JSON 파싱
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(response.body());

		// 상태 코드 및 총 데이터 확인 (필드 이름 정확히 확인 필요)
		System.out.println("Status: " + jsonNode.get("status")); // 'Status' 필드 이름 확인
		System.out.println("Total: " + jsonNode.get("total")); // 'total' 필드 이름 확인

		// 데이터 배열 처리
//		JsonNode dataArr = jsonNode.get("data");
//		if (dataArr != null && dataArr.isArray()) {
//			for (int i = 0; i < dataArr.size(); i++) {
//				JsonNode e1 = dataArr.get(i);
//				System.out.println(e1.get("BZ_NM"));
//			}
//		} else {
//			System.out.println("No data available.");
//		}
//	}
		//CLASS TYPE
		ResponseObject responseObject = objectMapper.readValue(response.body(), ResponseObject.class);
		System.out.println("Status: " + jsonNode.get("status")); // 'Status' 필드 이름 확인
		System.out.println("Total: " + jsonNode.get("total")); // 'total' 필드 이름 확인
	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/*
	 * ObjectMapper om = new ObjectMapper(); Root root = om.readValue(myJsonString,
	 * Root.class);
	 */
	public static class Data {
		public String cnt;
		@JsonProperty("OPENDATA_ID")
		public String oPENDATA_ID;
		@JsonProperty("GNG_CS")
		public String gNG_CS;
		@JsonProperty("FD_CS")
		public String fD_CS;
		@JsonProperty("BZ_NM")
		public String bZ_NM;
		@JsonProperty("TLNO")
		public String tLNO;
		@JsonProperty("MBZ_HR")
		public String mBZ_HR;
		@JsonProperty("SEAT_CNT")
		public String sEAT_CNT;
		@JsonProperty("PKPL")
		public String pKPL;
		@JsonProperty("HP")
		public String hP;
		@JsonProperty("PSB_FRN")
		public String pSB_FRN;
		@JsonProperty("BKN_YN")
		public String bKN_YN;
		@JsonProperty("INFN_FCL")
		public String iNFN_FCL;
		@JsonProperty("BRFT_YN")
		public String bRFT_YN;
		@JsonProperty("DSSRT_YN")
		public String dSSRT_YN;
		@JsonProperty("MNU")
		public String mNU;
		@JsonProperty("SMPL_DESC")
		public String sMPL_DESC;
		@JsonProperty("SBW")
		public String sBW;
		@JsonProperty("BUS")
		public String bUS;
	}

	public static class ResponseObject {
		public String status;
		public String total;
		public ArrayList<Data> data;
	}

}
