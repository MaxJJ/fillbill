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
public class INVOICESALETERMS_ITEM
{
    private String SaleTermsCode;

    private String SaleTermsDescription;

    public String getSaleTermsCode ()
    {
        return SaleTermsCode;
    }

    public void setSaleTermsCode (String SaleTermsCode)
    {
        this.SaleTermsCode = SaleTermsCode;
    }

    public String getSaleTermsDescription ()
    {
        return SaleTermsDescription;
    }

    public void setSaleTermsDescription (String SaleTermsDescription)
    {
        this.SaleTermsDescription = SaleTermsDescription;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SaleTermsCode = "+SaleTermsCode+", SaleTermsDescription = "+SaleTermsDescription+"]";
    }
}
