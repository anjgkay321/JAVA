package ONE.DaoTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ONE.Domain.BookDTO;
import ONE.Domain.BookDao;
import ONE.Domain.BookDaoImpl;

public class DaoTests {
	
	@Test
	@Disabled
	void test1() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		bookDaoImpl.insert(new BookDTO(45544,11111,"sdd","dfdf","dfdf",3));
	}
	
	@Test
	@Disabled
	void test2() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		bookDaoImpl.delete(new BookDTO(1,11111,"안","녕","하",1));
	}
	
	@Test
	@Disabled
	void test3() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		bookDaoImpl.update(new BookDTO(45544,11111,"ad","bd","cd",3));
	}
	@Test
	@Disabled
	void test4() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		BookDTO selectedbook = new BookDTO(45544,11111,"ad","bd","cd",3);
		
	}
	@Test
	void test5() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		bookDaoImpl.selectAll();
		
	}
	
}
