/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.views.listCellViews;

import com.myfillbill.fillbillXML.invoice.test.INVOICEGOODS_ITEM;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;

/**
 *
 * @author Maksims
 */
public class GoodsListCell extends ListCell<INVOICEGOODS_ITEM>{
    
 @FXML
    private Text description;

    @FXML
    private Text tnved;

    @FXML
    private Text qty;

    @FXML
    private Text qtyname;

    @FXML
    private Text qtypls;

    @FXML
    private Text qtyplsname;

    @FXML
    private Text nett;

    @FXML
    private Text gross;

    @FXML
    private Text price;

    @FXML
    private Text amount;
    
    @Override
    protected void updateItem(INVOICEGOODS_ITEM item, boolean empty){
        
         super.updateItem(item, empty);

        if(empty || item == null) {

            setText(null);
            setGraphic(null);

        } 
        FXMLLoader loader = new FXMLLoader(GoodsListCell.class.getResource("goodsListCell.fxml"));
                loader.setController(this);

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
       if(item!=null) {
       description.setText(item.getGoodsDescription());
       tnved.setText(item.getGoodsCode());
       qty.setText(item.getGoodsQuantity());
       qtyname.setText(item.getMeasureUnitQualifierName());
       qtypls.setText(item.getPlacesQuantity());
       qtyplsname.setText(item.getPlacesDescription());
       nett.setText(item.getNetWeightQuantity());
       gross.setText(item.getGrossWeightQuantity());
       price.setText(item.getPrice());
       amount.setText(item.getTotalCost());
       setGraphic(loader.getRoot());
       }
       
        
    }

    public Text getDescription() {
        return description;
    }

    
}
