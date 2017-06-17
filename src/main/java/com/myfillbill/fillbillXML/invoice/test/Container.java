/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.invoice.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Maksims
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Container {
    private String nodetype;

    private CONTAINER_ITEM CONTAINER_ITEM;

    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public CONTAINER_ITEM getCONTAINER_ITEM ()
    {
        return CONTAINER_ITEM;
    }

    public void setCONTAINER_ITEM (CONTAINER_ITEM CONTAINER_ITEM)
    {
        this.CONTAINER_ITEM = CONTAINER_ITEM;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nodetype = "+nodetype+", CONTAINER_ITEM = "+CONTAINER_ITEM+"]";
    }
}
