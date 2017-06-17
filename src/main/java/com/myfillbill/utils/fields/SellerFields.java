/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.props.SellerProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class SellerFields extends SellerProps {
    
    
    private TextField Seler_Name;
    private TextField Seler_INN;
    private TextField Seler_PostalCode;
    private TextField Seler_CountryCode;
    private TextField Seler_CountryName;
    private TextField Seler_Region;
    private TextField Seler_City;
    private TextField Seler_StreetHouse;

    
    
    public SellerFields(View invoiceView,FillBillInvoice invoice) {
        super(invoice);
        Seler_Name = (TextField) invoiceView.getContent().lookup("#Seler_Name");
        Seler_INN = (TextField) invoiceView.getContent().lookup("#Seler_INN");
        Seler_PostalCode = (TextField) invoiceView.getContent().lookup("#Seler_PostalCode");
        Seler_CountryCode = (TextField) invoiceView.getContent().lookup("#Seler_CountryCode");
        Seler_CountryName = (TextField) invoiceView.getContent().lookup("#Seler_CountryName");
        Seler_Region = (TextField) invoiceView.getContent().lookup("#Seler_Region");
        Seler_City = (TextField) invoiceView.getContent().lookup("#Seler_City");
        Seler_StreetHouse = (TextField) invoiceView.getContent().lookup("#Seler_StreetHouse");
        
       bind();
    }
    
    private void bind(){
        
           Seler_Name.textProperty().bindBidirectional(getSeler_NameProperty());
       Seler_PostalCode.textProperty().bindBidirectional(getSeler_PostalCodeProperty());
       Seler_CountryCode.textProperty().bindBidirectional(getSeler_CountryCodeProperty());
       Seler_CountryName.textProperty().bindBidirectional(getSeler_CountryNameProperty());
       Seler_Region.textProperty().bindBidirectional(getSeler_RegionProperty());
      Seler_City.textProperty().bindBidirectional(getSeler_CityProperty());
      Seler_StreetHouse.textProperty().bindBidirectional(getSeler_StreetHouseProperty());
    }

  

    public TextField getSeler_Name() {
        return Seler_Name;
    }

    public TextField getSeler_INN() {
        return Seler_INN;
    }

    public TextField getSeler_PostalCode() {
        return Seler_PostalCode;
    }

    public TextField getSeler_CountryCode() {
        return Seler_CountryCode;
    }

    public TextField getSeler_CountryName() {
        return Seler_CountryName;
    }

    public TextField getSeler_Region() {
        return Seler_Region;
    }

    public TextField getSeler_City() {
        return Seler_City;
    }

    public TextField getSeler_StreetHouse() {
        return Seler_StreetHouse;
    }
    
    
    
}
