import java.sql.*;

public class conn {
	public Connection conn;
	public Statement s;

   //public PreparedStatementpstmt;
    public conn(){
    try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          String connectionurl="jdbc:mysql://localhost:3306/project11?user=root&password=";
          conn=DriverManager.getConnection(connectionurl);
          System.out.println("Connected");
          s  = conn.createStatement();
      } 
     catch(Exception e) {
      e.printStackTrace();
      }
   }
}

//import java.sql.*;
//
//public class conn {
//	public Connection c;
//	public Statement s;
//
//	public conn() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			c = DriverManager.getConnection("jdbc:mysql://192.100.0.000:3306/project11", "root", "");
//
//			s = c.createStatement();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
