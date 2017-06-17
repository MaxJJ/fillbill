/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.utils.props.ConsigneeProps;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class ConsigneeFields extends ConsigneeProps {
    
    
    private TextField Consignee_Name;
    private TextField Consignee_INN;
    private TextField Consignee_PostalCode;
    private TextField Consignee_CountryCode;
    private TextField Consignee_CountryName;
    private TextField Consignee_Region;
    private TextField Consignee_City;
    private TextField Consignee_StreetHouse;

    
    
    public ConsigneeFields(View invoiceView,FillBillInvoice invoice) {
        super(invoice);
        System.out.println("view --- "+invoiceView);
        System.out.println("invoice --- "+invoice);
        Consignee_Name = (TextField) invoiceView.getContent().lookup("#Consignee_Name");
        Consignee_INN = (TextField) invoiceView.getContent().lookup("#Consignee_INN");
        Consignee_PostalCode = (TextField) invoiceView.getContent().lookup("#Consignee_PostalCode");
        Consignee_CountryCode = (TextField) invoiceView.getContent().lookup("#Consignee_CountryCode");
        Consignee_CountryName = (TextField) invoiceView.getContent().lookup("#Consignee_CountryName");
        Consignee_Region = (TextField) invoiceView.getContent().lookup("#Consignee_Region");
        Consignee_City = (TextField) invoiceView.getContent().lookup("#Consignee_City");
        Consignee_StreetHouse = (TextField) invoiceView.getContent().lookup("#Consignee_StreetHouse");
        
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
    }

    public TextField getConsignee_Name() {
        return Consignee_Name;
    }

    public TextField getConsignee_INN() {
        return Consignee_INN;
    }

    public TextField getConsignee_PostalCode() {
        return Consignee_PostalCode;
    }

    public TextField getConsignee_CountryCode() {
        return Consignee_CountryCode;
    }

    public TextField getConsignee_CountryName() {
        return Consignee_CountryName;
    }

    public TextField getConsignee_Region() {
        return Consignee_Region;
    }

    public TextField getConsignee_City() {
        return Consignee_City;
    }

    public TextField getConsignee_StreetHouse() {
        return Consignee_StreetHouse;
    }

  
    
    
    
}
