/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.props.InvoiceHeaderProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class InvoiceHeaderFields extends InvoiceHeaderProps {
    
    
    private TextField InvoiceName;
    private TextField RegNum;
    private TextField RegDate;
    private TextField DeliveryTermsStringCode;
    private TextField DeliveryPlace;
    private TextField ContractNum;
    private TextField CurrencyCode;
    private TextField SMGS;
    private TextField CarriageId;
    private TextField ContainerID;

    
    
    public InvoiceHeaderFields(View invoiceView,FillBillInvoice invoice) {
        super(invoice);
        InvoiceName = (TextField) invoiceView.getContent().lookup("#InvoiceName");
        RegNum = (TextField) invoiceView.getContent().lookup("#RegNum");
        RegDate = (TextField) invoiceView.getContent().lookup("#RegDate");
        DeliveryTermsStringCode = (TextField) invoiceView.getContent().lookup("#DeliveryTermsStringCode");
        DeliveryPlace = (TextField) invoiceView.getContent().lookup("#DeliveryPlace");
        ContractNum = (TextField) invoiceView.getContent().lookup("#ContractNum");
        CurrencyCode = (TextField) invoiceView.getContent().lookup("#CurrencyCode");
        SMGS = (TextField) invoiceView.getContent().lookup("#SMGS");
        CarriageId = (TextField) invoiceView.getContent().lookup("#CarriageId");
        ContainerID = (TextField) invoiceView.getContent().lookup("#ContainerID");
        
       bind();
    }
    
    private void bind(){
        
           InvoiceName.textProperty().bindBidirectional(getInvoiceNameProperty());
       RegNum.textProperty().bindBidirectional(getRegNumProperty());
       RegDate.textProperty().bindBidirectional(getRegDateProperty());
       DeliveryTermsStringCode.textProperty().bindBidirectional(getDeliveryTermsStringCodeProperty());
       DeliveryPlace.textProperty().bindBidirectional(getDeliveryPlaceProperty());
      ContractNum.textProperty().bindBidirectional(getContractNumProperty());
      CurrencyCode.textProperty().bindBidirectional(getCurrencyCodeProperty());
      SMGS.textProperty().bindBidirectional(getSMGSProperty());
      CarriageId.textProperty().bindBidirectional(getCarriageIdProperty());
      ContainerID.textProperty().bindBidirectional(getContainerIDProperty());
    }

    public TextField getInvoiceName() {
        return InvoiceName;
    }

    public TextField getRegNum() {
        return RegNum;
    }

    public TextField getRegDate() {
        return RegDate;
    }

    public TextField getDeliveryTermsStringCode() {
        return DeliveryTermsStringCode;
    }

    public TextField getDeliveryPlace() {
        return DeliveryPlace;
    }

    public TextField getContractNum() {
        return ContractNum;
    }

    public TextField getCurrencyCode() {
        return CurrencyCode;
    }

    public TextField getSMGS() {
        return SMGS;
    }

    public TextField getCarriageId() {
        return CarriageId;
    }

    public TextField getContainerID() {
        return ContainerID;
    }

    
}
