/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.fields.smgsfields;

import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.fillbillXML.smgs.RWBCARRIAGE_ITEM;
import com.myfillbill.utils.props.smgsprops.SmgsHeaderProps;
import java.util.List;
import javafx.scene.control.TextField;

/**
 *
 * @author Maksims
 */
public class SmgsHeaderFields extends SmgsHeaderProps{
    
    private final TextField RegNum;
    private final TextField DepStationName;
    private final TextField DepStationCode;
    private final TextField DestStationName;
    private final TextField DestStationCode;
    private final TextField CarriageId;
    private final TextField GoodsWeight;
    private final TextField ContainerID;
    private final TextField ContainerModeDescription;
    private final TextField ContainerCapacity;
    private final TextField G2;
    private final FillBillSmgs smgs;
    
    public SmgsHeaderFields(View smgsView,FillBillSmgs smgs) {
        super(smgs);
        this.smgs=smgs;
        
        RegNum = (TextField) smgsView.getContent().lookup("#RegNum");
        
        DepStationName = (TextField) smgsView.getContent().lookup("#DepStationName");
        DepStationCode = (TextField) smgsView.getContent().lookup("#DepStationCode");
        DestStationName = (TextField) smgsView.getContent().lookup("#DestStationName");
        DestStationCode = (TextField) smgsView.getContent().lookup("#DestStationCode");
        CarriageId = (TextField) smgsView.getContent().lookup("#CarriageId");
        GoodsWeight = (TextField) smgsView.getContent().lookup("#GoodsWeight");
        ContainerID = (TextField) smgsView.getContent().lookup("#ContainerID");
        ContainerModeDescription = (TextField) smgsView.getContent().lookup("#ContainerModeDescription");
        ContainerCapacity = (TextField) smgsView.getContent().lookup("#ContainerCapacity");
        G2 = (TextField) smgsView.getContent().lookup("#G2");
        
        bind();
        
    }
    private void bind() {
     
        RegNum.textProperty().bindBidirectional(getRegNumProperty());
        DepStationName.textProperty().bindBidirectional(getDepStationNameProperty());
        DepStationCode.textProperty().bindBidirectional(getDepStationCodeProperty());
        DestStationName.textProperty().bindBidirectional(getDestStationNameProperty());
        DestStationCode.textProperty().bindBidirectional(getDestStationCodeProperty());
        CarriageId.textProperty().bindBidirectional(getCarriageIdProperty());
        GoodsWeight.textProperty().bindBidirectional(getGoodsWeightProperty());
        ContainerID.textProperty().bindBidirectional(getContainerIDProperty());
        ContainerModeDescription.textProperty().bindBidirectional(getContainerModeDescriptionProperty());
        ContainerCapacity.textProperty().bindBidirectional(getContainerCapacityProperty());
        G2.textProperty().bindBidirectional(getG2Property());
    }
    
    public void update(){
       smgs.getRWB_ITEM().setRegNum(RegNum.textProperty().getValueSafe());
       smgs.getRWB_ITEM().setDepStationCode(DepStationCode.textProperty().getValueSafe()); 
       smgs.getRWB_ITEM().setDepStationName(DepStationName.textProperty().getValueSafe()); 
       smgs.getRWB_ITEM().setDestStationName(DestStationName.textProperty().getValueSafe()); 
       smgs.getRWB_ITEM().setDestStationCode(DestStationCode.textProperty().getValueSafe()); 
       
        List<RWBCARRIAGE_ITEM> carriageList = smgs.getRWB_ITEM().getRWBCarriage().getCarriageList();
        for (RWBCARRIAGE_ITEM rwbcarriage_item : carriageList) {
           rwbcarriage_item.setCarriageId(CarriageId.textProperty().getValueSafe());
           rwbcarriage_item.setGoodsWeight(GoodsWeight.textProperty().getValueSafe());
        }
      
        smgs.getRWB_ITEM().setContainerID(ContainerID.textProperty().getValueSafe()); 
        smgs.getRWB_ITEM().setContainerModeDescription(ContainerModeDescription.textProperty().getValueSafe()); 
        smgs.getRWB_ITEM().setContainerCapacity(ContainerCapacity.textProperty().getValueSafe()); 
        smgs.getRWB_ITEM().setG2(G2.textProperty().getValueSafe()); 
        
    }

    public TextField getRegNum() {
        return RegNum;
    }

    public TextField getDepStationName() {
        return DepStationName;
    }

    public TextField getDepStationCode() {
        return DepStationCode;
    }

    public TextField getDestStationName() {
        return DestStationName;
    }

    public TextField getDestStationCode() {
        return DestStationCode;
    }

    public TextField getCarriageId() {
        return CarriageId;
    }

    public TextField getGoodsWeight() {
        return GoodsWeight;
    }

    public TextField getContainerID() {
        return ContainerID;
    }

    public TextField getContainerModeDescription() {
        return ContainerModeDescription;
    }

    public TextField getContainerCapacity() {
        return ContainerCapacity;
    }

    public TextField getG2() {
        return G2;
    }

    
    
}
