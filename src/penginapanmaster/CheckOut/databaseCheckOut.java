/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lukman
 */
public class databaseCheckOut {
    public final String driver  = "com.mysql.jdbc.Driver";
    public final String url     = "jdbc:mysql://localhost/db10116331Penginapan";
    public final String user    = "root";
    public final String pass    = "";
    
     Connection conn = null;
     Statement stmt = null;
     checkOut ck = null;   
    
    
    public void select_checkIn(int id){
      try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            
            
            String sql;
           sql = "select * from booking inner join customer on customer.id_customer = booking.id_booking inner join room on room.id_room = booking.id_room WHERE id_booking ="+id ;
            ResultSet rs = stmt.executeQuery(sql);
        
            
          while(rs.next()){
               this.ck = new checkOut(
                        rs.getInt("id_booking"),
                        rs.getInt("id_customer"),
                        rs.getInt("id_room"),
                        rs.getDate("check_in"),
                        rs.getDate("check_out"),
                        rs.getInt("lama"),
                        rs.getInt("total"),
                        rs.getInt("no_room"),
                        rs.getString("class_room"),
                        rs.getString("nama"));
            }
         } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public void setUsedRoom(int id){
         try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
             String sql;
            sql = "UPDATE `room` SET `status` = 'available' WHERE `room`.`id_room` = "+id;
            stmt.executeUpdate(sql);
         } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}
