import java.sql.*;

interface mySQL
{
	void Database1();
}
interface oracleDB{
	void Database2();
}
interface mangoDB
{
void Database3();
}
class DatabaseImps implements mySQL,oracleDB,mangoDB
{
	public void Database1() {
		System.out.println("Connect mySql database");
		/**
		String URL="jdbc:mysql://localhost:3306//";
		String userName="root";
		String password="";
		String query="select userName from Student userId=1";
		Class.forName("com.msql.jdbcDriver"); // load and register Driver
		Connection connect = DriverManager.getConnection(URL,userName,password);
		Statement st = connect.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("userName");
		st.close();
		connect.close();
		**/
	}
	public void Database2() {
		System.out.println("Connect oracle database");
	}
	public void Database3() {
		System.out.println("Connect mangoDB database");
	}
}
public class DatabaseConnectivity {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		mySQL object1 = new DatabaseImps();
		object1.Database1();
		
		oracleDB object2 = new DatabaseImps();
		object2.Database2();
		
		mangoDB object3 = new DatabaseImps();
		object3.Database3();

	}
}
