/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.props.BuyerProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class BuyerFields extends BuyerProps {
    
    
    private TextField Buyer_Name;
    private TextField Buyer_INN;
    private TextField Buyer_PostalCode;
    private TextField Buyer_CountryCode;
    private TextField Buyer_CountryName;
    private TextField Buyer_Region;
    private TextField Buyer_City;
    private TextField Buyer_StreetHouse;

    
    
    public BuyerFields(View invoiceView,FillBillInvoice invoice) {
        super(invoice);
        Buyer_Name = (TextField) invoiceView.getContent().lookup("#Buyer_Name");
        Buyer_INN = (TextField) invoiceView.getContent().lookup("#Buyer_INN");
        Buyer_PostalCode = (TextField) invoiceView.getContent().lookup("#Buyer_PostalCode");
        Buyer_CountryCode = (TextField) invoiceView.getContent().lookup("#Buyer_CountryCode");
        Buyer_CountryName = (TextField) invoiceView.getContent().lookup("#Buyer_CountryName");
        Buyer_Region = (TextField) invoiceView.getContent().lookup("#Buyer_Region");
        Buyer_City = (TextField) invoiceView.getContent().lookup("#Buyer_City");
        Buyer_StreetHouse = (TextField) invoiceView.getContent().lookup("#Buyer_StreetHouse");
        
       bind();
    }
    
    private void bind(){
        
           Buyer_Name.textProperty().bindBidirectional(getBuyer_NameProperty());
       Buyer_PostalCode.textProperty().bindBidirectional(getBuyer_PostalCodeProperty());
       Buyer_CountryCode.textProperty().bindBidirectional(getBuyer_CountryCodeProperty());
       Buyer_CountryName.textProperty().bindBidirectional(getBuyer_CountryNameProperty());
       Buyer_Region.textProperty().bindBidirectional(getBuyer_RegionProperty());
      Buyer_City.textProperty().bindBidirectional(getBuyer_CityProperty());
      Buyer_StreetHouse.textProperty().bindBidirectional(getBuyer_StreetHouseProperty());
    }

    public TextField getBuyer_Name() {
        return Buyer_Name;
    }

    public TextField getBuyer_INN() {
        return Buyer_INN;
    }

    public TextField getBuyer_PostalCode() {
        return Buyer_PostalCode;
    }

    public TextField getBuyer_CountryCode() {
        return Buyer_CountryCode;
    }

    public TextField getBuyer_CountryName() {
        return Buyer_CountryName;
    }

    public TextField getBuyer_Region() {
        return Buyer_Region;
    }

    public TextField getBuyer_City() {
        return Buyer_City;
    }

    public TextField getBuyer_StreetHouse() {
        return Buyer_StreetHouse;
    }

}
