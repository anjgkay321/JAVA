package ONE.DaoTests;

import org.junit.jupiter.api.Test;

import ONE.Domain.BookDTO;
import ONE.Domain.BookDao;
import ONE.Domain.BookDaoImpl;

public class DaoTests {
	
	@Test
	void test1() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getinstance();
		bookDaoImpl.insert(new BookDTO(45544,11111,"sdd","dfdf","dfdf",3));
	}
}
