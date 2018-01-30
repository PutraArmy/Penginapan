/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckIn;

/**
 *
 * @author Lukman
 */
public class checkInPresenter {
    
    databaseCheckIn db = new databaseCheckIn();
    public static void getCheckIn() {      
//        RoomView r = new RoomView();
        checkInView c = new checkInView();
        c.setVisible(true);
       
    }
    
    public static void selectBooking2(int id, int no_room, String class_room, String status){
        
    }
    
    public checkIn selectBooking(int id){
       checkIn ck = null;
       db.select_checkIn(id);
       ck = db.ck;
       return ck;
    }
}
