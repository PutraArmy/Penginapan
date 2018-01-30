/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.Booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import penginapanmaster.CheckIn.CheckIn;
import penginapanmaster.customer.Customer;

/**
 *
 * @author Army
 */
public class DatabaseBooking {
    
    public final String driver  = "com.mysql.jdbc.Driver";
    public final String url     = "jdbc:mysql://localhost/db_penginapan";
    public final String user    = "root";
    public final String pass    = "";
    Booking bk = null;
    
    public ArrayList<Booking> tampil_seluruh_booking() {
        
        ArrayList<Booking> list = new ArrayList<Booking>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "Select * from booking";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                list.add(new Booking(rs.getInt("id_booking"), rs.getInt("id_customer"), rs.getInt("id_room"), rs.getString("check_in"), rs.getString("check_out"), rs.getInt("lama"), rs.getInt("total")));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public void tambah_booking(Booking b) {
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
            String sql = "Select * from booking";
            ResultSet rs = stmt.executeQuery(sql);
            
            
            while(!(cek) && rs.next()){
                ID = rs.getInt("id_booking");
                if (banyak == ID) {
                    banyak++;
                } else {
                    cek = true;
                }
            }
            System.out.println(banyak);
            System.out.println(b.getId_room());
            System.out.println(b.getCheck_in());
            System.out.println(b.getCheck_out());
            sql = "INSERT INTO booking VALUES  ("
                    
                    + "'" +banyak
                    +"','"+b.getId_customer()
                    +"','"+b.getId_room()
                    +"','"+b.getCheck_in()
                    +"','"+b.getCheck_out()
                    +"','"+b.getLama()
                    +"','"+b.getTotal()+"')";
            stmt.executeUpdate(sql);
            banyak = 1;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }         
    }
    
    public void hapus_booking(int ID){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "delete from booking where id_booking ='"+ID+"'";
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
            
    }
    
    public void update_booking(Booking c){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE booking set "
                    +" id_booking = '"+c.getId_booking()+"'"
                    +", id_customer = '"+c.getId_customer()+"'"
                    +", id_room = '"+c.getId_room()+"'"
                    +", check_in = '"+c.getCheck_in()+"'"
                    +", check_out = '"+c.getCheck_out()+"'"
                    +", lama = '"+c.getLama()+"'"
                    +", total = '"+c.getTotal()+"'"
                    +"where id_booking ='"+c.getId_booking()+"'";
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public String pilih_room(int ID){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "Select class_room from room where id_room ='"+ID+"'";
            ResultSet rs = stmt.executeQuery(sql);
           
            return rs.getString("class_room");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        return null;
    }
    
    public Booking selectBooking(int id){
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            
            
            String sql;
            sql = "select * from booking inner join customer on customer.id_customer = booking.id_booking inner join room on room.id_room = booking.id_room WHERE id_booking ="+id ;
            ResultSet rs = stmt.executeQuery(sql);
        
            
            while(rs.next()){
                this.bk = new Booking(
                    rs.getString("class_room"));
            }
         } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return bk;
    }
}
