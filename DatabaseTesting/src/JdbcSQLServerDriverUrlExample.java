import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSQLServerDriverUrlExample
{
  public static void main(String[] args)
  {
    Connection connection = null;
    try
    {
      // the sql server driver string
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    
      // the sql server url
      
     String url ="jdbc:jtds:sqlserver://EDGEFITSQL03:1433/ETRACKCommon_SQL;instance=FITSQLI";
      
      // get the sql server database connection
      connection = DriverManager.getConnection(url,"appuser", "N3wFitsql!");
      System.out.println("Connected");
      // now do whatever you want to do with the connection
      // ...
      
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
      System.exit(1);
    }
    catch (SQLException e)
    {
      e.printStackTrace();
      System.exit(2);
    }
  }
}
