/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.props;

import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Maksims
 */
public class InvoiceHeaderProps {
     private StringProperty InvoiceNameProperty = new SimpleStringProperty();
    private StringProperty RegNumProperty = new SimpleStringProperty();
    private StringProperty RegDateProperty = new SimpleStringProperty();
    private StringProperty DeliveryTermsStringCodeProperty = new SimpleStringProperty();
    private StringProperty DeliveryPlaceProperty = new SimpleStringProperty();
    private StringProperty ContractNumProperty = new SimpleStringProperty();
    private StringProperty CurrencyCodeProperty = new SimpleStringProperty();
    private StringProperty SMGSProperty = new SimpleStringProperty();
    private StringProperty CarriageIdProperty = new SimpleStringProperty();
    private StringProperty ContainerIDProperty = new SimpleStringProperty();

    public InvoiceHeaderProps() {
    }
    
    public InvoiceHeaderProps(FillBillInvoice invoice) {
        
        InvoiceNameProperty.setValue(invoice.getInvoiceItem().getInvoiceName());
        RegNumProperty.setValue(invoice.getInvoiceItem().getRegNum());
        RegDateProperty.setValue(invoice.getInvoiceItem().getRegDate());
        DeliveryTermsStringCodeProperty.setValue(invoice.getInvoiceItem().getDeliveryTermsStringCode());
        DeliveryPlaceProperty.setValue(invoice.getInvoiceItem().getDeliveryPlace());
        ContractNumProperty.setValue(invoice.getInvoiceItem().getContractNum());
        CurrencyCodeProperty.setValue(invoice.getInvoiceItem().getCurrencyCode());
        SMGSProperty.setValue(invoice.getInvoiceItem().getSMGS());
        CarriageIdProperty.setValue(invoice.getInvoiceItem().getCarriage().getCARRIAGE_ITEM().getCarriageId());
        ContainerIDProperty.setValue(invoice.getInvoiceItem().getContainer().getCONTAINER_ITEM().getContainerID());
    }

    public StringProperty getInvoiceNameProperty() {
        return InvoiceNameProperty;
    }

    public StringProperty getRegNumProperty() {
        return RegNumProperty;
    }

    public StringProperty getRegDateProperty() {
        return RegDateProperty;
    }

    public StringProperty getDeliveryTermsStringCodeProperty() {
        return DeliveryTermsStringCodeProperty;
    }

    public StringProperty getDeliveryPlaceProperty() {
        return DeliveryPlaceProperty;
    }

    public StringProperty getContractNumProperty() {
        return ContractNumProperty;
    }

    public StringProperty getCurrencyCodeProperty() {
        return CurrencyCodeProperty;
    }

    public StringProperty getSMGSProperty() {
        return SMGSProperty;
    }

    public StringProperty getCarriageIdProperty() {
        return CarriageIdProperty;
    }

    public StringProperty getContainerIDProperty() {
        return ContainerIDProperty;
    }

    
    
}
