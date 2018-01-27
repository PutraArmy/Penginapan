/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.customer;

/**
 *
 * @author Army
 */
public class Customer {

    //ID
    public int getID() {
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    //Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //No_identitas
    public String getNo_identitas() {
        return no_identitas;
    }

    public void setNo_identitas(String no_identitas) {
        this.no_identitas = no_identitas;
    }

    //Alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //jenis_kelamin
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    //Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Usia
    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }
    
    private String nama,no_identitas,alamat,jenis_kelamin,email,usia;
    private int ID;

    
    void setText(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public Customer(int ID,String nama, String ni, String alamat, String jk, String email, String usia){
        setID(ID);
        setNama(nama);
        setNo_identitas(ni);
        setAlamat(alamat);
        setJenis_kelamin(jk);
        setEmail(email);
        setUsia(usia);
    }
       
    public Customer(String nama, String ni, String alamat, String jk, String email, String usia){
        setNama(nama);
        setNo_identitas(ni);
        setAlamat(alamat);
        setJenis_kelamin(jk);
        setEmail(email);
        setUsia(usia);
    }

    
}
