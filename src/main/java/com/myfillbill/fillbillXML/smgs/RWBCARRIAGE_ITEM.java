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
public class RWBCARRIAGE_ITEM 
{
    private String Quantity;

    private String TenantName;

    private String CistType;

    private String DOC_ID;

    private String Power;

    private String CarriageLand;

    private String ROADVOWNER;

    private String AxisQuantity;

    private String Tare;

    private String CarriageId;

    private String VAGONTYPE;

    private String CarriageType;

    private String CarriageTypeID;

    private String OwnerType;

    private String GoodsWeight;

    private String OwnerName;

    public String getQuantity ()
    {
        return Quantity;
    }

    public void setQuantity (String Quantity)
    {
        this.Quantity = Quantity;
    }

    public String getTenantName ()
    {
        return TenantName;
    }

    public void setTenantName (String TenantName)
    {
        this.TenantName = TenantName;
    }

    public String getCistType ()
    {
        return CistType;
    }

    public void setCistType (String CistType)
    {
        this.CistType = CistType;
    }

    public String getDOC_ID ()
    {
        return DOC_ID;
    }

    public void setDOC_ID (String DOC_ID)
    {
        this.DOC_ID = DOC_ID;
    }

    public String getPower ()
    {
        return Power;
    }

    public void setPower (String Power)
    {
        this.Power = Power;
    }

    public String getCarriageLand ()
    {
        return CarriageLand;
    }

    public void setCarriageLand (String CarriageLand)
    {
        this.CarriageLand = CarriageLand;
    }

    public String getROADVOWNER ()
    {
        return ROADVOWNER;
    }

    public void setROADVOWNER (String ROADVOWNER)
    {
        this.ROADVOWNER = ROADVOWNER;
    }

    public String getAxisQuantity ()
    {
        return AxisQuantity;
    }

    public void setAxisQuantity (String AxisQuantity)
    {
        this.AxisQuantity = AxisQuantity;
    }

    public String getTare ()
    {
        return Tare;
    }

    public void setTare (String Tare)
    {
        this.Tare = Tare;
    }

    public String getCarriageId ()
    {
        return CarriageId;
    }

    public void setCarriageId (String CarriageId)
    {
        this.CarriageId = CarriageId;
    }

    public String getVAGONTYPE ()
    {
        return VAGONTYPE;
    }

    public void setVAGONTYPE (String VAGONTYPE)
    {
        this.VAGONTYPE = VAGONTYPE;
    }

    public String getCarriageType ()
    {
        return CarriageType;
    }

    public void setCarriageType (String CarriageType)
    {
        this.CarriageType = CarriageType;
    }

    public String getCarriageTypeID ()
    {
        return CarriageTypeID;
    }

    public void setCarriageTypeID (String CarriageTypeID)
    {
        this.CarriageTypeID = CarriageTypeID;
    }

    public String getOwnerType ()
    {
        return OwnerType;
    }

    public void setOwnerType (String OwnerType)
    {
        this.OwnerType = OwnerType;
    }

    public String getGoodsWeight ()
    {
        return GoodsWeight;
    }

    public void setGoodsWeight (String GoodsWeight)
    {
        this.GoodsWeight = GoodsWeight;
    }

    public String getOwnerName ()
    {
        return OwnerName;
    }

    public void setOwnerName (String OwnerName)
    {
        this.OwnerName = OwnerName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Quantity = "+Quantity+", TenantName = "+TenantName+", CistType = "+CistType+", DOC_ID = "+DOC_ID+", Power = "+Power+", CarriageLand = "+CarriageLand+", ROADVOWNER = "+ROADVOWNER+", AxisQuantity = "+AxisQuantity+", Tare = "+Tare+", CarriageId = "+CarriageId+", VAGONTYPE = "+VAGONTYPE+", CarriageType = "+CarriageType+", CarriageTypeID = "+CarriageTypeID+", OwnerType = "+OwnerType+", GoodsWeight = "+GoodsWeight+", OwnerName = "+OwnerName+"]";
    }
}
