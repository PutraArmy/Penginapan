/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.customer;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Army
 */
public class customerTableModel extends AbstractTableModel{
    private ArrayList<customer> data;
    private String[] namaKolom = {"ID Customer","Nama","No Identitas","Alamat","Jenis Kelamin","Email","Usia"};
    
    public void setData(ArrayList<customer> dt) {
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
        customer m = data.get(baris);
        switch(kolom) {
            case 0 : return m.getID();
            case 1 : return m.getNama();
            case 2 : return m.getNo_identitas();
            case 3 : return m.getAlamat();
            case 4 : return m.getJenis_kelamin();
            case 5 : return m.getEmail();
            case 6 : return m.getUsia();
            default : return null;
        }
    }
    
    public String getColumnName(int kolom) {
        return namaKolom[kolom];
    }
}
