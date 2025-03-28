package ONE.Domain;

import java.util.List;

public interface BookDao {

	int insert(BookDTO bookDto) throws Exception;

	int update(BookDTO bookDto) throws Exception;

	int delete(BookDTO bookDto) throws Exception;

	// 단건조회
	BookDTO select(BookDTO userDto);

	// 다건조회
	List<BookDTO> selectAll();

}