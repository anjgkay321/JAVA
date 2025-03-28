package ONE.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Service.BookServiceImpl;
import ONE.Domain.BookDTO;
import ONE.Service.BookService;

public class BookController implements SubController {

	private BookService bookService;

	Map<String, Object> response;

	public BookController() {
		try {
			bookService = BookService.getInstance();
		} catch (Exception e) {
			exceptionHandler(e);
		}
	}

	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute Invoke...!");
		// 00
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
				int book_Code = ((Integer)params.get("book_Code") != null) ? (Integer) params.get("book_Code") : null;
				int Classification_id = ((Integer)params.get("Classification_id") != null)
						? (Integer) params.get("Classification_id")
						: null;
				String book_author = (params.get("book_author") != null) ? (String) params.get("book_author") : null;
				String book_name = (params.get("book_name") != null) ? (String) params.get("book_name") : null;
				String publisher = (params.get("publisher") != null) ? (String) params.get("publisher") : null;
				int isreservel = ((Integer)params.get("isreservel") != null) ? (Integer) params.get("isreservel") : null;
				// 기본값
				BookDTO bookDto = new BookDTO(book_Code, Classification_id, book_author, book_name, publisher,
						isreservel);
				// 02 유효성검증(Data Validation)
				boolean isOk = isValid(bookDto);
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
				break;
			case 3:// C - 도서수정(ROLE - 회원,사서,관리자)
				break;
			case 4:// D - 도서삭제(ROLE - 회원,사서,관리자)
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("[SC] 잘못된 서비스번호 요청 확인");
				response.put("status", false);
				response.put("message", "잘못된 서비스요청 확인입니다");
			}
		} catch (Exception e) {
			exceptionHandler(e);
		}
		return response;
	}

	// 유효성 검사
	private boolean isValid(BookDTO bookDto) {
//		String bookCodeStr = String.valueOf(bookDto.getBook_Code());
//
////		if (bookDto.getBook_Code() == 0 || bookCodeStr.length() < 2) {
////			response.put("error", "[INVALID] BookCode의 길이는 최소 8자 이어야 합니다");
////			System.out.println("[INVALID] BookCode의 길이는 최소 8자 이어야 합니다");
////			return false;
////		}

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
