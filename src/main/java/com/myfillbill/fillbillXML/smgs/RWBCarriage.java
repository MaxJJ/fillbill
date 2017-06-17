/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.smgs;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RWBCarriage
{
    private String nodetype;

      @XmlElement(name = "RWBCARRIAGE_ITEM")
    private List<RWBCARRIAGE_ITEM> carriageList;

    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public List<RWBCARRIAGE_ITEM> getCarriageList() {
        return carriageList;
    }

    public void setCarriageList(List<RWBCARRIAGE_ITEM> carriageList) {
        this.carriageList = carriageList;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [nodetype = "+nodetype+", RWBCARRIAGE_ITEM = "+carriageList+"]";
    }
}

