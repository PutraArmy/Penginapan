/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckOut;

import penginapanmaster.CheckIn.*;

/**
 *
 * @author Lukman
 */
public class CheckOutPresenter {
    
    DatabaseCheckOut db = new DatabaseCheckOut();
    public static void getCheckOut() {      
//        RoomView r = new RoomView();
        CheckOutView c = new CheckOutView();
        c.setVisible(true);
       
    }
    
    public static void selectBooking2(int id, int no_room, String class_room, String status){
        
    }
    
    public CheckOut selectBooking(int id){
       CheckOut ck = null;
       db.select_checkIn(id);
       ck = db.ck;
       return ck;
    }
}
