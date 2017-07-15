/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.services.domains;

import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.enums.XmlFileType;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Maksims
 */
public class RwInvoice extends FillBillDocument{

    public RwInvoice() {
    }
    
   
    public RwInvoice(File f) {
        
      docTypeName = XmlFileType.INVOICEXML; 
       file = f;
        try {
            context = JAXBContext.newInstance(FillBillInvoice.class);
            
        } catch (JAXBException ex) {
            Logger.getLogger(RwInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    createMarshUnmarsh();
    }

    
    
}
