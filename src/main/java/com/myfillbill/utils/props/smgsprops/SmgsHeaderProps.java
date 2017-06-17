/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils.props.smgsprops;

import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Maksims
 */
public class SmgsHeaderProps {

     private StringProperty RegNumProperty = new SimpleStringProperty();
    private StringProperty DepStationNameProperty = new SimpleStringProperty();
    private StringProperty DepStationCodeProperty = new SimpleStringProperty();
    private StringProperty DestStationNameProperty = new SimpleStringProperty();
    private StringProperty DestStationCodeProperty = new SimpleStringProperty();
    private StringProperty CarriageIdProperty = new SimpleStringProperty();
    private StringProperty GoodsWeightProperty = new SimpleStringProperty();
    private StringProperty ContainerIDProperty = new SimpleStringProperty();
    private StringProperty ContainerModeDescriptionProperty = new SimpleStringProperty();
    private StringProperty ContainerCapacityProperty = new SimpleStringProperty();
    private StringProperty G2Property = new SimpleStringProperty();
    
    public SmgsHeaderProps(FillBillSmgs smgs) {
      
        RegNumProperty.setValue(smgs.getRWB_ITEM().getRegNum());
DepStationNameProperty.setValue(smgs.getRWB_ITEM().getDepStationName());
DepStationCodeProperty.setValue(smgs.getRWB_ITEM().getDepStationCode());
DestStationNameProperty.setValue(smgs.getRWB_ITEM().getDestStationName());
DestStationCodeProperty.setValue(smgs.getRWB_ITEM().getDestStationCode());
CarriageIdProperty.setValue(smgs.getRWB_ITEM().getRWBCarriage().getCarriageList().get(0).getCarriageId());
GoodsWeightProperty.setValue(smgs.getRWB_ITEM().getRWBCarriage().getCarriageList().get(0).getGoodsWeight());
ContainerIDProperty.setValue(smgs.getRWB_ITEM().getContainerID());
ContainerModeDescriptionProperty.setValue(smgs.getRWB_ITEM().getContainerModeDescription());
ContainerCapacityProperty.setValue(smgs.getRWB_ITEM().getContainerCapacity());
G2Property.setValue(smgs.getRWB_ITEM().getG2());
        
 
    }

    private void bind(FillBillSmgs smgs) {
        
    }
    
    
    public StringProperty getRegNumProperty() {
        return RegNumProperty;
    }

    public StringProperty getDepStationNameProperty() {
        return DepStationNameProperty;
    }

    public StringProperty getDepStationCodeProperty() {
        return DepStationCodeProperty;
    }

    public StringProperty getDestStationNameProperty() {
        return DestStationNameProperty;
    }

    public StringProperty getDestStationCodeProperty() {
        return DestStationCodeProperty;
    }

    public StringProperty getCarriageIdProperty() {
        return CarriageIdProperty;
    }

    public StringProperty getGoodsWeightProperty() {
        return GoodsWeightProperty;
    }

    public StringProperty getContainerIDProperty() {
        return ContainerIDProperty;
    }

    public StringProperty getContainerModeDescriptionProperty() {
        return ContainerModeDescriptionProperty;
    }

    public StringProperty getContainerCapacityProperty() {
        return ContainerCapacityProperty;
    }

    public StringProperty getG2Property() {
        return G2Property;
    }


    
    
}
