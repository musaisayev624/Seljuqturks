package Example;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Seljuqturks062_04 {
public static void main(String[] args){
Seljuqturks062_03 seljuqturks062_03=new Seljuqturks062_03();
List<Seljuqturks062_01>employeeList=seljuqturks062_03.getAllEmployess();
printEmployees(employeeList);
}
private static void printEmployees(List<Seljuqturks062_01>employeeList){
for(Seljuqturks062_01 employee:employeeList){
System.out.println(employee);    
}
}
}