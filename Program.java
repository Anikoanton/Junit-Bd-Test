import java.sql.*;

public class Program

{

public static void main (String ... args)

{
try 

{
Class.forName("org.sqllite.JDBC");
Connection co = DriverManager.getConnection (
"jdbc.sqlite:users.db")
}

catch (Exception e)
{
System.out.println(e.getMassage());
}

}

}