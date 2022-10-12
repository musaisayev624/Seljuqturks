package Example;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
public class Seljuqturks062_02 {
public static void main(String[] args){
Connection connection=null;
try{
DriverManager.registerDriver(new Driver());
connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","root","Musaisayev1071");
Statement stmt=connection.createStatement();
//stmt.executeUpdate("insert into employee(name,surname,age,salary)values('Amin','Isayev',16,700)");
ResultSet rs=stmt.executeQuery("select*from employee");//Bize qiymet qaytarir.
while(rs.next()){
Seljuqturks062_01 seljuqturks062_01=new Seljuqturks062_01();    
seljuqturks062_01.setId(rs.getInt("id"));
seljuqturks062_01.setName(rs.getString("name"));
seljuqturks062_01.setSurname(rs.getString("surname"));
seljuqturks062_01.setAge(rs.getInt("age"));
seljuqturks062_01.setSalary(rs.getDouble("salary"));
System.out.println(seljuqturks062_01);
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