/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Army
 */
public class DatabaseCustomer {
    
    public final String driver  = "com.mysql.jdbc.Driver";
    public final String url     = "jdbc:mysql://localhost/db_penginapan";
    public final String user    = "root";
    public final String pass    = "";
    public int id_customer;

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int banyak) {
        id_customer = banyak;
    }
    
    public ArrayList<Customer> tampil_seluruh_customer() {
        
        ArrayList<Customer> list = new ArrayList<Customer>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "Select * from customer";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                list.add(new Customer(rs.getInt("id_customer"), rs.getString("nama"), rs.getString("no_identitas"), rs.getString("alamat"), rs.getString("jenisKelamin"), rs.getString("email"), rs.getString("usia")));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public ArrayList<Customer> search_customer(String dasarkan, String cari) {
        
        ArrayList<Customer> list = new ArrayList<Customer>();
        Connection conn = null;
        Statement stmt = null;
        String sql;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            
            if (dasarkan == "usia" && dasarkan == "id_customer"){
                sql = "Select * from customer where "+dasarkan+" = '"+cari+"'";
            } else {
                sql = "Select * from customer where "+dasarkan+" like '%"+cari+"%'";
            }
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                list.add(new Customer(rs.getInt("id_customer"), rs.getString("nama"), rs.getString("no_identitas"), rs.getString("alamat"), rs.getString("jenisKelamin"), rs.getString("email"), rs.getString("usia")));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public void tambah_customer(Customer c){
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
            String sql = "Select * from customer";
            ResultSet rs = stmt.executeQuery(sql);
            
            
            while(!(cek) && rs.next()){
                ID = rs.getInt("id_customer");
                if (banyak == ID) {
                    banyak++;
                } else {
                    cek = true;
                }
                setId_customer(banyak);
            }
            
            sql = "INSERT INTO customer VALUES  ("
                    
                    + "'" +banyak
                    +"','"+c.getNama()
                    +"','"+c.getNo_identitas()
                    +"','"+c.getAlamat()
                    +"','"+c.getJenis_kelamin()
                    +"','"+c.getEmail()
                    +"','"+c.getUsia()+"')";
            stmt.executeUpdate(sql);
            banyak = 1;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }         
    }
    
    public void hapus_customer(int ID){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "delete from customer where id_customer ='"+ID+"'";
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
            
    }
    
    public void pilih_customer(int ID){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "Select from customer where id_customer ='"+ID+"'";
            ResultSet rs = stmt.executeQuery(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
    public void update_customer(int ID, Customer c){
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE customer set "
                    +" nama = '"+c.getNama()+"'"
                    +", no_identitas = '"+c.getNo_identitas()+"'"
                    +", alamat = '"+c.getAlamat()+"'"
                    +", jenisKelamin = '"+c.getJenis_kelamin()+"'"
                    +", email = '"+c.getEmail()+"'"
                    +", usia = '"+c.getUsia()+"'"
                    +"where id_customer ='"+ID+"'";
            stmt.executeUpdate(sql);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
    
}
