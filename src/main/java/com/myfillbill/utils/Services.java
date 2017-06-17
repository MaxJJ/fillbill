/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils;

import com.gluonhq.particle.application.ParticleApplication;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
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
public class Services {
    
    private FileChooser fileChooser;
private JAXBContext contextInvoice; 
private Unmarshaller umInvoice;
private Marshaller marInvoice;
private JAXBContext contextRwb;
private Unmarshaller umRwb;
private Marshaller marRwb;
private FillBillInvoice invoice;
private FillBillSmgs smgs;
private ParticleApplication app;


    public Services(ParticleApplication app) {
        
        this.app = app;
        try {
            fileChooser = new FileChooser();
            
            contextInvoice = JAXBContext.newInstance(FillBillInvoice.class);
            contextRwb = JAXBContext.newInstance(FillBillSmgs.class);
            umInvoice = contextInvoice.createUnmarshaller();
            marInvoice=contextInvoice.createMarshaller();
            umRwb = contextRwb.createUnmarshaller();
            marRwb=contextRwb.createMarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    

    public InvoiceProps invoiceProps(FillBillInvoice invoice,ParticleApplication app) {
        this.invoice = invoice;
        
        return new InvoiceProps(invoice, app);
    }
    public SmgsProps smgsProps(FillBillSmgs smgs,ParticleApplication app) {
        this.smgs = smgs;
        
        return new SmgsProps(smgs, app);
    }

public FillBillInvoice fillBillInvoice(){
     invoice = new FillBillInvoice();
        File f=fileChooser.showOpenDialog(app.getPrimaryStage().getOwner()); 
        
        
      try { 
          invoice = (FillBillInvoice) umInvoice.unmarshal(f);
          
      } catch (JAXBException ex) {
          Logger.getLogger(Io.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return invoice;
}
public FillBillSmgs fillBillSmgs(){
     smgs = new FillBillSmgs();
        File f=fileChooser.showOpenDialog(app.getPrimaryStage().getOwner()); 
        
        
      try { 
          smgs = (FillBillSmgs) umRwb.unmarshal(f);
          
      } catch (JAXBException ex) {
          Logger.getLogger(Io.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return smgs;
}


public void saveInvoice(FillBillInvoice invoice){
        try {
            fileChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("xml", ".xml"));
            File file = fileChooser.showSaveDialog(app.getPrimaryStage().getOwner());
            marInvoice.marshal(invoice, file);
        } catch (JAXBException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    public FillBillInvoice getInvoice() {
        return invoice;
    }
   
    
}
