/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.services.domains;

import com.myfillbill.utils.enums.XmlFileType;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Maksims
 */
public class FillBillDocument {

    protected XmlFileType docTypeName;
    protected File file;
    protected JAXBContext context;
    protected Marshaller marshaller;
    protected Unmarshaller unmarshaller;
    
    public FillBillDocument() {
        
        
    }
    
    
    
public void createMarshUnmarsh(){
    
        try {
            marshaller=context.createMarshaller();
            unmarshaller=context.createUnmarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(FillBillDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public XmlFileType getDocTypeName() {
        return docTypeName;
    }

    public File getFile() {
        return file;
        
        
    }

    public JAXBContext getContext() {
        return context;
    }

    public Marshaller getMarshaller() {
        return marshaller;
    }

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }
         
         
}
