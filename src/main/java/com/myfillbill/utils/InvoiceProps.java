/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.fields.BuyerFields;
import com.myfillbill.utils.fields.ConsigneeFields;
import com.myfillbill.utils.fields.ConsignorFields;
import com.myfillbill.utils.fields.InvoiceGoodsFields;
import com.myfillbill.utils.fields.InvoiceHeaderFields;
import com.myfillbill.utils.fields.SellerFields;
import javafx.scene.control.ListView;

/**
 *
 * @author Maksims
 */

public class InvoiceProps {
    private FillBillInvoice invoice;
    private ParticleApplication app;
    private View invoiceView;
    
   
   
    private SellerFields seller;
    private BuyerFields buyer;
    private ConsigneeFields consignee;
    private ConsignorFields consignor;
    private InvoiceHeaderFields header;
    private InvoiceGoodsFields invoiceGoods;

    public InvoiceProps() {
    }
    

    
    public InvoiceProps(FillBillInvoice invoice,ParticleApplication app) {
      this.invoice=invoice;  
      this.app=app;
       invoiceView=app.getParticle().getViewManager().getCurrentView();
      init();
    }
    


    private void init() {
       ListView lv = (ListView) invoiceView.getContent().lookup("#goodsList"); 
       lv.getItems().clear();
      
       this.seller = new SellerFields(invoiceView,invoice);
       this.buyer = new BuyerFields(invoiceView,invoice);
       this.consignee = new ConsigneeFields(invoiceView,invoice);
       this.consignor = new ConsignorFields(invoiceView,invoice);
       this.header = new InvoiceHeaderFields(invoiceView,invoice);
       this.invoiceGoods = new InvoiceGoodsFields(invoiceView,invoice);
       
       
    }

    public FillBillInvoice getInvoice() {
        return invoice;
    }

    public ParticleApplication getApp() {
        return app;
    }

    public View getInvoiceView() {
        return invoiceView;
    }

    public SellerFields getSeller() {
        return seller;
    }

    public BuyerFields getBuyer() {
        return buyer;
    }

    public ConsigneeFields getConsignee() {
        return consignee;
    }

    public ConsignorFields getConsignor() {
        return consignor;
    }

    public InvoiceHeaderFields getHeader() {
        return header;
    }

    public InvoiceGoodsFields getInvoiceGoods() {
        return invoiceGoods;
    }
    
    
    
    
    
}
