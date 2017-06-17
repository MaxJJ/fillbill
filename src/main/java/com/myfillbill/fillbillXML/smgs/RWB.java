/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.smgs;

/**
 *
 * @author Maksims
 */
public class RWB {
      private RWB_ITEM RWB_ITEM;

    public RWB_ITEM getRWB_ITEM ()
    {
        return RWB_ITEM;
    }

    public void setRWB_ITEM (RWB_ITEM RWB_ITEM)
    {
        this.RWB_ITEM = RWB_ITEM;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RWB_ITEM = "+RWB_ITEM+"]";
    }
    
}
