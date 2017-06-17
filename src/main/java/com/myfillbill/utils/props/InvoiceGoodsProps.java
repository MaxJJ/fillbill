/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.props;

import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.fillbillXML.invoice.test.INVOICEGOODS_ITEM;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Maksims
 */
public class InvoiceGoodsProps {
    private FillBillInvoice invoice;
    private final ObservableList<INVOICEGOODS_ITEM> lList = FXCollections.observableArrayList();
    private final List<INVOICEGOODS_ITEM> goodsList ;

    public InvoiceGoodsProps(FillBillInvoice invoice) {
        this.invoice=invoice;
      
        goodsList=invoice.getInvoiceItem().getINVOICEGoods().getList();
    Logger.getAnonymousLogger().log(Level.WARNING, lList.toString());
     lList.clear();
      Logger.getAnonymousLogger().log(Level.WARNING, lList.toString());
       lList.setAll(goodsList);
        Logger.getAnonymousLogger().log(Level.WARNING, lList.toString());
    }


    public ObservableList<INVOICEGOODS_ITEM> getlList() {
        return lList;
    }

    
    public List<INVOICEGOODS_ITEM> getGoodsList() {
        return goodsList;
    }

    
    
    
    
     
}
