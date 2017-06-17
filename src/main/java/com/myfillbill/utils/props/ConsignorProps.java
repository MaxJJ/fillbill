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
public class ConsignorProps {
     private StringProperty Consignor_NameProperty = new SimpleStringProperty();
    private StringProperty Consignor_PostalCodeProperty = new SimpleStringProperty();
    private StringProperty Consignor_CountryCodeProperty = new SimpleStringProperty();
    private StringProperty Consignor_CountryNameProperty = new SimpleStringProperty();
    private StringProperty Consignor_RegionProperty = new SimpleStringProperty();
    private StringProperty Consignor_CityProperty = new SimpleStringProperty();
    private StringProperty Consignor_StreetHouseProperty = new SimpleStringProperty();

    public ConsignorProps() {
    }
    
    public ConsignorProps(FillBillInvoice invoice) {
        
        Consignor_NameProperty.setValue(invoice.getInvoiceItem().getConsignor_Name());
        Consignor_PostalCodeProperty.setValue(invoice.getInvoiceItem().getConsignor_PostalCode());
        Consignor_CountryCodeProperty.setValue(invoice.getInvoiceItem().getConsignor_CountryCode());
        Consignor_CountryNameProperty.setValue(invoice.getInvoiceItem().getConsignor_CountryName());
        Consignor_RegionProperty.setValue(invoice.getInvoiceItem().getConsignor_Region());
        Consignor_CityProperty.setValue(invoice.getInvoiceItem().getConsignor_City());
        Consignor_StreetHouseProperty.setValue(invoice.getInvoiceItem().getConsignor_StreetHouse());
    }

    public StringProperty getConsignor_NameProperty() {
        return Consignor_NameProperty;
    }

    public StringProperty getConsignor_PostalCodeProperty() {
        return Consignor_PostalCodeProperty;
    }

    public StringProperty getConsignor_CountryCodeProperty() {
        return Consignor_CountryCodeProperty;
    }

    public StringProperty getConsignor_CountryNameProperty() {
        return Consignor_CountryNameProperty;
    }

    public StringProperty getConsignor_RegionProperty() {
        return Consignor_RegionProperty;
    }

    public StringProperty getConsignor_CityProperty() {
        return Consignor_CityProperty;
    }

    public StringProperty getConsignor_StreetHouseProperty() {
        return Consignor_StreetHouseProperty;
    }

}
