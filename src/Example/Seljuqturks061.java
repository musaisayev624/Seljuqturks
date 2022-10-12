package Example;
import com.mysql.cj.jdbc.Driver;
/*import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
*/
import java.sql.*;
public class Seljuqturks061 {
public static void main(String[] args){
Connection connection=null;
try{
DriverManager.registerDriver(new Driver());
connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","root","Musaisayev1071");
Statement stmt=connection.createStatement();
//stmt.executeUpdate("insert into employee(name,surname,age,salary)values('Amin','Isayev',16,700)");
ResultSet rs=stmt.executeQuery("select*from employee");//Bize qiymet qaytarir.
while(rs.next()){
int id=rs.getInt("id");
String name=rs.getString("name");
String surname=rs.getString("surname");
int age=rs.getInt("age");
double salary=rs.getDouble("salary");
System.out.println("id="+id+",name="+name+",surname="+surname+",age="+age+",salary="+salary);
}
}catch(SQLException sql){
sql.printStackTrace();
}finally{
if(connection!=null){
try{
connection.close();
}catch(SQLException sql){
}
}
}
}
}