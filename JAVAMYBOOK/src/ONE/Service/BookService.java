package ONE.Service;


import ONE.Domain.BookDTO;
import ONE.Domain.BookDao;
import ONE.Domain.BookDaoImpl;

public class BookService {
	private BookDao bookDao;
	//싱글톤패턴
	private static BookService instance;
	private BookService() throws Exception {
		bookDao = BookDaoImpl.getinstance();
		System.out.println("[SERVICE] BookService init...");
	};
	public static BookService getInstance() throws Exception {
		if(instance==null)
			instance =new BookService();
		return instance;
	}
	//회원가입 ( + TX 처리필요)
	public boolean bookRegistration(BookDTO bookDto) throws Exception{
		return bookDao.insert(bookDto) > 0;
	};
	
}
