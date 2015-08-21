import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBC {
	
	public static Object[][] readTableData() throws Exception{
		Object array[][] = new Object[100][2];
		// Step -1 Load a Driver
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName(ConfigReader.getDriverName());
		// Step -2 Connect the Database
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","root");
		Connection con = DriverManager.getConnection(ConfigReader.getDBURL(),ConfigReader.getUserId(),ConfigReader.getPassword());
		// Step -2 Do a Query
		//PreparedStatement pstmt = con.prepareStatement("select userid,password from usermst");
		PreparedStatement pstmt = con.prepareStatement(ConfigReader.getSQL());
		//  Step- 3 Execute the Query
		ResultSet rs = pstmt.executeQuery();
		int row = 0;
		// Step -4 Traverse the Records and Fill it in 2-D Array
		while(rs.next()){
			array[row][0] = rs.getString("userid");
			array[row][1] = rs.getString("password");
			row++;
		}
		
		// Step -5 Close the Resources
		rs.close();
		pstmt.close();
		con.close();
		return array;
	}

}
