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
public class SmgsConsigneeProps {
     private StringProperty Consignee_NameProperty = new SimpleStringProperty();
    private StringProperty Consignee_PostalCodeProperty = new SimpleStringProperty();
    private StringProperty Consignee_CountryCodeProperty = new SimpleStringProperty();
    private StringProperty Consignee_CountryNameProperty = new SimpleStringProperty();
    private StringProperty Consignee_RegionProperty = new SimpleStringProperty();
    private StringProperty Consignee_CityProperty = new SimpleStringProperty();
    private StringProperty Consignee_StreetHouseProperty = new SimpleStringProperty();
    private StringProperty Consignee_INNProperty = new SimpleStringProperty();
    private StringProperty Consignee_RailCodeProperty = new SimpleStringProperty();

    public SmgsConsigneeProps() {
    }
    
    public SmgsConsigneeProps(FillBillSmgs smgs) {
        
        Consignee_NameProperty.setValue(smgs.getRWB_ITEM().getConsignee_Name());
        Consignee_PostalCodeProperty.setValue(smgs.getRWB_ITEM().getConsignee_PostalCode());
        Consignee_CountryCodeProperty.setValue(smgs.getRWB_ITEM().getConsignee_CountryCode());
        Consignee_CountryNameProperty.setValue(smgs.getRWB_ITEM().getConsignee_CountryName());
        Consignee_RegionProperty.setValue(smgs.getRWB_ITEM().getConsignee_Region());
        Consignee_CityProperty.setValue(smgs.getRWB_ITEM().getConsignee_City());
        Consignee_StreetHouseProperty.setValue(smgs.getRWB_ITEM().getConsignee_StreetHouse());
        Consignee_INNProperty.setValue(smgs.getRWB_ITEM().getConsignee_INN());
        Consignee_RailCodeProperty.setValue(smgs.getRWB_ITEM().getConsignee_RailCode());
    }

    public StringProperty getConsignee_NameProperty() {
        return Consignee_NameProperty;
    }

    public void setConsignee_NameProperty(StringProperty Consignee_NameProperty) {
        this.Consignee_NameProperty = Consignee_NameProperty;
    }

    public StringProperty getConsignee_PostalCodeProperty() {
        return Consignee_PostalCodeProperty;
    }

    public void setConsignee_PostalCodeProperty(StringProperty Consignee_PostalCodeProperty) {
        this.Consignee_PostalCodeProperty = Consignee_PostalCodeProperty;
    }

    public StringProperty getConsignee_CountryCodeProperty() {
        return Consignee_CountryCodeProperty;
    }

    public void setConsignee_CountryCodeProperty(StringProperty Consignee_CountryCodeProperty) {
        this.Consignee_CountryCodeProperty = Consignee_CountryCodeProperty;
    }

    public StringProperty getConsignee_CountryNameProperty() {
        return Consignee_CountryNameProperty;
    }

    public void setConsignee_CountryNameProperty(StringProperty Consignee_CountryNameProperty) {
        this.Consignee_CountryNameProperty = Consignee_CountryNameProperty;
    }

    public StringProperty getConsignee_RegionProperty() {
        return Consignee_RegionProperty;
    }

    public void setConsignee_RegionProperty(StringProperty Consignee_RegionProperty) {
        this.Consignee_RegionProperty = Consignee_RegionProperty;
    }

    public StringProperty getConsignee_CityProperty() {
        return Consignee_CityProperty;
    }

    public void setConsignee_CityProperty(StringProperty Consignee_CityProperty) {
        this.Consignee_CityProperty = Consignee_CityProperty;
    }

    public StringProperty getConsignee_StreetHouseProperty() {
        return Consignee_StreetHouseProperty;
    }

    public void setConsignee_StreetHouseProperty(StringProperty Consignee_StreetHouseProperty) {
        this.Consignee_StreetHouseProperty = Consignee_StreetHouseProperty;
    }

    public StringProperty getConsignee_INNProperty() {
        return Consignee_INNProperty;
    }

    public void setConsignee_INNProperty(StringProperty Consignee_INNProperty) {
        this.Consignee_INNProperty = Consignee_INNProperty;
    }

    public StringProperty getConsignee_RailCodeProperty() {
        return Consignee_RailCodeProperty;
    }

    public void setConsignee_RailCodeProperty(StringProperty Consignee_RailCodeProperty) {
        this.Consignee_RailCodeProperty = Consignee_RailCodeProperty;
    }

    
    
    
}
