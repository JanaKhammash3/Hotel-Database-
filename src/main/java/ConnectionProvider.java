/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jana
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JFrame;
public class ConnectionProvider {
    
    private static Connection con;
    public static void initilize() throws SQLException{
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jana","123456");
    }
    public static Connection getCon(){
        return con;
    }

}
