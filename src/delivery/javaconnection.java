
package delivery;

import java.sql.*;
import javax.swing.*;

public class javaconnection {
Connection conn=null;

public static Connection ConnectDB(){
    
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\niko\\Documents\\NetBeansProjects\\Delivery\\db\\Delivery.sqlite");
    return conn;
    
}catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
}
}