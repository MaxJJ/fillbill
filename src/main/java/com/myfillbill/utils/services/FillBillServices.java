/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.services;

import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.services.domains.FillBillDocument;
import com.myfillbill.utils.services.domains.RwInvoice;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Maksims
 */
public class FillBillServices {
  
    
    public FillBillInvoice readFillBillInvoiceXML(File file) {

        FillBillDocument document = new RwInvoice(file);
        FillBillInvoice fbi = new FillBillInvoice();
        try {
            fbi = (FillBillInvoice) document.getUnmarshaller().unmarshal(file);
        } catch (JAXBException ex) {
            Logger.getLogger(FillBillServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fbi;
    }
    
    public void saveFillBillInvoiceXML
    
}
