/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.props.smgsprops;

import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Maksims
 */
public class SmgsConsignorProps {
     private StringProperty Consignor_NameProperty = new SimpleStringProperty();
    private StringProperty Consignor_PostalCodeProperty = new SimpleStringProperty();
    private StringProperty Consignor_CountryCodeProperty = new SimpleStringProperty();
    private StringProperty Consignor_CountryNameProperty = new SimpleStringProperty();
    private StringProperty Consignor_RegionProperty = new SimpleStringProperty();
    private StringProperty Consignor_CityProperty = new SimpleStringProperty();
    private StringProperty Consignor_StreetHouseProperty = new SimpleStringProperty();
    private StringProperty Consignor_INNProperty = new SimpleStringProperty();
    private StringProperty Consignor_RailCodeProperty = new SimpleStringProperty();

    public SmgsConsignorProps() {
    }
    
    public SmgsConsignorProps(FillBillSmgs smgs) {
        
        Consignor_NameProperty.setValue(smgs.getRWB_ITEM().getConsignor_Name());
        Consignor_PostalCodeProperty.setValue(smgs.getRWB_ITEM().getConsignor_PostalCode());
        Consignor_CountryCodeProperty.setValue(smgs.getRWB_ITEM().getConsignor_CountryCode());
        Consignor_CountryNameProperty.setValue(smgs.getRWB_ITEM().getConsignor_CountryName());
        Consignor_RegionProperty.setValue(smgs.getRWB_ITEM().getConsignor_Region());
        Consignor_CityProperty.setValue(smgs.getRWB_ITEM().getConsignor_City());
        Consignor_StreetHouseProperty.setValue(smgs.getRWB_ITEM().getConsignor_StreetHouse());
        Consignor_INNProperty.setValue(smgs.getRWB_ITEM().getConsignor_INN());
        Consignor_RailCodeProperty.setValue(smgs.getRWB_ITEM().getConsignor_RailCode());
    }

    public StringProperty getConsignor_NameProperty() {
        return Consignor_NameProperty;
    }

    public void setConsignor_NameProperty(StringProperty Consignor_NameProperty) {
        this.Consignor_NameProperty = Consignor_NameProperty;
    }

    public StringProperty getConsignor_PostalCodeProperty() {
        return Consignor_PostalCodeProperty;
    }

    public void setConsignor_PostalCodeProperty(StringProperty Consignor_PostalCodeProperty) {
        this.Consignor_PostalCodeProperty = Consignor_PostalCodeProperty;
    }

    public StringProperty getConsignor_CountryCodeProperty() {
        return Consignor_CountryCodeProperty;
    }

    public void setConsignor_CountryCodeProperty(StringProperty Consignor_CountryCodeProperty) {
        this.Consignor_CountryCodeProperty = Consignor_CountryCodeProperty;
    }

    public StringProperty getConsignor_CountryNameProperty() {
        return Consignor_CountryNameProperty;
    }

    public void setConsignor_CountryNameProperty(StringProperty Consignor_CountryNameProperty) {
        this.Consignor_CountryNameProperty = Consignor_CountryNameProperty;
    }

    public StringProperty getConsignor_RegionProperty() {
        return Consignor_RegionProperty;
    }

    public void setConsignor_RegionProperty(StringProperty Consignor_RegionProperty) {
        this.Consignor_RegionProperty = Consignor_RegionProperty;
    }

    public StringProperty getConsignor_CityProperty() {
        return Consignor_CityProperty;
    }

    public void setConsignor_CityProperty(StringProperty Consignor_CityProperty) {
        this.Consignor_CityProperty = Consignor_CityProperty;
    }

    public StringProperty getConsignor_StreetHouseProperty() {
        return Consignor_StreetHouseProperty;
    }

    public void setConsignor_StreetHouseProperty(StringProperty Consignor_StreetHouseProperty) {
        this.Consignor_StreetHouseProperty = Consignor_StreetHouseProperty;
    }

    public StringProperty getConsignor_INNProperty() {
        return Consignor_INNProperty;
    }

    public void setConsignor_INNProperty(StringProperty Consignor_INNProperty) {
        this.Consignor_INNProperty = Consignor_INNProperty;
    }

    public StringProperty getConsignor_RailCodeProperty() {
        return Consignor_RailCodeProperty;
    }

    public void setConsignor_RailCodeProperty(StringProperty Consignor_RailCodeProperty) {
        this.Consignor_RailCodeProperty = Consignor_RailCodeProperty;
    }

    
}
