/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields.smgsfields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.utils.props.smgsprops.SmgsConsigneeProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class SmgsConsigneeFields extends SmgsConsigneeProps {
    
    
    private TextField Consignee_Name;
    private TextField Consignee_INN;
    private TextField Consignee_RailCode;
    private TextField Consignee_PostalCode;
    private TextField Consignee_CountryCode;
    private TextField Consignee_CountryName;
    private TextField Consignee_Region;
    private TextField Consignee_City;
    private TextField Consignee_StreetHouse;
    
    private FillBillSmgs smgs;

    
    
    public SmgsConsigneeFields(View smgsView,FillBillSmgs smgs) {
        super(smgs);
        this.smgs = smgs;
        Consignee_Name = (TextField) smgsView.getContent().lookup("#Consignee_Name");
        Consignee_INN = (TextField) smgsView.getContent().lookup("#Consignee_INN");
        Consignee_RailCode = (TextField) smgsView.getContent().lookup("#Consignee_RailCode");
        Consignee_PostalCode = (TextField) smgsView.getContent().lookup("#Consignee_PostalCode");
        Consignee_CountryCode = (TextField) smgsView.getContent().lookup("#Consignee_CountryCode");
        Consignee_CountryName = (TextField) smgsView.getContent().lookup("#Consignee_CountryName");
        Consignee_Region = (TextField) smgsView.getContent().lookup("#Consignee_Region");
        Consignee_City = (TextField) smgsView.getContent().lookup("#Consignee_City");
        Consignee_StreetHouse = (TextField) smgsView.getContent().lookup("#Consignee_StreetHouse");
        Consignee_RailCode = (TextField) smgsView.getContent().lookup("#Consignee_RailCode");
        
       bind();
    }
    
    private void bind(){
        
           Consignee_Name.textProperty().bindBidirectional(getConsignee_NameProperty());
       Consignee_PostalCode.textProperty().bindBidirectional(getConsignee_PostalCodeProperty());
       Consignee_CountryCode.textProperty().bindBidirectional(getConsignee_CountryCodeProperty());
       Consignee_CountryName.textProperty().bindBidirectional(getConsignee_CountryNameProperty());
       Consignee_Region.textProperty().bindBidirectional(getConsignee_RegionProperty());
      Consignee_City.textProperty().bindBidirectional(getConsignee_CityProperty());
      Consignee_StreetHouse.textProperty().bindBidirectional(getConsignee_StreetHouseProperty());
      Consignee_RailCode.textProperty().bindBidirectional(getConsignee_RailCodeProperty());
      Consignee_INN.textProperty().bindBidirectional(getConsignee_INNProperty());
    }
    
    public void update(){
     
        smgs.getRWB_ITEM().setConsignee_Name(Consignee_Name.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_PostalCode(Consignee_PostalCode.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_CountryCode(Consignee_CountryCode.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_CountryName(Consignee_CountryName.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_StreetHouse(Consignee_StreetHouse.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_RailCode(Consignee_RailCode.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_INN(Consignee_INN.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_Region(Consignee_Region.textProperty().getValueSafe());
        smgs.getRWB_ITEM().setConsignee_City(Consignee_City.textProperty().getValueSafe());
    }

    public TextField getConsignee_Name() {
        return Consignee_Name;
    }

    public void setConsignee_Name(TextField Consignee_Name) {
        this.Consignee_Name = Consignee_Name;
    }

    public TextField getConsignee_INN() {
        return Consignee_INN;
    }

    public void setConsignee_INN(TextField Consignee_INN) {
        this.Consignee_INN = Consignee_INN;
    }

    public TextField getConsignee_RailCode() {
        return Consignee_RailCode;
    }

    public void setConsignee_RailCode(TextField Consignee_RailCode) {
        this.Consignee_RailCode = Consignee_RailCode;
    }

    public TextField getConsignee_PostalCode() {
        return Consignee_PostalCode;
    }

    public void setConsignee_PostalCode(TextField Consignee_PostalCode) {
        this.Consignee_PostalCode = Consignee_PostalCode;
    }

    public TextField getConsignee_CountryCode() {
        return Consignee_CountryCode;
    }

    public void setConsignee_CountryCode(TextField Consignee_CountryCode) {
        this.Consignee_CountryCode = Consignee_CountryCode;
    }

    public TextField getConsignee_CountryName() {
        return Consignee_CountryName;
    }

    public void setConsignee_CountryName(TextField Consignee_CountryName) {
        this.Consignee_CountryName = Consignee_CountryName;
    }

    public TextField getConsignee_Region() {
        return Consignee_Region;
    }

    public void setConsignee_Region(TextField Consignee_Region) {
        this.Consignee_Region = Consignee_Region;
    }

    public TextField getConsignee_City() {
        return Consignee_City;
    }

    public void setConsignee_City(TextField Consignee_City) {
        this.Consignee_City = Consignee_City;
    }

    public TextField getConsignee_StreetHouse() {
        return Consignee_StreetHouse;
    }

    public void setConsignee_StreetHouse(TextField Consignee_StreetHouse) {
        this.Consignee_StreetHouse = Consignee_StreetHouse;
    }

    
}
