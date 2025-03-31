package ONE.Service;


import java.util.List;

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
	//도서등록
	public boolean bookRegistration(BookDTO bookDto) throws Exception{
		return bookDao.insert(bookDto) > 0;
	};
	//도서 조회
	public BookDTO bookselect(BookDTO bookDto) throws Exception {
		return bookDao.select(bookDto);
	}
	//도서 전체 조회
	public List<BookDTO> bookselectAll() throws Exception {
		return bookDao.selectAll();
	}
	
	//도서 수정
	public boolean bookUpdate(BookDTO bookDto) throws Exception{
		return bookDao.update(bookDto) > 0;
	};
	//도서 삭제
	public boolean bookDelete(BookDTO bookDto) throws Exception{
		return bookDao.delete(bookDto) > 0;
	};
	
}
