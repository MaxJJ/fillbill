/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.props.smgsprops;

import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.fillbillXML.smgs.RWBBORDERSTATION_ITEM;
import com.myfillbill.fillbillXML.smgs.RWBGOODS_ITEM;
import com.myfillbill.fillbillXML.smgs.RWBSEAL_ITEM;
import com.myfillbill.fillbillXML.smgs.SMGS_CARRIERS_ITEM;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Maksims
 */
public class SmgsItemsProps {
    
    private FillBillSmgs smgs;
    private final ObservableList<RWBGOODS_ITEM> observableGoodsList = FXCollections.observableArrayList();
    private final List<RWBGOODS_ITEM> goodsList ;
    private final ObservableList<RWBSEAL_ITEM> observableSealsList = FXCollections.observableArrayList();
    private final List<RWBSEAL_ITEM> sealsList ;
    private final ObservableList<SMGS_CARRIERS_ITEM> observableCarriersList = FXCollections.observableArrayList();
    private final List<SMGS_CARRIERS_ITEM> carriersList ;
    private final ObservableList<RWBBORDERSTATION_ITEM> observableBorderStList = FXCollections.observableArrayList();
    private final List<RWBBORDERSTATION_ITEM> borderStList ;

    public SmgsItemsProps(FillBillSmgs smgs) {
        this.smgs=smgs;
        goodsList=smgs.getRWB_ITEM().getRWBGoods().getGoodsList();
        observableGoodsList.addAll(goodsList);
        sealsList = smgs.getRWB_ITEM().getRWBSeal().getSealsList();
        observableSealsList.addAll(sealsList);
        carriersList=smgs.getRWB_ITEM().getSMGS_CARRIERS().getCarriersList();
        observableCarriersList.addAll(carriersList);
        borderStList = smgs.getRWB_ITEM().getRWBBorderStation().getBorderStationsList();
        observableBorderStList.addAll(borderStList);
    }


    public ObservableList<RWBGOODS_ITEM> getObservableGoodsList() {
        return observableGoodsList;
    }

    public List<RWBGOODS_ITEM> getGoodsList() {
        return goodsList;
    }

    public FillBillSmgs getSmgs() {
        return smgs;
    }

    public ObservableList<RWBSEAL_ITEM> getObservableSealsList() {
        return observableSealsList;
    }

    public List<RWBSEAL_ITEM> getSealsList() {
        return sealsList;
    }

    public ObservableList<SMGS_CARRIERS_ITEM> getObservableCarriersList() {
        return observableCarriersList;
    }

    public List<SMGS_CARRIERS_ITEM> getCarriersList() {
        return carriersList;
    }

    public ObservableList<RWBBORDERSTATION_ITEM> getObservableBorderStList() {
        return observableBorderStList;
    }

    public List<RWBBORDERSTATION_ITEM> getBorderStList() {
        return borderStList;
    }
    
    
    
    
}
