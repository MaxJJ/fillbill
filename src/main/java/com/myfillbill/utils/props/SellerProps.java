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
public class SellerProps {
     private StringProperty Seler_NameProperty = new SimpleStringProperty();
    private StringProperty Seler_PostalCodeProperty = new SimpleStringProperty();
    private StringProperty Seler_CountryCodeProperty = new SimpleStringProperty();
    private StringProperty Seler_CountryNameProperty = new SimpleStringProperty();
    private StringProperty Seler_RegionProperty = new SimpleStringProperty();
    private StringProperty Seler_CityProperty = new SimpleStringProperty();
    private StringProperty Seler_StreetHouseProperty = new SimpleStringProperty();

    public SellerProps() {
    }
    
    public SellerProps(FillBillInvoice invoice) {
        listen(invoice);
        Seler_NameProperty.setValue(invoice.getInvoiceItem().getSeler_Name());
        Seler_PostalCodeProperty.setValue(invoice.getInvoiceItem().getSeler_PostalCode());
        Seler_CountryCodeProperty.setValue(invoice.getInvoiceItem().getSeler_CountryCode());
        Seler_CountryNameProperty.setValue(invoice.getInvoiceItem().getSeler_CountryName());
        Seler_RegionProperty.setValue(invoice.getInvoiceItem().getSeler_Region());
        Seler_CityProperty.setValue(invoice.getInvoiceItem().getSeler_City());
        Seler_StreetHouseProperty.setValue(invoice.getInvoiceItem().getSeler_StreetHouse());
    }
    
    

    public StringProperty getSeler_NameProperty() {
        return Seler_NameProperty;
    }

    public StringProperty getSeler_PostalCodeProperty() {
        return Seler_PostalCodeProperty;
    }

    public StringProperty getSeler_CountryCodeProperty() {
        return Seler_CountryCodeProperty;
    }

    public StringProperty getSeler_CountryNameProperty() {
        return Seler_CountryNameProperty;
    }

    public StringProperty getSeler_RegionProperty() {
        return Seler_RegionProperty;
    }

    public StringProperty getSeler_CityProperty() {
        return Seler_CityProperty;
    }

    public StringProperty getSeler_StreetHouseProperty() {
        return Seler_StreetHouseProperty;
    }

    private void listen(FillBillInvoice invoice) {
        
        Seler_NameProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_Name(newValue); });
        Seler_PostalCodeProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_PostalCode(newValue); });
        Seler_CountryCodeProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_CountryCode(newValue); });
        Seler_CountryNameProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_CountryName(newValue); });
        Seler_RegionProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_Region(newValue); });
        Seler_CityProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_City(newValue); });
        Seler_StreetHouseProperty.addListener((observable,oldValue,newValue) -> {invoice.getInvoiceItem().setSeler_StreetHouse(newValue); });
       
    }
    
    
    
}
