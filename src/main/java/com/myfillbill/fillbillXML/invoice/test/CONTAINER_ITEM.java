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
public class CONTAINER_ITEM
{
    private String ContainerID;

    public String getContainerID ()
    {
        return ContainerID;
    }

    public void setContainerID (String ContainerID)
    {
        this.ContainerID = ContainerID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ContainerID = "+ContainerID+"]";
    }
}