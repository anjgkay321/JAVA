package ONE.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ONE.Controller.FrontController;


public class TUI {

	//사용자 상태정보
	private int book_Code;
	private int Classification_id;
	private String book_author;
	private String book_name;
	private String publisher;
	private int isreservel;
	
	private Scanner sc = new Scanner(System.in);
	
	private FrontController controller;
	TUI() {
		controller = FrontController.getInstance();
	}
	public void MainMenu() {
		while (true) {
			System.out.println("--------------MENU------------");
			System.out.println("1 Book_tbl");
			System.out.println("2 Member_Tbl");
			System.out.println("3 Rental_Tbl");
			System.out.println("4 Exit");
			System.out.println("--------------MENU------------");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				BookMenu();
				break;
			case 2:

				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(-1);
			}
		}
	}
	public void BookMenu() {
		System.out.println("-----------BOOK--------");
		System.out.println("1 등록");
		System.out.println("2 조회");
		System.out.println("3 전체조회");
		System.out.println("4 수정");
		System.out.println("5 삭제");
		System.out.println("6 돌아가기");
		System.out.println("-----------BOOK--------");
		System.out.print("번호 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			BookInsert();
			break;
		case 2:
			Bookselect();
			break;
		case 3:
			BookselectAll();
			break;
		case 4:
			BookUpdate();
			break;
		case 5:
			Bookdelete();
			break;
		case 6 :
			System.out.println("프로그램을 종료합니다.");
			System.exit(-1);
		}
		
	}
	public void BookInsert() {
		System.out.println("-----------BOOK--------");
		System.out.println("도서자료를 입력하세요");
		System.out.println("1 book_Code : ");
		int book_Code = sc.nextInt();
		System.out.println("2 Classification_id : ");
		int Classification_id = sc.nextInt();
		System.out.println("3 book_author : ");
		String book_author=sc.next();
		System.out.println("4 book_name : ");
		String book_name=sc.next();
		System.out.println("5 publisher : ");
		String publisher=sc.next();
		System.out.println("6 isreserve : ");
		int isreserve =sc.nextInt();
		
		//요청처리
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("book_Code", book_Code);
		params.put("Classification_id", Classification_id);
		params.put("book_author", book_author);
		params.put("book_name", book_name);
		params.put("publisher", publisher);
		params.put("isreservel", isreserve);
		
		Map<String,Object> response = controller.execute(params);
		
		for(String key : response.keySet())
			System.out.println(key + " : " + response.get(key));
	}
	public void Bookselect() {
		System.out.println("-----------BOOK--------");
		System.out.println("조회 도서자료를 입력하세요");
		int book_Code = sc.nextInt();
		
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 2);
		
		params.put("book_Code", book_Code);
		
	Map<String,Object> response = controller.execute(params);
		
		for(String key : response.keySet())
			System.out.println(key + " : " + response.get(key));
	}
	public void BookselectAll() {
		System.out.println("-----------BOOK--------");
		System.out.println("전체 도서 자료입니다");	
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 3);
		
		
	Map<String,Object> response = controller.execute(params);
		
		for(String key : response.keySet())
			System.out.println(key + " : " + response.get(key));
	}
	public void BookUpdate() {
		System.out.println("-----------BOOK--------");
		System.out.println("수정할 도서자료를 입력하세요");
		System.out.println("1 book_Code : ");
		int book_Code = sc.nextInt();
		System.out.println("2 Classification_id : ");
		int Classification_id = sc.nextInt();
		System.out.println("3 book_author : ");
		String book_author=sc.next();
		System.out.println("4 book_name : ");
		String book_name=sc.next();
		System.out.println("5 publisher : ");
		String publisher=sc.next();
		System.out.println("6 isreserve : ");
		int isreserve =sc.nextInt();
		//요청처리
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 4);
		
		params.put("book_Code", book_Code);
		params.put("Classification_id", Classification_id);
		params.put("book_author", book_author);
		params.put("book_name", book_name);
		params.put("publisher", publisher);
		params.put("isreserve", isreserve);

		Map<String,Object> response = controller.execute(params);
		for(String key : response.keySet())
			System.out.println(key + " : " + response.get(key));
	}
	public void Bookdelete() {
		System.out.println("-----------BOOK--------");
		System.out.println("삭제할 도서자료를 입력하세요");
		System.out.println("1 book_Code : ");
		int book_Code = sc.nextInt();
		
		//요청처리
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 5);
		params.put("book_Code", book_Code);
		
		Map<String,Object> response = controller.execute(params);
		for(String key : response.keySet())
			System.out.println(key + " : " + response.get(key));
	}

}
