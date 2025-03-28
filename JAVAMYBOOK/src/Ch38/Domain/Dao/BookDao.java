package Ch38.Domain.Dao;

import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

public interface BookDao {

	// CRUD
	int insert(BookDto bookDto) throws Exception;

	int update(BookDto bookDto) throws SQLException;

	int delete(BookDto bookDto) throws SQLException;

	// 단건조회
	UserDto select(UserDto userDto);

	// 다건조회
	List<UserDto> selectAll();

}