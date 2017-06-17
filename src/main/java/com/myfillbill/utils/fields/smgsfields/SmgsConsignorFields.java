/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields.smgsfields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.utils.props.smgsprops.SmgsConsignorProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class SmgsConsignorFields extends SmgsConsignorProps {
    
    
    private TextField Consignor_Name;
    private TextField Consignor_INN;
    private TextField Consignor_RailCode;
    private TextField Consignor_PostalCode;
    private TextField Consignor_CountryCode;
    private TextField Consignor_CountryName;
    private TextField Consignor_Region;
    private TextField Consignor_City;
    private TextField Consignor_StreetHouse;
    
    private FillBillSmgs smgs;

    
    
    public SmgsConsignorFields(View smgsView,FillBillSmgs smgs) {
        super(smgs);
        this.smgs = smgs;
        Consignor_Name = (TextField) smgsView.getContent().lookup("#Consignor_Name");
        Consignor_INN = (TextField) smgsView.getContent().lookup("#Consignor_INN");
        Consignor_RailCode = (TextField) smgsView.getContent().lookup("#Consignor_RailCode");
        Consignor_PostalCode = (TextField) smgsView.getContent().lookup("#Consignor_PostalCode");
        Consignor_CountryCode = (TextField) smgsView.getContent().lookup("#Consignor_CountryCode");
        Consignor_CountryName = (TextField) smgsView.getContent().lookup("#Consignor_CountryName");
        Consignor_Region = (TextField) smgsView.getContent().lookup("#Consignor_Region");
        Consignor_City = (TextField) smgsView.getContent().lookup("#Consignor_City");
        Consignor_StreetHouse = (TextField) smgsView.getContent().lookup("#Consignor_StreetHouse");
        Consignor_RailCode = (TextField) smgsView.getContent().lookup("#Consignor_RailCode");
        
       bind();
    }
    
    private void bind(){
        
           Consignor_Name.textProperty().bindBidirectional(getConsignor_NameProperty());
       Consignor_PostalCode.textProperty().bindBidirectional(getConsignor_PostalCodeProperty());
       Consignor_CountryCode.textProperty().bindBidirectional(getConsignor_CountryCodeProperty());
       Consignor_CountryName.textProperty().bindBidirectional(getConsignor_CountryNameProperty());
       Consignor_Region.textProperty().bindBidirectional(getConsignor_RegionProperty());
      Consignor_City.textProperty().bindBidirectional(getConsignor_CityProperty());
      Consignor_StreetHouse.textProperty().bindBidirectional(getConsignor_StreetHouseProperty());
      Consignor_RailCode.textProperty().bindBidirectional(getConsignor_RailCodeProperty());
      Consignor_INN.textProperty().bindBidirectional(getConsignor_INNProperty());
    }
    
      public void update(){
     
        smgs.getRWB_ITEM().setConsignor_Name(Consignor_Name.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_PostalCode(Consignor_PostalCode.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_CountryCode(Consignor_CountryCode.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_CountryName(Consignor_CountryName.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_StreetHouse(Consignor_StreetHouse.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_RailCode(Consignor_RailCode.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_INN(Consignor_INN.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_Region(Consignor_Region.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignor_City(Consignor_City.textProperty().getValueSafe());
    }

    public TextField getConsignor_Name() {
        return Consignor_Name;
    }

    public void setConsignor_Name(TextField Consignor_Name) {
        this.Consignor_Name = Consignor_Name;
    }

    public TextField getConsignor_INN() {
        return Consignor_INN;
    }

    public void setConsignor_INN(TextField Consignor_INN) {
        this.Consignor_INN = Consignor_INN;
    }

    public TextField getConsignor_RailCode() {
        return Consignor_RailCode;
    }

    public void setConsignor_RailCode(TextField Consignor_RailCode) {
        this.Consignor_RailCode = Consignor_RailCode;
    }

    public TextField getConsignor_PostalCode() {
        return Consignor_PostalCode;
    }

    public void setConsignor_PostalCode(TextField Consignor_PostalCode) {
        this.Consignor_PostalCode = Consignor_PostalCode;
    }

    public TextField getConsignor_CountryCode() {
        return Consignor_CountryCode;
    }

    public void setConsignor_CountryCode(TextField Consignor_CountryCode) {
        this.Consignor_CountryCode = Consignor_CountryCode;
    }

    public TextField getConsignor_CountryName() {
        return Consignor_CountryName;
    }

    public void setConsignor_CountryName(TextField Consignor_CountryName) {
        this.Consignor_CountryName = Consignor_CountryName;
    }

    public TextField getConsignor_Region() {
        return Consignor_Region;
    }

    public void setConsignor_Region(TextField Consignor_Region) {
        this.Consignor_Region = Consignor_Region;
    }

    public TextField getConsignor_City() {
        return Consignor_City;
    }

    public void setConsignor_City(TextField Consignor_City) {
        this.Consignor_City = Consignor_City;
    }

    public TextField getConsignor_StreetHouse() {
        return Consignor_StreetHouse;
    }

    public void setConsignor_StreetHouse(TextField Consignor_StreetHouse) {
        this.Consignor_StreetHouse = Consignor_StreetHouse;
    }

}
