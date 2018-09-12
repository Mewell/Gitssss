package maylor.system.dao.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	/**
	 * 数据库的链接类
	 */
	// Mysql 数据库连接类 --查看根目录下的Database_script.sql文件
	// 在发布jar文件时要把mysql驱动一起打包
	private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName=_library";
	private static final String DBUSER = "sa"; // mysql用户名
	private static final String DBPASS = "asdfgh.1314"; // mysql密码
	private Connection conn = null;

	public DataBaseConnection() {
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.conn;
	}

	public void close() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
