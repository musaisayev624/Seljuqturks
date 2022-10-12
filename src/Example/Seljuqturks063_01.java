package Example;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class Seljuqturks063_01 {
private Connection connection;
private static Seljuqturks063_01 instance;
private Seljuqturks063_01(){
}
public static Seljuqturks063_01 getInstance(){
if(instance==null){
instance=new Seljuqturks063_01();
}
return instance;
}
public Connection getConnection() throws SQLException{
if(connection==null){
DriverManager.registerDriver(new Driver());
DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","root","Musaisayev1071");
}
return connection;
}
}

