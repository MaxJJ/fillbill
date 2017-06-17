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
public class RWBGoods
{
    
      @XmlElement(name = "RWBGOODS_ITEM")
    private List<RWBGOODS_ITEM> goodsList;

    private String nodetype="table";


    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RWBGOODS_ITEM = "+goodsList+", nodetype = "+nodetype+"]";
    }

    public List<RWBGOODS_ITEM> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<RWBGOODS_ITEM> goodsList) {
        this.goodsList = goodsList;
    }
    
    
}
