package com.myfillbill.fillbillXML.smgs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RWB")
public class FillBillSmgs {

    private RWB_ITEM RWB_ITEM;

    public RWB_ITEM getRWB_ITEM() {
        return RWB_ITEM;
    }

    @XmlElement(name = "RWB_ITEM")
    public void setRWB_ITEM(RWB_ITEM RWB_ITEM) {
        this.RWB_ITEM = RWB_ITEM;
    }

    @Override
    public String toString() {
        return "ClassPojo [RWB_ITEM = " + RWB_ITEM + "]";
    }
}
