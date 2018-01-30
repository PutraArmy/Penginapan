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
public class bookingPresenter {
    public static void getBooking() {      
        bookingView r = new bookingView();
        r.setVisible(true);
        r.setResizable(false);
        r.setTitle("Oleg Hotel");
        r.setLocationRelativeTo(null);
    }
    
    public static void getBookingAdmin() {      
        bookingAdminView r = new bookingAdminView();
        r.setVisible(true);
        r.setResizable(false);
        r.setTitle("Oleg Hotel");
        r.setLocationRelativeTo(null);
    }
}
