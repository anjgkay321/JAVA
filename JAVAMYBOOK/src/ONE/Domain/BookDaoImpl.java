package ONE.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.Dto.UserDto;

public class BookDaoImpl implements BookDao {
	//DB
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String id = "system";
	private String pw = "1234";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//싱글톤 패턴처리
	
	private static BookDao instance;
	
	private BookDaoImpl() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("BookDaoImpl DB Connection Success");
	};
	public static BookDao getinstance() throws Exception {
		if (instance == null)
			instance = new BookDaoImpl();
		return instance;
	}
	//CRUD

	@Override
	public int insert(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("insert into booktbl values(?,?,?,?,?,?)");
			pstmt.setInt(1, bookDto.getBook_Code());
			pstmt.setInt(2, bookDto.getClassification_id());
			pstmt.setString(3, bookDto.getBook_author());
			pstmt.setString(4, bookDto.getBook_name());
			pstmt.setString(5, bookDto.getPublisher());
			pstmt.setInt(6, bookDto.getIsreservel());
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {
				pstmt.close();
			}catch(Exception e2) {
				
			}
		}
	}
	@Override
	public int update(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("insert into booktbl values(?,?,?,?,?,?)");
			pstmt.setInt(1, bookDto.getBook_Code());
			pstmt.setInt(2, bookDto.getClassification_id());
			pstmt.setString(3, bookDto.getBook_author());
			pstmt.setString(4, bookDto.getBook_name());
			pstmt.setString(5, bookDto.getPublisher());
			pstmt.setInt(6, bookDto.getIsreservel());
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {
				pstmt.close();
			}catch(Exception e2) {
				
			}
		}
	}
	@Override
	public int delete(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("insert into booktbl values(?,?,?,?,?,?)");
			pstmt.setInt(1, bookDto.getBook_Code());
			pstmt.setInt(2, bookDto.getClassification_id());
			pstmt.setString(3, bookDto.getBook_author());
			pstmt.setString(4, bookDto.getBook_name());
			pstmt.setString(5, bookDto.getPublisher());
			pstmt.setInt(6, bookDto.getIsreservel());
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BookDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {
				pstmt.close();
			}catch(Exception e2) {
				
			}
		}
	}
	// 단건조회
	@Override
	public BookDTO select(BookDTO BookDto) {
		return null;
	}

	// 다건조회
	@Override
	public List<BookDTO> selectAll() {
		return null;
	}
	
}
