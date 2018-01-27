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
public class BookingPresenter {
    public static void getCheckIn() {      
        BookingView r = new BookingView();
        r.setVisible(true);
        r.setResizable(false);
        r.setTitle("Oleg Hotel");
        r.setLocationRelativeTo(null);
    }
}
