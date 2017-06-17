/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.invoice;

import com.myfillbill.fillbillXML.invoice.test.INVOICE_ITEM;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Maksims
 */

@XmlRootElement(name = "INVOICE")
@XmlType(propOrder = {"invoiceItem"})
public class FillBillInvoice {
    
    private INVOICE_ITEM invoiceItem;

    public FillBillInvoice() {
    }

    
    public INVOICE_ITEM getInvoiceItem() {
        return invoiceItem;
    }
@XmlElement(name = "INVOICE_ITEM")
    public void setInvoiceItem(INVOICE_ITEM invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
    
    
    
}
