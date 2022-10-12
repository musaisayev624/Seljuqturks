package Example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Seljuqturks063_04 {
public List<Seljuqturks063_03>getAllAddress(){
List<Seljuqturks063_03>addresses=new ArrayList<>();
try(Connection connection=Seljuqturks063_01.getInstance().getConnection()){
PreparedStatement statement=connection.prepareStatement("select * from address");
ResultSet resultSet=statement.executeQuery();
while(resultSet.next()){
}
}catch (SQLException sqlException){
}
return addresses;
}
}