package co.micol.miniproject.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource { // 싱글톤 패턴
	private static DataSource dataSource;
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public static Connection conn;

	private DataSource() {
		try {
			getProperty();
			Class.forName(driver);
			
			System.out.println("DB 연결 성공!!!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("DB 연결 실패!!!!!");
		}
	}
	
	private void getProperty() { // db.properties 파일에서 정보를 가져온다
		String resource = "/db.properties";
		Properties properties = new Properties();
		try {
			InputStream reader = getClass().getResourceAsStream(resource);
			properties.load(reader);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DataSource getInstance() {
//		dataSource = new DataSource();
		DataSource dataSource  = new DataSource();
		return dataSource;
	}

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
