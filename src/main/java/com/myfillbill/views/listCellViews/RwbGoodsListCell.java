/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.views.listCellViews;

import com.myfillbill.fillbillXML.smgs.RWBGOODS_ITEM;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.text.Text;

/**
 *
 * @author Maksims
 */
public class RwbGoodsListCell extends ListCell<RWBGOODS_ITEM>{
    
 
    @FXML
    private Text gngetsng;

    @FXML
    private Text description;

    @FXML
    private Text PlacesQuantity;

    @FXML
    private Text PlacesDescription;

    @FXML
    private Text GrossWeightQuantityZD;
    
    @Override
    protected void updateItem(RWBGOODS_ITEM item, boolean empty){
        
         super.updateItem(item, empty);

        if(empty || item == null) {

            setText(null);
            setGraphic(null);

        } 
        FXMLLoader loader = new FXMLLoader(RwbGoodsListCell.class.getResource("rwbGoodsListCell.fxml"));
                loader.setController(this);

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
       if(item!=null) {
       description.setText(item.getGoodsDescription());
       String code = item.getGoodsNomenclatureCode()+" ("+item.getNHMCODE()+")";
       gngetsng.setText(code);
       PlacesQuantity.setText(item.getPlacesQuantity());
       PlacesDescription.setText(item.getPlacesDescription());
       GrossWeightQuantityZD.setText(item.getGrossWeightQuantityZD());
       
       setGraphic(loader.getRoot());
       }
       
        
    }


    
}
