package Ch38.Tests.Dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.Dao.BookDao;
import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dao.UserDao;
import Ch38.Domain.Dao.UserDaoImpl;
import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

class DaoTests { 

	@Test
	@Disabled
	void test1() throws Exception {
		
		UserDao userDaoImpl = UserDaoImpl.getInstance();
	}
	@Test
	@Disabled
	void test2() throws Exception{
		UserDao userDaoImpl = UserDaoImpl.getInstance();
		userDaoImpl.insert(new UserDto("aaa","홍길동","1234","아무거나"));
	}
	@Test
	@Disabled
	void test3() throws Exception{
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		bookDaoImpl.insert(new BookDto("1111","리눅스다","한빛미디어","111-111"));
	}
	@Test

	void test4() throws Exception{
		UserDao userDaoImpl = UserDaoImpl.getInstance();
		userDaoImpl.insert(new UserDto("ddddd","홍길동","1234","아무거나"));
	}
	@Test
	@Disabled
	void test5() throws Exception{
		
	}
	@Test
	@Disabled
	void test6() throws Exception{
		
	}

}
