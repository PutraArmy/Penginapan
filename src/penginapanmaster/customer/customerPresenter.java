/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.customer;
/**
 *
 * @author Lukman
 */
public class customerPresenter{
    
     public static void getCustomer() {      
        customerView cs = new customerView();
        cs.setVisible(true);
        cs.setResizable(false);
        cs.setTitle("Oleg Hotel");
        cs.setLocationRelativeTo(null);
    }
}
