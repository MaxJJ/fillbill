/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.views;

import com.gluonhq.particle.annotation.ParticleForm;
import com.gluonhq.particle.form.Form;
import com.gluonhq.particle.view.ViewManager;
import com.myfillbill.fillbillXML.invoice.test.INVOICEGOODS_ITEM;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.inject.Inject;

/**
 *
 * @author Maksims
 */
@ParticleForm(name = "goods")
public class GoodsItemForm extends Form {

    @Inject
    private ViewManager viewManager;
//@Inject private FXMLLoader loader;

    private TextArea description;
    private INVOICEGOODS_ITEM item;
    private Node node;

    @FXML
    private TextField tnved;
    private StringProperty tnvedProperty = new SimpleStringProperty();

    @FXML
    private TextArea descr;
    private StringProperty descrProperty = new SimpleStringProperty();
    @FXML
    private TextField pcs;
    private StringProperty pcsProperty = new SimpleStringProperty();
    @FXML
    private TextField pcsname;
    private StringProperty pcsnameProperty = new SimpleStringProperty();
    @FXML
    private TextField pcscode;
    private StringProperty pcscodeProperty = new SimpleStringProperty();
    

    @FXML
    private TextField places;
    private StringProperty placesProperty = new SimpleStringProperty();

    @FXML
    private TextField placesname;
private StringProperty placesnameProperty = new SimpleStringProperty();
    @FXML
    private TextField placescode;
private StringProperty placescodeProperty = new SimpleStringProperty();
    @FXML
    private TextField nett;
private StringProperty nettProperty = new SimpleStringProperty();
    @FXML
    private TextField gross;
private StringProperty grossProperty = new SimpleStringProperty();
    @FXML
    private TextField price;
private StringProperty priceProperty = new SimpleStringProperty();
    @FXML
    private TextField amount;
private StringProperty amountProperty = new SimpleStringProperty();



    @Override
    protected String getTitle() {

        return "Goods item editing Form";
    }

    @Override
    protected String getMessage() {

        return "please edit Good";
    }

    @Override
    protected Node getView() {
        FXMLLoader loader = new FXMLLoader(GoodsItemForm.class.getResource("editgoods.fxml"));

        loader.setController(this);
        try {
            node = (AnchorPane) loader.load();

        } catch (IOException ex) {
            Logger.getLogger(GoodsItemForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        bind();
        return node;
    }

    @Override
    protected void importModel(Serializable model) {
        item = (INVOICEGOODS_ITEM) model;
        setProperties(item);

    }

    @Override
    protected void exportModel(Serializable model) {
        item = (INVOICEGOODS_ITEM) model;

        updateItem(item);

    }

    private void setProperties(INVOICEGOODS_ITEM item) {
        tnvedProperty.setValue(item.getGoodsCode());
        descrProperty.setValue(item.getGoodsDescription());
        pcsProperty.setValue(item.getGoodsQuantity());
        pcsnameProperty.setValue(item.getMeasureUnitQualifierName());
        pcscodeProperty.setValue(item.getMeasureUnitQualifierCode());
        placesProperty.setValue(item.getPlacesQuantity());
        placesnameProperty.setValue(item.getPlacesDescription());
        placescodeProperty.setValue(item.getPlacesCode());
        nettProperty.setValue(item.getNetWeightQuantity());
        grossProperty.setValue(item.getGrossWeightQuantity());
        priceProperty.setValue(item.getPrice());
        amountProperty.setValue(item.getTotalCost());
        

    }

    private void bind() {

        tnved.textProperty().bindBidirectional(tnvedProperty);
        descr.textProperty().bindBidirectional(descrProperty);
        pcs.textProperty().bindBidirectional(pcsProperty);
        pcsname.textProperty().bindBidirectional(pcsnameProperty);
        pcscode.textProperty().bindBidirectional(pcscodeProperty);
        places.textProperty().bindBidirectional(placesProperty);
        placesname.textProperty().bindBidirectional(placesnameProperty);
        placescode.textProperty().bindBidirectional(placescodeProperty);
        nett.textProperty().bindBidirectional(nettProperty);
        gross.textProperty().bindBidirectional(grossProperty);
        price.textProperty().bindBidirectional(priceProperty);
        amount.textProperty().bindBidirectional(amountProperty);

    }

    private void updateItem(INVOICEGOODS_ITEM item) {

        item.setGoodsCode(tnvedProperty.getValueSafe());
        item.setGoodsDescription(descrProperty.getValueSafe());
        item.setGoodsQuantity(pcsProperty.getValueSafe());
        item.setMeasureUnitQualifierName(pcsnameProperty.getValueSafe());
        item.setMeasureUnitQualifierCode(pcscodeProperty.getValueSafe());
        item.setPlacesQuantity(placesProperty.getValueSafe());
        item.setPlacesDescription(placesnameProperty.getValueSafe());
        item.setPlacesCode(placescodeProperty.getValueSafe());
        item.setNetWeightQuantity(nettProperty.getValueSafe());
        item.setGrossWeightQuantity(grossProperty.getValueSafe());
        item.setPrice(grossProperty.getValueSafe());
        item.setTotalCost(amountProperty.getValueSafe());
    }

}
