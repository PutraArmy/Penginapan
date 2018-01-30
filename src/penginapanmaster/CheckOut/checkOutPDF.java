/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckOut;

import penginapanmaster.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static javax.swing.text.StyleConstants.FontFamily;

/**
 *
 * @author Lukman
 */
public class checkOutPDF {
    private checkOut dt;
    public checkOutPDF (checkOut dt){
        this.dt = dt;
    }
    
    public void createPdf() throws FileNotFoundException {
      Document document = new Document();
       try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("CheckOut.pdf"));
         document.open();
         document.add(new Paragraph("ID ORDER       : "+ dt.getId_room()));
         document.add(new Paragraph("ID CUSTOMER    : "+ dt.getId_customer()));
         document.add(new Paragraph("NO ROOM        : "+ dt.getNo_room()));
         document.add(new Paragraph("CHECK IN       : "+ dt.getCheck_in()));
         document.add(new Paragraph("CHECK OUT      : "+ dt.getCheck_out()));
         document.add(new Paragraph("LAMA           : "+ dt.getLama()+ " Hari") );
        
         document.close();
         writer.close();
      } catch (DocumentException | FileNotFoundException e)
      {
         e.printStackTrace();
      }
    }
}
