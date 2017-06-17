/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.props.smgsprops;

import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.fillbillXML.smgs.RWBGOODS_ITEM;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Maksims
 */
public class SmgsCargoProps {
    
    private FillBillSmgs smgs;
    private final ObservableList<RWBGOODS_ITEM> observableGoodsList = FXCollections.observableArrayList();
    private final List<RWBGOODS_ITEM> goodsList ;

    public SmgsCargoProps(FillBillSmgs smgs) {
        this.smgs=smgs;
        goodsList=smgs.getRWB_ITEM().getRWBGoods().getGoodsList();
        observableGoodsList.addAll(goodsList);
        
    }


    public ObservableList<RWBGOODS_ITEM> getObservableGoodsList() {
        return observableGoodsList;
    }

    public List<RWBGOODS_ITEM> getGoodsList() {
        return goodsList;
    }
    
    
    
    
}
