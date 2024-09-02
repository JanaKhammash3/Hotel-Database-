/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.*;
/**
 *
 * @author Jana
 */
public class test {
    public static void main(String[] args)throws SQLException{
        ConnectionProvider.initilize();
        try{
        Statement statement =ConnectionProvider.getCon().createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from room");
        //statement.execute("insert into room values(2,'t','jana')");
        //ConnectionProvider.getCon().commit();
        while(resultSet.next())
            System.out.println(resultSet.getInt(1)+","+resultSet.getNString(2)+","+resultSet.getNString(3));
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
