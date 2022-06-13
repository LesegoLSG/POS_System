package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
	
	public static Connection getConnection(){
		
		
		try{
			String url = "jdbc:mysql://localhost:3306/student";
			String driver = "com.mysql.cj.jdbc.Driver";
			String username = "root";
			String password="lesegoLSGTSI2#";
			
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return connection;
		}catch(Throwable e){
			e.printStackTrace();
		}
		return null;
	}

}
