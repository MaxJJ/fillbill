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
public class CARRIAGE_ITEM
{
    private String CarriageId;

    private String TransportModeCode;

    private String NationalityCode;

    private String MoverIndicator;

    public String getCarriageId ()
    {
        return CarriageId;
    }

    public void setCarriageId (String CarriageId)
    {
        this.CarriageId = CarriageId;
    }

    public String getTransportModeCode ()
    {
        return TransportModeCode;
    }

    public void setTransportModeCode (String TransportModeCode)
    {
        this.TransportModeCode = TransportModeCode;
    }

    public String getNationalityCode ()
    {
        return NationalityCode;
    }

    public void setNationalityCode (String NationalityCode)
    {
        this.NationalityCode = NationalityCode;
    }

    public String getMoverIndicator ()
    {
        return MoverIndicator;
    }

    public void setMoverIndicator (String MoverIndicator)
    {
        this.MoverIndicator = MoverIndicator;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CarriageId = "+CarriageId+", TransportModeCode = "+TransportModeCode+", NationalityCode = "+NationalityCode+", MoverIndicator = "+MoverIndicator+"]";
    }
}
