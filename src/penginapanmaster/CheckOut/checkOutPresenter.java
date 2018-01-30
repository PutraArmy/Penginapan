/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckOut;

/**
 *
 * @author Lukman
 */
public class checkOutPresenter {
    
    databaseCheckOut db = new databaseCheckOut();
    public static void getCheckOut() {      
        checkOutView c = new checkOutView();
        c.setVisible(true);
       
    }
    
    public static void selectBooking2(int id, int no_room, String class_room, String status){
        
    }
    
    public checkOut selectBooking(int id){
       checkOut ck = null;
       db.select_checkIn(id);
       ck = db.ck;
       return ck;
    }
}
