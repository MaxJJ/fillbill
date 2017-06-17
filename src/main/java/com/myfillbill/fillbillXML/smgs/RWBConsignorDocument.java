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
public class RWBConsignorDocument
{
    private String nodetype = "table";

    @XmlElement(name = "RWBCONSIGNORDOCUMENT_ITEM")
    private List<RWBCONSIGNORDOCUMENT_ITEM> docsList;

    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public List<RWBCONSIGNORDOCUMENT_ITEM> getDocsList() {
        return docsList;
    }

    public void setDocsList(List<RWBCONSIGNORDOCUMENT_ITEM> docsList) {
        this.docsList = docsList;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [nodetype = "+nodetype+", RWBCONSIGNORDOCUMENT_ITEM = "+docsList+"]";
    }
}
