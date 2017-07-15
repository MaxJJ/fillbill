/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields.smgsfields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.fillbillXML.smgs.RWBBORDERSTATION_ITEM;
import com.myfillbill.fillbillXML.smgs.RWBGOODS_ITEM;
import com.myfillbill.fillbillXML.smgs.RWBSEAL_ITEM;
import com.myfillbill.fillbillXML.smgs.SMGS_CARRIERS_ITEM;
import com.myfillbill.utils.props.smgsprops.SmgsItemsProps;
import javafx.scene.control.ListView;

/**
 *
 * @author Maksims
 */
public class SmgsItemsFields extends SmgsItemsProps{
    
    private ListView<RWBGOODS_ITEM> cargoListView;
    private ListView<RWBSEAL_ITEM> sealsListView;
    private ListView<SMGS_CARRIERS_ITEM> carriersListView;
    private ListView<RWBBORDERSTATION_ITEM> borderStListView;

    public SmgsItemsFields(View smgsView,FillBillSmgs smgs) {
       super(smgs); 
       cargoListView= (ListView<RWBGOODS_ITEM>) smgsView.getContent().lookup("#RWBGoods");
       sealsListView= (ListView<RWBSEAL_ITEM>) smgsView.getContent().lookup("#RWBSeal");
       carriersListView= (ListView<SMGS_CARRIERS_ITEM>) smgsView.getContent().lookup("#SMGS_CARRIERS");
       borderStListView=  (ListView<RWBBORDERSTATION_ITEM>) smgsView.getContent().lookup("#RWBBorderStation");
       
       bind();
    }

    private void bind() {
        cargoListView.setItems(getObservableGoodsList());
        sealsListView.setItems(getObservableSealsList());
        carriersListView.setItems(getObservableCarriersList());
        borderStListView.setItems(getObservableBorderStList());
    }
    private  void refreshAll(){
        cargoListView.refresh();
        sealsListView.refresh();
        carriersListView.refresh();
        borderStListView.refresh();
        
        
    }
    
    
    
    
}
