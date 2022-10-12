package Example;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Seljuqturks062_03 {
private Connection connection;
private Statement statement;
private void connected(){
try{   
DriverManager.registerDriver(new Driver());
this.connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","root","Musaisayev1071");
this.statement=connection.createStatement();
}catch(SQLException sql){
System.out.println("Sql connection error:"+sql.getMessage());
}    
}
private void closed(){
try{
if(statement!=null){
statement.close();
}
if(connection!=null){
connection.close();
}
}catch(SQLException sql){
System.out.println("Connection close error:"+sql.getMessage());
}
}
public List<Seljuqturks062_01>getAllEmployess(){
List<Seljuqturks062_01>employeeList=new ArrayList();
try{
connected();
ResultSet resultSet=statement.executeQuery("select*from employee");
while(resultSet.next()){
Seljuqturks062_01 employee=new Seljuqturks062_01();
employee.setId(resultSet.getInt("id"));
employee.setName(resultSet.getString("name"));
employee.setSurname(resultSet.getString("surname"));
employee.setAge(resultSet.getInt("age"));
employee.setSalary(resultSet.getDouble("salary"));
employeeList.add(employee);
}
}catch(SQLException sql){
System.out.println("GetAll employee error:"+sql.getMessage());    
}finally{
closed();
}
return employeeList;
}
}
