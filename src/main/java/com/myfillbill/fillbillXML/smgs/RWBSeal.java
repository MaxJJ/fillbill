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
public class RWBSeal
{
    
      @XmlElement(name = "RWBSEAL_ITEM")
    private List<RWBSEAL_ITEM> sealsList;

    private String nodetype = "table";


    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public List<RWBSEAL_ITEM> getSealsList() {
        return sealsList;
    }

    public void setSealsList(List<RWBSEAL_ITEM> sealsList) {
        this.sealsList = sealsList;
    }

    
    @Override
    public String toString()
    {
        return "ClassPojo [RWBSEAL_ITEM = "+sealsList+", nodetype = "+nodetype+"]";
    }
}
	
