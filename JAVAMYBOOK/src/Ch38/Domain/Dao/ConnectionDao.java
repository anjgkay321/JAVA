package Ch38.Domain.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ch38.Domain.Dao.ConnectionPool.ConnectionItem;
import Ch38.Domain.Dao.ConnectionPool.ConnectionPool;

public abstract class ConnectionDao {
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	//CONNECTION POOL 
	protected ConnectionPool connectionPool;
	protected ConnectionItem connectionItem;

	
	public ConnectionDao() throws SQLException{
		connectionPool = ConnectionPool.getInstance();
	}
}
