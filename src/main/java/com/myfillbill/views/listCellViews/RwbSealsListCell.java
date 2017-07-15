/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.views.listCellViews;

import com.myfillbill.fillbillXML.smgs.RWBSEAL_ITEM;
import javafx.scene.control.ListCell;

/**
 *
 * @author Maksims
 */
public class RwbSealsListCell extends ListCell<RWBSEAL_ITEM>{
    
    @Override
    protected void updateItem(RWBSEAL_ITEM item, boolean empty){
        
         super.updateItem(item, empty);

        if(empty || item == null) {

            setText(null);
            setGraphic(null);

        } 
       if(item!=null) {
           setText(item.getSealId());
//       setGraphic(loader.getRoot());
       }
       
        
    }

    
}
