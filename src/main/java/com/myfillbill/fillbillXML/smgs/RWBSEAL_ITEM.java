/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.smgs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Maksims
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class RWBSEAL_ITEM
{
    private String DOC_ID;

    private String SealQuantity;

    private String SealId;

    private String WhoseSeal;

    public String getDOC_ID ()
    {
        return DOC_ID;
    }

    public void setDOC_ID (String DOC_ID)
    {
        this.DOC_ID = DOC_ID;
    }

    public String getSealQuantity ()
    {
        return SealQuantity;
    }

    public void setSealQuantity (String SealQuantity)
    {
        this.SealQuantity = SealQuantity;
    }

    public String getSealId ()
    {
        return SealId;
    }

    public void setSealId (String SealId)
    {
        this.SealId = SealId;
    }

    public String getWhoseSeal ()
    {
        return WhoseSeal;
    }

    public void setWhoseSeal (String WhoseSeal)
    {
        this.WhoseSeal = WhoseSeal;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DOC_ID = "+DOC_ID+", SealQuantity = "+SealQuantity+", SealId = "+SealId+", WhoseSeal = "+WhoseSeal+"]";
    }
}
