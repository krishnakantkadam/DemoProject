package vts.common;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Krishna
 * @since 15-05-2014.
 * @category Connection Class Using Connection Pooling
 */
public class DbConnection {
	private static Connection con = null;

	/**
	 * @return Connection Object
	 */
	public static Connection getConnection() {
		 try {  
	           Class.forName("com.mysql.jdbc.Driver");  
	           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vtsdb", "root", "");
	           //con = DriverManager.getConnection("jdbc:mysql://208.109.176.42/bitvts", "bitvts", "bitvts");
	        } 
		 catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		return con;
	}
}
