/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields.smgsfields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.fillbillXML.smgs.RWBGOODS_ITEM;
import com.myfillbill.utils.props.smgsprops.SmgsCargoProps;
import javafx.scene.control.ListView;

/**
 *
 * @author Maksims
 */
public class SmgsCargoFields extends SmgsCargoProps{
    
    private ListView<RWBGOODS_ITEM> cargoListView;

    public SmgsCargoFields(View smgsView,FillBillSmgs smgs) {
       super(smgs); 
       cargoListView= (ListView<RWBGOODS_ITEM>) smgsView.getContent().lookup("#RWBGoods");
       
       bind();
    }

    private void bind() {
        cargoListView.setItems(getObservableGoodsList());
        cargoListView.refresh();
    }
    
    
    
    
    
}
