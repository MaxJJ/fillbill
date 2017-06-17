/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Maksims
 */
public class Io {
  private ParticleApplication app;
  private ViewManager vm;
  
private FileChooser fileChooser;
private JAXBContext contextInvoice; 
private JAXBContext contextRwb; 
private Unmarshaller umInvoice;
private FillBillInvoice invoice;

    public Io(ParticleApplication app, ViewManager vm) {
        this.app=app;
        this.vm=vm;
      try {
          this.fileChooser = new FileChooser();
          
          contextInvoice = JAXBContext.newInstance(FillBillInvoice.class);
          umInvoice = contextInvoice.createUnmarshaller();
      } catch (JAXBException ex) {
          Logger.getLogger(Io.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
        public void readInvoice(){
          File f=fileChooser.showOpenDialog(app.getPrimaryStage().getOwner());  
      try { 
          invoice = (FillBillInvoice) umInvoice.unmarshal(f);
          System.out.println(invoice);
      } catch (JAXBException ex) {
          Logger.getLogger(Io.class.getName()).log(Level.SEVERE, null, ex);
      }

InvoiceProps ip = new InvoiceProps(invoice, app);
            
        }
        
        public void readRwb(){
            
        }
        
        public void writeInvoice(){
      try {
          File file = fileChooser.showSaveDialog(app.getPrimaryStage().getOwner());
          
          Marshaller marshaller = contextInvoice.createMarshaller();
          marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
          marshaller.marshal(invoice, file);
          
      } catch (JAXBException ex) {
          Logger.getLogger(Io.class.getName()).log(Level.SEVERE, null, ex);
      }
        }

    public FillBillInvoice getInvoice() {
        return invoice;
    }
        
      
}
