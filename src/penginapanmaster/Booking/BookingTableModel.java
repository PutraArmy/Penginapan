/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.Booking;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Army
 */
public class BookingTableModel extends AbstractTableModel{
    private ArrayList<Booking> data;
    private String[] namaKolom = {"ID Booking", "ID Customer", "ID Room", "Check In", "Check Out", "Lama", "Total"};
    
    public void setData(ArrayList<Booking> dt) {
        this.data=dt;
    }
    
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    
    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    
    @Override
    public Object getValueAt(int baris, int kolom) {
        Booking b = data.get(baris);
        switch(kolom) {
            case 0 : return b.getId_booking();
            case 1 : return b.getId_customer();
            case 2 : return b.getId_room();
            case 3 : return b.getCheck_in();
            case 4 : return b.getCheck_out();
            case 5 : return b.getLama();
            case 6 : return b.getTotal();
            default : return null;
        }
    }
    
    @Override
    public String getColumnName(int kolom) {
        return namaKolom[kolom];
    }
}
