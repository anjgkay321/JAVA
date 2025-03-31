package ONE.Domain;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {

	int insert(BookDTO bookDto) throws Exception;
	


	int update(BookDTO bookDto) throws Exception;

	int delete(BookDTO bookDto) throws Exception;

	// 단건조회
	BookDTO select(BookDTO userDto) throws Exception;

	// 다건조회
	List<BookDTO> selectAll() throws Exception;

}