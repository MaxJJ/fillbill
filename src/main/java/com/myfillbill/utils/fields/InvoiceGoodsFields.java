/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.props.InvoiceGoodsProps;
import javafx.scene.control.ListView;

/**
 *
 * @author Maksims
 */
public class InvoiceGoodsFields extends InvoiceGoodsProps{
    
    private final ListView invoiceListView;
    
    
    public InvoiceGoodsFields(View invoiceView,FillBillInvoice invoice) {
        super(invoice);
        invoiceListView = (ListView) invoiceView.getContent().lookup("#goodsList");
       
       bind();
    
    }
    
    private void bind(){
         invoiceListView.getItems().clear();
        invoiceListView.setItems(getlList());
        invoiceListView.refresh();
    
    }
    
    
}
