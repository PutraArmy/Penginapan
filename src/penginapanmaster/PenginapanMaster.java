/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster;

import java.io.FileNotFoundException;
import javax.swing.text.Document;
import penginapanmaster.CheckIn.CheckInPresenter;
import penginapanmaster.CheckOut.CheckOutPresenter;
import penginapanmaster.customer.CustomerPresenter;
/**
 *
 * @author Lukman
 */
public class PenginapanMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
//       MainView mv = new MainView();
//       mv.setVisible(true);
      
// CustomerPresenter.getCustomer();
        //MainPresenter.getMain();
//        BookingPresenter.getCheckIn();
//        CheckInPresenter.getCheckIn();
//        RoomPresenter.getRoom();
        CheckOutPresenter.getCheckOut();
        //CustomerPresenter.getCustomer();
        //CustomerPresenter.getCustomer();

    }
}