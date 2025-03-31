package ONE.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
	// DB
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String id = "system";
	private String pw = "1234";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";

	// 싱글톤 패턴처리

	private static BookDao instance;

	private BookDaoImpl() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("BookDaoImpl DB Connection Success");
	};

	public static BookDao getinstance() throws Exception {
		if (instance == null)
			instance = new BookDaoImpl();
		return instance;
	}
	// CRUD

	@Override
	public int insert(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("insert into booktbl values(?,?,?,?,?,?)");
			pstmt.setInt(1, bookDto.getBook_Code());
			pstmt.setInt(2, bookDto.getClassification_id());
			pstmt.setString(3, bookDto.getBook_author());
			pstmt.setString(4, bookDto.getBook_name());
			pstmt.setString(5, bookDto.getPublisher());
			pstmt.setInt(6, bookDto.getIsreserve());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's INSERT SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {

			}
		}
	}

	@Override
	public int update(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement(
					"update booktbl set Classification_id = ? ,book_author=? ,book_name=?,publisher=?,isreserve=? where book_Code=?");
			pstmt.setInt(1, bookDto.getClassification_id());
			pstmt.setString(2, bookDto.getBook_author());
			pstmt.setString(3, bookDto.getBook_name());
			pstmt.setString(4, bookDto.getPublisher());
			pstmt.setInt(5, bookDto.getIsreserve());
			pstmt.setInt(6, bookDto.getBook_Code());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's Update SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {

			}
		}
	}

	@Override
	public int delete(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("delete from booktbl where book_Code = ?");

			pstmt.setInt(1, bookDto.getBook_Code());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's delete SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {

			}
		}
	}

	// 단건조회
	@Override
	public BookDTO select(BookDTO bookDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("select * from booktbl where book_Code =?");
			pstmt.setInt(1, bookDto.getBook_Code());
			rs = pstmt.executeQuery();

			if (rs.next()) {
				BookDTO selectedbook = new BookDTO();
				selectedbook.setBook_Code(rs.getInt("book_Code"));
				selectedbook.setClassification_id(rs.getInt("Classification_id"));
				selectedbook.setBook_author(rs.getString("book_author"));
				selectedbook.setBook_name(rs.getString("book_name"));
				selectedbook.setPublisher(rs.getString("publisher"));
				selectedbook.setIsreserve(rs.getInt("isreserve"));
				return selectedbook;

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's delete SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		return null;

	}

	// 다건조회
	@Override
	public List<BookDTO> selectAll() throws Exception {
		List<BookDTO> bookList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("select * from booktbl");
			rs = pstmt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					BookDTO selectedALLbook = new BookDTO();
					selectedALLbook.setBook_Code(rs.getInt("book_Code"));
					selectedALLbook.setClassification_id(rs.getInt("Classification_id"));
					selectedALLbook.setBook_author(rs.getString("book_author"));
					selectedALLbook.setBook_name(rs.getString("book_name"));
					selectedALLbook.setPublisher(rs.getString("publisher"));
					selectedALLbook.setIsreserve(rs.getInt("isreserve"));
					bookList.add(selectedALLbook);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's  SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		return bookList;

	}

}
