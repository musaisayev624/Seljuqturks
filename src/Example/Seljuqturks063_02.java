package Example;
//import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Seljuqturks063_02 {
public List<Seljuqturks062_01>getAllEmployess(){
List<Seljuqturks062_01>employeeList=new ArrayList();
try(Connection connection=Seljuqturks063_01.getInstance().getConnection();){
PreparedStatement statement=connection.prepareStatement("select*from employee");
ResultSet resultSet=statement.executeQuery();
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
}
return employeeList;
}
public void insert(Seljuqturks062_01 employee){
try(Connection connection=Seljuqturks063_01.getInstance().getConnection()){
PreparedStatement statement=connection.prepareStatement("insert into employee(name,surname,age,salary)values(?,?,?,?)");
statement.setString(1,employee.getName());
statement.setString(2,employee.getSurname());
statement.setInt(3,employee.getAge());
statement.setDouble(4,employee.getSalary());
statement.executeUpdate();
}catch(SQLException sql){
System.out.println("Insert employee error:"+sql.getMessage());
}
}
public void update(Seljuqturks062_01 employee){
try(Connection connection=Seljuqturks063_01.getInstance().getConnection()){
PreparedStatement statement=connection.prepareStatement("update employee set name?,surname=?,age=?,where id=?");
statement.setString(1,employee.getName());
statement.setString(2,employee.getSurname());
statement.setInt(3,employee.getAge());
statement.setDouble(4,employee.getSalary());
statement.setInt(5,employee.getId());
}catch(SQLException sql){
System.out.println("Update employee error:"+sql.getMessage());
}
}
public void delete(int id){
try(Connection connection=Seljuqturks063_01.getInstance().getConnection()){
PreparedStatement statement=connection.prepareStatement("delete from employee where id=?");
statement.setInt(1,id);
statement.executeUpdate();
}catch(SQLException sql){
System.out.println("Delete employee error:"+sql.getMessage());
}
}
}

