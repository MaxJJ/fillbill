/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.invoice.test;

/**
 *
 * @author Maksims
 */
public class INVOICESaleTerms
{
    private String nodetype;

    private INVOICESALETERMS_ITEM INVOICESALETERMS_ITEM;

    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public INVOICESALETERMS_ITEM getINVOICESALETERMS_ITEM ()
    {
        return INVOICESALETERMS_ITEM;
    }

    public void setINVOICESALETERMS_ITEM (INVOICESALETERMS_ITEM INVOICESALETERMS_ITEM)
    {
        this.INVOICESALETERMS_ITEM = INVOICESALETERMS_ITEM;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nodetype = "+nodetype+", INVOICESALETERMS_ITEM = "+INVOICESALETERMS_ITEM+"]";
    }
}
