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

/**
 *
 * @author Maksims
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class SMGS_CARRIERS 
{
    @XmlElement(name = "SMGS_CARRIERS_ITEM")
    private List<SMGS_CARRIERS_ITEM> carriersList;
    

    private String nodetype = "table";

   
    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public List<SMGS_CARRIERS_ITEM> getCarriersList() {
        return carriersList;
    }

    public void setCarriersList(List<SMGS_CARRIERS_ITEM> carriersList) {
        this.carriersList = carriersList;
    }

    
    @Override
    public String toString()
    {
        return "ClassPojo [carriersList = "+carriersList+", nodetype = "+nodetype+"]";
    }
}

