/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.views.listCellViews;

import com.myfillbill.fillbillXML.smgs.RWBBORDERSTATION_ITEM;
import javafx.scene.control.ListCell;

/**
 *
 * @author Maksims
 */
public class BorderStationListCell extends ListCell<RWBBORDERSTATION_ITEM>{
    
    @Override
    protected void updateItem(RWBBORDERSTATION_ITEM item, boolean empty){
        
         super.updateItem(item, empty);

        if(empty || item == null) {

            setText(null);
            setGraphic(null);

        } 
       if(item!=null) {
//          Text text = new Text();
          String boarder = item.getStationName()+" "+item.getStationCode()+" "+item.getRoadName();
          
           setText(boarder);
//       setGraphic(loader.getRoot());
       }
       
        
    }

    
}
