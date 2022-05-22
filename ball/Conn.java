package ball;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.sql.*;
public class Conn {
	
	Connection c;
	Statement St;
	ResultSet rs;

	public Conn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {	
		}
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbl","root","rapiddash2003");
			St=c.createStatement();
		}
		catch(Exception e) {
			
		}
	}
	
}
