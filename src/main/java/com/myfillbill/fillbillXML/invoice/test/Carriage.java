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
public class Carriage
{
    private CARRIAGE_ITEM CARRIAGE_ITEM;

    private String nodetype = "table";

    public CARRIAGE_ITEM getCARRIAGE_ITEM ()
    {
        return CARRIAGE_ITEM;
    }

    public void setCARRIAGE_ITEM (CARRIAGE_ITEM CARRIAGE_ITEM)
    {
        this.CARRIAGE_ITEM = CARRIAGE_ITEM;
    }

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
        return "ClassPojo [CARRIAGE_ITEM = "+CARRIAGE_ITEM+", nodetype = "+nodetype+"]";
    }
}
