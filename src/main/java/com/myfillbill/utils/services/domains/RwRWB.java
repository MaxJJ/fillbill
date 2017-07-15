/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.services.domains;

import com.myfillbill.fillbillXML.smgs.RWB;
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
public class RwRWB extends FillBillDocument{

    public RwRWB(File f) {
        docTypeName = XmlFileType.RWBXML; 
         file = f;
        try {
            context = JAXBContext.newInstance(RWB.class);
        } catch (JAXBException ex) {
            Logger.getLogger(RWB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
      createMarshUnmarsh();
    }



   
    
    
     
    
}
