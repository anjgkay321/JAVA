package Ch38.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;
import Ch38.Domain.Service.BookServiceImpl;

public class BookController implements SubController {

	private BookServiceImpl bookService;

	Map<String, Object> response;

	public BookController() {
		try {
			bookService = BookServiceImpl.getInstance();
		} catch (Exception e) {
			exceptionHandler(e);
		}
	}

	// C(1) R(2) U(3) D(4) + 로그인(5),로그아웃(6)
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute Invoke..!");
		response = new HashMap();
		Integer serviceNo = (Integer) params.get("serviceNo");
		if (serviceNo == null) {
			response.put("status", false);
			response.put("message", "유효하지 않는 서비스 요청입니다.");
			return response;
		}
		try {
		switch (serviceNo) {
		case 1: // C - 도서등록(ROLE - 사서)
			System.out.println("[SC] 도서 요청 확인");
			// 01 파라미터 받기
			String bookCode = (params.get("bookCode") != null) ? (String) params.get("bookCode") : null;
			String bookName = (params.get("bookName") != null) ? (String) params.get("bookName") : null;
			String publisher = (params.get("publisher") != null) ? (String) params.get("publisher") : null;
			String Isbn = (params.get("Isbn") != null) ? (String) params.get("Isbn") : null;
			 // 기본값
			BookDto bookDto = new BookDto(bookCode, bookName, publisher, Isbn);
			// 02 유효성검증(Data Validation)
			boolean isOk = isValid(bookDto);
			System.out.println("[No-1 회원가입] : 유효성 검증 확인 : " + isOk);

			if (!isOk) {
				response.put("status", false);
				response.put("message", "유효성 체크 오류발생!");
				return response;
			}
			// 관련 서비스 실행
			boolean isSuccess = bookService.bookRegistration(bookDto);
			// 04 뷰로 이동 or 내용전달
			if(isSuccess) {
				response.put("status", isSuccess);
				response.put("message", "도서 등록 성공");
				}
			break;
		case 2: // R - 도서조회(ROLE - 회원,사서,관리자)
			System.out.println("[SC] 도서 정보 조회 요청 확인");
			break;
		case 3: // C - 도서수정(ROLE - 회원,사서,관리자)
			System.out.println("[SC] 도서 정보 수정 요청 확인");
			break;
		case 4: // D - 도서삭제(ROLE - 회원,사서,관리자)
			System.out.println("[SC] 도서 정보 삭제 요청 확인");
			break;
		default:
			System.out.println("[SC] 잘못된 서비스번호 요청 확인");
			response.put("status", false);
			response.put("message", "잘못된 서비스요청 확인입니다");
		}
		}catch (Exception e) {
			exceptionHandler(e);
		}
		return response;
	}

	private boolean isValid(BookDto bookDto) {
		if (bookDto.getBookCode() == null || bookDto.getBookCode().length() != 8) {
			response.put("error", "[INVALID] BookCode의 길이는 최소 8자 이어야 합니다");
			System.out.println("[INVALID] BookCode의 길이는 최소 8자 이어야 합니다");
			return false;
		}
		if (bookDto.getBookName() == null || bookDto.getBookName().length() > 255) {
			response.put("error", "[INVALID] BookCode의 길이는 최소 8자 이어야 합니다");
			System.out.println("[INVALID] BookCode의 길이는 최소 8자 이어야 합니다");
			return false;
		}

		return true;
	}

	// 예외처리함수
	public Map<String, Object> exceptionHandler(Exception e) {
		if (response == null)
			response = new HashMap();
		response.put("status", false);
		response.put("message", e.getMessage());
		response.put("exception", e);
		return response;
	}
}
