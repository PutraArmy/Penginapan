/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.room;

/**
 *
 * @author Lukman
 */
public class room {
    private int id_room;
    private int no_room;
    private String class_room;
    private String status;

   

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public int getNo_room() {
        return no_room;
    }

    public void setNo_room(int no_room) {
        this.no_room = no_room;
    }

    public String getClass_room() {
        return class_room;
    }

    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public room(int id,int nr, String cr, String status){
        setId_room(id);
        setNo_room(nr);
        setClass_room(cr);
        setStatus(status);
    }
     
    public room(Integer no_Room, String cr, String status) {
        setNo_room(no_Room);
        setClass_room(cr);
        setStatus(status);
    
    }
}
