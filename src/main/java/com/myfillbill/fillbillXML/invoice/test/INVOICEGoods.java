/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.invoice.test;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Maksims
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class INVOICEGoods
{
    @XmlAttribute
    private String nodetype = "table";

//    private INVOICEGOODS_ITEM INVOICEGOODS_ITEM;
    
    @XmlElement(name = "INVOICEGOODS_ITEM")
    private List<INVOICEGOODS_ITEM> list;

    public String getNodetype ()
    {
        return nodetype;
    }
 
    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

//    public INVOICEGOODS_ITEM getINVOICEGOODS_ITEM ()
//    {
//        return INVOICEGOODS_ITEM;
//    }
//
//    public void setINVOICEGOODS_ITEM (INVOICEGOODS_ITEM INVOICEGOODS_ITEM)
//    {
//        this.INVOICEGOODS_ITEM = INVOICEGOODS_ITEM;
//    }

    public List<INVOICEGOODS_ITEM> getList() {
        return list;
    }

  
    public void setList(List<INVOICEGOODS_ITEM> list) {
        this.list = list;
    }

    
    
    @Override
    public String toString()
    {
//        return "ClassPojo [nodetype = "+nodetype+", INVOICEGOODS_ITEM = "+INVOICEGOODS_ITEM+"]";
      return "invoice goods";
    }
}
