import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MycodeSQLServerConnection {

	public static void main(String[] args) throws SQLException{
		
		String host="EDGEFITSQL03";
		String port="1433";
		//connection url ="jdbc:jtds:sqlserver://"+host+":"+port+"/databasename";
		Connection conn=DriverManager.getConnection("jdbc:jtds:sqlserver://"+host+":"+port+"/EtrackSystem417_SQL;instance=FITSQLI","appuser","N3wFitsql!");
		
		
		Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select FirstName, Lastname, * from Jobseeker where FirstName='test' and Lastname='test'");
		while(rs.next())
		{
		System.out.println(rs.getString("FirstName"));
		System.out.println(rs.getString("Lastname"));
		System.out.println(rs.getString("EMail"));
		System.out.println("Candidate is present");
		System.out.println(rs.getString("JobseekerID"));
		int jobseekerID= (rs.getInt("JobseekerID"));

		if (rs.getString("EMail").equals("test@test.com") && (rs.getString("FirstName").equals("test")))
		{
						
			//Connection conn1=DriverManager.getConnection("jdbc:jtds:sqlserver://"+host+":"+port+"/EtrackSystem417_SQL;instance=FITSQLI","appuser","N3wFitsql!");
			
			Statement s1=conn.createStatement();
			
			int rs1=s1.executeUpdate("Delete from JobseekerTracking where JobseekerID='48398'");

			rs1=s1.executeUpdate("Delete from Jobseeker where EMail='test@test.com' and FirstName='test'");
	
			System.out.println("Record Deleted");

		}

		else
		{
			System.out.println("Candidate is NOT present to delete");
		}

		}
		
			}
	
		
	
}
