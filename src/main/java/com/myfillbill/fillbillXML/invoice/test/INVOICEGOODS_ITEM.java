/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.fillbillXML.invoice.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Maksims
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class INVOICEGOODS_ITEM implements Serializable
{
    private String GoodsDescription;
   

    private String NetWeightQuantity;

    private String TotalCost;

    private String MeasureUnitQualifierCode;

    private String MeasureUnitQualifierName;

    private String GrossWeightQuantity;

    private String GoodsQuantity;

    private String kg;

    private String Price;

    private String PlacesDescription;

    private String kg2;

    private String GoodsCode;

    private String PlacesCode;

    private String PlacesQuantity;

    private String SupplementaryQualifierName;

    public String getGoodsDescription ()
    {
        return GoodsDescription;
    }

    public void setGoodsDescription (String GoodsDescription)
    {
        this.GoodsDescription = GoodsDescription;
    }

    public String getNetWeightQuantity ()
    {
        return NetWeightQuantity;
    }

    public void setNetWeightQuantity (String NetWeightQuantity)
    {
        this.NetWeightQuantity = NetWeightQuantity;
    }

    public String getTotalCost ()
    {
        return TotalCost;
    }

    public void setTotalCost (String TotalCost)
    {
        this.TotalCost = TotalCost;
    }

    public String getMeasureUnitQualifierCode ()
    {
        return MeasureUnitQualifierCode;
    }

    public void setMeasureUnitQualifierCode (String MeasureUnitQualifierCode)
    {
        this.MeasureUnitQualifierCode = MeasureUnitQualifierCode;
    }

    public String getMeasureUnitQualifierName ()
    {
        return MeasureUnitQualifierName;
    }

    public void setMeasureUnitQualifierName (String MeasureUnitQualifierName)
    {
        this.MeasureUnitQualifierName = MeasureUnitQualifierName;
    }

    public String getGrossWeightQuantity ()
    {
        return GrossWeightQuantity;
    }

    public void setGrossWeightQuantity (String GrossWeightQuantity)
    {
        this.GrossWeightQuantity = GrossWeightQuantity;
    }

    public String getGoodsQuantity ()
    {
        return GoodsQuantity;
    }

    public void setGoodsQuantity (String GoodsQuantity)
    {
        this.GoodsQuantity = GoodsQuantity;
    }

    public String getKg ()
    {
        return kg;
    }

    public void setKg (String kg)
    {
        this.kg = kg;
    }

    public String getPrice ()
    {
        return Price;
    }

    public void setPrice (String Price)
    {
        this.Price = Price;
    }

    public String getPlacesDescription ()
    {
        return PlacesDescription;
    }

    public void setPlacesDescription (String PlacesDescription)
    {
        this.PlacesDescription = PlacesDescription;
    }

    public String getKg2 ()
    {
        return kg2;
    }

    public void setKg2 (String kg2)
    {
        this.kg2 = kg2;
    }

    public String getGoodsCode ()
    {
        return GoodsCode;
    }

    public void setGoodsCode (String GoodsCode)
    {
        this.GoodsCode = GoodsCode;
    }

    public String getPlacesCode ()
    {
        return PlacesCode;
    }

    public void setPlacesCode (String PlacesCode)
    {
        this.PlacesCode = PlacesCode;
    }

    public String getPlacesQuantity ()
    {
        return PlacesQuantity;
    }

    public void setPlacesQuantity (String PlacesQuantity)
    {
        this.PlacesQuantity = PlacesQuantity;
    }

    public String getSupplementaryQualifierName ()
    {
        return SupplementaryQualifierName;
    }

    public void setSupplementaryQualifierName (String SupplementaryQualifierName)
    {
        this.SupplementaryQualifierName = SupplementaryQualifierName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GoodsDescription = "+GoodsDescription+", NetWeightQuantity = "+NetWeightQuantity+", TotalCost = "+TotalCost+", MeasureUnitQualifierCode = "+MeasureUnitQualifierCode+", MeasureUnitQualifierName = "+MeasureUnitQualifierName+", GrossWeightQuantity = "+GrossWeightQuantity+", GoodsQuantity = "+GoodsQuantity+", kg = "+kg+", Price = "+Price+", PlacesDescription = "+PlacesDescription+", kg2 = "+kg2+", GoodsCode = "+GoodsCode+", PlacesCode = "+PlacesCode+", PlacesQuantity = "+PlacesQuantity+", SupplementaryQualifierName = "+SupplementaryQualifierName+"]";
    }
}
