package Ch19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C13Ex {
	public static void main(String[] args) throws IOException, InterruptedException {
		// OpenWeatherMap API URL
		String city = "Daegu"; // 원하는 도시 이름
		String apiKey = "YOUR_API_KEY"; // 여기에 발급받은 API 키 입력
		String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

		// HttpRequest 객체 생성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		// HttpClient 객체 생성
		HttpClient httpClient = HttpClient.newHttpClient();

		// 응답 받기
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		// 응답 상태 코드 확인
		if (response.statusCode() != 200) {
			System.out.println("Error: Unable to fetch weather data. HTTP Status Code: " + response.statusCode());
			return;
		}

		// JSON 파싱
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(response.body());

		// 날씨 데이터 출력
		String weatherDescription = jsonNode.get("weather").get(0).get("description").asText();
		double temperature = jsonNode.get("main").get("temp").asDouble();
		double humidity = jsonNode.get("main").get("humidity").asDouble();
		double pressure = jsonNode.get("main").get("pressure").asDouble();

		System.out.println("Weather in " + city + ": " + weatherDescription);
		System.out.println("Temperature: " + temperature + "°C");
		System.out.println("Humidity: " + humidity + "%");
		System.out.println("Pressure: " + pressure + " hPa");
	}
}
