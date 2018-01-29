/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckIn;

import java.sql.Date;

/**
 *
 * @author Lukman
 */
public class CheckIn {
    private int id_booking;
    private int id_customer;
    private int id_room;
    private Date check_in;
    private Date check_out;
    private int lama;
    private int total;
    private int no_room;
    private String class_room;
    private String nama;
    
    CheckIn(int id_booking, int id_customer, int id_room, Date check_in, Date check_out, int lama, int total, int no_room, String class_room, String nama) {
        this.id_booking = id_booking;
        this.id_customer = id_customer;
        this.id_room = id_room;
        this.check_in = check_in;
        this.check_out = check_out;
        this.lama = lama;
        this.total = total;
        this.no_room = no_room;
        this.class_room = class_room;
        this.nama = nama;
    }

    CheckIn(int id) {
        this.id_room = id;
    }

    
    public int getNo_room() {
        return no_room;
    }

    public void setNo_room(int no_room) {
        this.no_room = no_room;
    }

    public String getClass_room() {
        return class_room;
    }

    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
   
    public int getId_booking() {
        return id_booking;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
}
