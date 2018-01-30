/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.Booking;


/**
 *
 * @author Army
 */
public class booking {
    
    private int id_booking, id_customer,id_room ;
    private int lama, total;
    private String check_in, check_out,class_room;

    public String getClass_room() {
        return class_room;
    }

    booking(String class_room) {
        
        this.class_room = class_room;
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

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
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
    
    public booking(int id_customer, int id_room, String check_in, String check_out, int lama, int total) {
        setId_booking(id_booking);
        setId_customer(id_customer);
        setId_room(id_room);
        setCheck_in(check_in);
        setCheck_out(check_out);
        setLama(lama);
        setTotal(total);
    }
    
    public booking(int id_booking, int id_customer, int id_room, String check_in, String check_out, int lama, int total) {
        setId_booking(id_booking);
        setId_customer(id_customer);
        setId_room(id_room);
        setCheck_in(check_in);
        setCheck_out(check_out);
        setLama(lama);
        setTotal(total);
    }
    
}
