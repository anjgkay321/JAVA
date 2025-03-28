package Ch38.Tests.Service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;
import Ch38.Domain.Service.BookServiceImpl;
import Ch38.Domain.Service.UserServiceImpl;

public class ServiceTests {
	
	@Test
	
	void test1() throws Exception{
		UserServiceImpl userService = UserServiceImpl.getInstance();
		userService.userJoin(null);
//		userService.userJoin(new UserDto("bbb","남길동","1234","ROLE_USER"));
	}
	
	
	@Test
	@Disabled
	void test() throws Exception {
		BookServiceImpl bookServiceImpl = BookServiceImpl.getInstance();
		
		bookServiceImpl.bookRegistration(new BookDto("1010101","c언어기본","코리아미디어","1010-1010"));
	}
}
