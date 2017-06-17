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
public class ConsigneeProps {
     private StringProperty Consignee_NameProperty = new SimpleStringProperty();
    private StringProperty Consignee_PostalCodeProperty = new SimpleStringProperty();
    private StringProperty Consignee_CountryCodeProperty = new SimpleStringProperty();
    private StringProperty Consignee_CountryNameProperty = new SimpleStringProperty();
    private StringProperty Consignee_RegionProperty = new SimpleStringProperty();
    private StringProperty Consignee_CityProperty = new SimpleStringProperty();
    private StringProperty Consignee_StreetHouseProperty = new SimpleStringProperty();

    public ConsigneeProps() {
    }
    
    public ConsigneeProps(FillBillInvoice invoice) {
        
        Consignee_NameProperty.setValue(invoice.getInvoiceItem().getConsignee_Name());
        Consignee_PostalCodeProperty.setValue(invoice.getInvoiceItem().getConsignee_PostalCode());
        Consignee_CountryCodeProperty.setValue(invoice.getInvoiceItem().getConsignee_CountryCode());
        Consignee_CountryNameProperty.setValue(invoice.getInvoiceItem().getConsignee_CountryName());
        Consignee_RegionProperty.setValue(invoice.getInvoiceItem().getConsignee_Region());
        Consignee_CityProperty.setValue(invoice.getInvoiceItem().getConsignee_City());
        Consignee_StreetHouseProperty.setValue(invoice.getInvoiceItem().getConsignee_StreetHouse());
    }

    public StringProperty getConsignee_NameProperty() {
        return Consignee_NameProperty;
    }

    public StringProperty getConsignee_PostalCodeProperty() {
        return Consignee_PostalCodeProperty;
    }

    public StringProperty getConsignee_CountryCodeProperty() {
        return Consignee_CountryCodeProperty;
    }

    public StringProperty getConsignee_CountryNameProperty() {
        return Consignee_CountryNameProperty;
    }

    public StringProperty getConsignee_RegionProperty() {
        return Consignee_RegionProperty;
    }

    public StringProperty getConsignee_CityProperty() {
        return Consignee_CityProperty;
    }

    public StringProperty getConsignee_StreetHouseProperty() {
        return Consignee_StreetHouseProperty;
    }
    
    
    
}
