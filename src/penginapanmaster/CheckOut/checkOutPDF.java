/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckOut;

import com.itextpdf.text.BaseColor;
import penginapanmaster.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
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
    public checkOut dt;
    public checkOutPDF (checkOut dt){
        this.dt = dt;
    }
    
   public void createPdf(String nameFile) throws FileNotFoundException {
      Document document = new Document();
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(nameFile+".pdf"));
         document.open();
         document.add(new Paragraph("REPORT CHECKOUT"));
         document.add(new Paragraph("ID ORDER = "+ dt.getId_booking()));
         document.add(new Paragraph("ID CUSTOMER = "+ dt.getId_customer()));
         document.add(new Paragraph("NAMA = "+ dt.getNama()));
         document.add(new Paragraph("ID ROOM = "+ dt.getId_room()));
         document.add(new Paragraph("NO ROOM = "+ dt.getNo_room()));
         document.add(new Paragraph("CLASS ROOM = "+ dt.getClass_room()));
         document.add(new Paragraph("CHECK IN = "+ dt.getCheck_in()));
         document.add(new Paragraph("CHECK OUT = "+ dt.getCheck_out()));
         document.add(new Paragraph("LAMA = "+ dt.getLama()));
         document.add(new Paragraph("TOTAL = "+ dt.getTotal()));
         document.close();
         writer.close();
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
    }
}
