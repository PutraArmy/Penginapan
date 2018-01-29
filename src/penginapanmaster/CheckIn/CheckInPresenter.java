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
public class CheckInPresenter {
    
    DatabaseCheckIn db = new DatabaseCheckIn();
    public static void getCheckIn() {      
//        RoomView r = new RoomView();
        CheckInView c = new CheckInView();
        c.setVisible(true);
       
    }
    
    public static void selectBooking2(int id, int no_room, String class_room, String status){
        
    }
    
    public CheckIn selectBooking(int id){
       CheckIn ck = null;
       db.select_checkIn(id);
       ck = db.ck;
       return ck;
    }
}
