/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster;

import penginapanmaster.Booking.BookingView;

/**
 *
 * @author my
 */
public class MainPresenter {
    public static void getMain() {      
        MainView r = new MainView();
        r.setVisible(true);
        r.setResizable(false);
        r.setTitle("Oleg Hotel");
        r.setLocationRelativeTo(null);
    }
}
