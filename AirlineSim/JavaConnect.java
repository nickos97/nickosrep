import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
Connection conn;

public static Connection ConnectDb(){
    try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesim","root","Becomelegend1");
                return conn;
              
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}

}
