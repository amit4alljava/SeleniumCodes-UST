import java.util.ResourceBundle;


public class ConfigReader {
// This is used to read the config.properties file	
static ResourceBundle rb = ResourceBundle.getBundle("config");

public static String getDriverName(){
	return rb.getString("drivername");
}
public static String getDBURL(){
	return rb.getString("dburl");
}
public static String getUserId(){
	return rb.getString("userid");
}
public static String getPassword(){
	return rb.getString("password");
}
public static String getSQL(){
	return rb.getString("sql");
}
public static String getExcelPath(){
	return rb.getString("excelpath");
}
}
