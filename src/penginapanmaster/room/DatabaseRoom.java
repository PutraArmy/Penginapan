/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.room;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import penginapanmaster.customer.Customer;

/**
 *
 * @author Army
 */
public class DatabaseRoom {
    public final String driver  = "com.mysql.jdbc.Driver";
    public final String url     = "jdbc:mysql://localhost/db_penginapan";
    public final String user    = "root";
    public final String pass    = "";
    
     Connection conn = null;
     Statement stmt = null;
    
    public ArrayList<Room> tampil_seluruh_room() {
        
        ArrayList<Room> list = new ArrayList<Room>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "Select * from room";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                list.add(new Room(rs.getInt("id_room"),rs.getInt("no_room"),rs.getString("class_room"),rs.getString("status")));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public ArrayList<Room> tampil_class_used(String classRoom) {
        
        ArrayList<Room> list = new ArrayList<Room>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "Select * from room where status = 'available' and class_room = '"+classRoom+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                list.add(new Room(rs.getInt("id_room"),rs.getInt("no_room"),rs.getString("class_room"),rs.getString("status")));
            }
        } 
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
     public void tambah_room(Room c){
        Connection conn = null;
        Statement stmt = null;
        int banyak = 1;
        int ID;
        boolean cek = false;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            
            //hitung jumlah data
            String sql = "Select * from room";
            ResultSet rs = stmt.executeQuery(sql);
            
            
            while(!(cek) && rs.next()){
                ID = rs.getInt("id_room");
                if (banyak == ID) {
                    banyak++;
                } else {
                    cek = true;
                }
            }
            
            sql = "INSERT INTO room VALUES  ("
                    
                    + "'" +banyak
                    +"','"+c.getId_room()
                    +"','"+c.getNo_room()
                    +"','"+c.getClass_room()
                    +"','"+c.getStatus()+"')";
            stmt.executeUpdate(sql);
            banyak = 1;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }         
    }
     
     public void status_booked(int ID){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE room set "
                    +" status = 'booked'"
                    +"where id_room ='"+ID+"'";
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }  
    
    public void update_room(int id,int noR,int ccb,int scb){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            int classR;
            
            sql = "UPDATE `room` SET `no_room` = '"+noR+"', `class_room`='"+ccb+"', `status` = '"+scb+"' WHERE `room`.`id_room` = "+id;
//    sql = "UPDATE `room` SET `class_room` = '"+ccb+"' WHERE `room`.`id_room` = "+id;
//            sql = "UPDATE room SET class_room='"+ccb+"' WHERE id_room="+id;
        
        stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public void insert_room(Room r){
         try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO `room` (`id_room`, `no_room`, `class_room`, `status`) VALUES (NULL, '"+r.getNo_room()+"', '"+r.getClass_room()+"', '"+r.getStatus()+"')";
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }         
    }
    
    public void delete_room(int id){
         try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "DELETE FROM `room` WHERE `room`.`id_room` = "+id;
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }         
    }
}
