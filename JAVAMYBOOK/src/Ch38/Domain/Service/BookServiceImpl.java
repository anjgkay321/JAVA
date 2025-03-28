package Ch38.Domain.Service;

import java.sql.SQLException;

import Ch38.Domain.Dao.BookDao;
import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dao.UserDaoImpl;
import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

public class BookServiceImpl {
	private BookDao bookDao;
	//싱글톤패턴
	private static BookServiceImpl instance;
	private BookServiceImpl() throws ClassNotFoundException, SQLException  {
		bookDao = BookDaoImpl.getinstance();
		System.out.println("[SERVICE] UserServiceImpl init...");
	};
	
	public static BookServiceImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance==null)
			instance =new BookServiceImpl();
		return instance;
	}
	
	//회원가입 ( + TX 처리필요)
	public boolean bookRegistration(BookDto bookDto) throws Exception{
		return bookDao.insert(bookDto) > 0;
	};
	//회원조회
	
	//회원정보수정
	
	//회원탈퇴
	
	//로그인
	
	//로그아웃
	
	
}
