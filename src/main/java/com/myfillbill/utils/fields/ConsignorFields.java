/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.props.ConsignorProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class ConsignorFields extends ConsignorProps {
    
    
    private TextField Consignor_Name;
    private TextField Consignor_INN;
    private TextField Consignor_PostalCode;
    private TextField Consignor_CountryCode;
    private TextField Consignor_CountryName;
    private TextField Consignor_Region;
    private TextField Consignor_City;
    private TextField Consignor_StreetHouse;

    
    
    public ConsignorFields(View invoiceView,FillBillInvoice invoice) {
        super(invoice);
        System.out.println("view --- "+invoiceView);
        System.out.println("invoice --- "+invoice);
        Consignor_Name = (TextField) invoiceView.getContent().lookup("#Consignor_Name");
        Consignor_INN = (TextField) invoiceView.getContent().lookup("#Consignor_INN");
        Consignor_PostalCode = (TextField) invoiceView.getContent().lookup("#Consignor_PostalCode");
        Consignor_CountryCode = (TextField) invoiceView.getContent().lookup("#Consignor_CountryCode");
        Consignor_CountryName = (TextField) invoiceView.getContent().lookup("#Consignor_CountryName");
        Consignor_Region = (TextField) invoiceView.getContent().lookup("#Consignor_Region");
        Consignor_City = (TextField) invoiceView.getContent().lookup("#Consignor_City");
        Consignor_StreetHouse = (TextField) invoiceView.getContent().lookup("#Consignor_StreetHouse");
        
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
    }

    public TextField getConsignor_Name() {
        return Consignor_Name;
    }

    public TextField getConsignor_INN() {
        return Consignor_INN;
    }

    public TextField getConsignor_PostalCode() {
        return Consignor_PostalCode;
    }

    public TextField getConsignor_CountryCode() {
        return Consignor_CountryCode;
    }

    public TextField getConsignor_CountryName() {
        return Consignor_CountryName;
    }

    public TextField getConsignor_Region() {
        return Consignor_Region;
    }

    public TextField getConsignor_City() {
        return Consignor_City;
    }

    public TextField getConsignor_StreetHouse() {
        return Consignor_StreetHouse;
    }

    
}
