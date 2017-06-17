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
public class BuyerProps {
     private StringProperty Buyer_NameProperty = new SimpleStringProperty();
    private StringProperty Buyer_PostalCodeProperty = new SimpleStringProperty();
    private StringProperty Buyer_CountryCodeProperty = new SimpleStringProperty();
    private StringProperty Buyer_CountryNameProperty = new SimpleStringProperty();
    private StringProperty Buyer_RegionProperty = new SimpleStringProperty();
    private StringProperty Buyer_CityProperty = new SimpleStringProperty();
    private StringProperty Buyer_StreetHouseProperty = new SimpleStringProperty();

    public BuyerProps() {
    }
    
    public BuyerProps(FillBillInvoice invoice) {
        
        Buyer_NameProperty.setValue(invoice.getInvoiceItem().getBuyer_Name());
        Buyer_PostalCodeProperty.setValue(invoice.getInvoiceItem().getBuyer_PostalCode());
        Buyer_CountryCodeProperty.setValue(invoice.getInvoiceItem().getBuyer_CountryCode());
        Buyer_CountryNameProperty.setValue(invoice.getInvoiceItem().getBuyer_CountryName());
        Buyer_RegionProperty.setValue(invoice.getInvoiceItem().getBuyer_Region());
        Buyer_CityProperty.setValue(invoice.getInvoiceItem().getBuyer_City());
        Buyer_StreetHouseProperty.setValue(invoice.getInvoiceItem().getBuyer_StreetHouse());
    }

    public StringProperty getBuyer_NameProperty() {
        return Buyer_NameProperty;
    }

    public StringProperty getBuyer_PostalCodeProperty() {
        return Buyer_PostalCodeProperty;
    }

    public StringProperty getBuyer_CountryCodeProperty() {
        return Buyer_CountryCodeProperty;
    }

    public StringProperty getBuyer_CountryNameProperty() {
        return Buyer_CountryNameProperty;
    }

    public StringProperty getBuyer_RegionProperty() {
        return Buyer_RegionProperty;
    }

    public StringProperty getBuyer_CityProperty() {
        return Buyer_CityProperty;
    }

    public StringProperty getBuyer_StreetHouseProperty() {
        return Buyer_StreetHouseProperty;
    }
    
}
