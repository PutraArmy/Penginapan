/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster;

<<<<<<< HEAD:src/penginapanmaster/penginapanMaster.java
import penginapanmaster.Booking.bookingPresenter;
import penginapanmaster.CheckIn.checkInPresenter;
import penginapanmaster.CheckOut.checkOutPresenter;
import penginapanmaster.customer.customerPresenter;
=======
import java.io.FileNotFoundException;
import javax.swing.text.Document;
import penginapanmaster.CheckIn.CheckInPresenter;
import penginapanmaster.CheckOut.CheckOutPresenter;
import penginapanmaster.customer.CustomerPresenter;
>>>>>>> MainView:src/penginapanmaster/PenginapanMaster.java
/**
 *
 * @author Lukman
 */
public class penginapanMaster {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD:src/penginapanmaster/penginapanMaster.java
    public static void main(String[] args) {
       mainView mv = new mainView();
       mv.setVisible(true);
=======
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

>>>>>>> MainView:src/penginapanmaster/PenginapanMaster.java
    }
}
