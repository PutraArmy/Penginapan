/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.room;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lukman
 */
public class RoomTableModel extends AbstractTableModel {
    private ArrayList<Room> data;
    private String[] namaKolom = {"ID Room","No Room","Class Room","Status"};
    private String status;
    
    public void setData(ArrayList<Room> dt) {
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
        Room m = data.get(baris);
        switch(kolom) {
            case 0 : return m.getId_room();
            case 1 : return m.getNo_room();
            case 2 : return m.getClass_room();
            case 3 : return m.getStatus();
            default : return null;
        }
    }
    
    public String getColumnName(int kolom) {
        return namaKolom[kolom];
    }
}
