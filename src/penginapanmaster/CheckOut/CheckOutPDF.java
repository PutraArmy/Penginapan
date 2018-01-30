/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.CheckOut;

import penginapanmaster.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
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
public class CheckOutPDF {
    private CheckOut dt;
    public CheckOutPDF (CheckOut dt){
        this.dt = dt;
    }
    
    public void createPdf() throws FileNotFoundException {
      Document document = new Document();
       try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("CheckOut.pdf"));
         document.open();
         document.add(new Paragraph("NAMA : "+ dt.getNama()));
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
