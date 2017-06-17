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
public class SMGS_CARRIERS_ITEM
{
    private String STATIONROADINTO;

    private String NAME;

    private String DOC_ID;

    private String STATIONCODEFROM;

    private String ID;

    private String STATIONROADFROM;

    private String STATIONCODEINTO;

    private String STATIONNAMEINTO;

    private String STATIONNAMEFROM;

    public String getSTATIONROADINTO ()
    {
        return STATIONROADINTO;
    }

    public void setSTATIONROADINTO (String STATIONROADINTO)
    {
        this.STATIONROADINTO = STATIONROADINTO;
    }

    public String getNAME ()
    {
        return NAME;
    }

    public void setNAME (String NAME)
    {
        this.NAME = NAME;
    }

    public String getDOC_ID ()
    {
        return DOC_ID;
    }

    public void setDOC_ID (String DOC_ID)
    {
        this.DOC_ID = DOC_ID;
    }

    public String getSTATIONCODEFROM ()
    {
        return STATIONCODEFROM;
    }

    public void setSTATIONCODEFROM (String STATIONCODEFROM)
    {
        this.STATIONCODEFROM = STATIONCODEFROM;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getSTATIONROADFROM ()
    {
        return STATIONROADFROM;
    }

    public void setSTATIONROADFROM (String STATIONROADFROM)
    {
        this.STATIONROADFROM = STATIONROADFROM;
    }

    public String getSTATIONCODEINTO ()
    {
        return STATIONCODEINTO;
    }

    public void setSTATIONCODEINTO (String STATIONCODEINTO)
    {
        this.STATIONCODEINTO = STATIONCODEINTO;
    }

    public String getSTATIONNAMEINTO ()
    {
        return STATIONNAMEINTO;
    }

    public void setSTATIONNAMEINTO (String STATIONNAMEINTO)
    {
        this.STATIONNAMEINTO = STATIONNAMEINTO;
    }

    public String getSTATIONNAMEFROM ()
    {
        return STATIONNAMEFROM;
    }

    public void setSTATIONNAMEFROM (String STATIONNAMEFROM)
    {
        this.STATIONNAMEFROM = STATIONNAMEFROM;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [STATIONROADINTO = "+STATIONROADINTO+", NAME = "+NAME+", DOC_ID = "+DOC_ID+", STATIONCODEFROM = "+STATIONCODEFROM+", ID = "+ID+", STATIONROADFROM = "+STATIONROADFROM+", STATIONCODEINTO = "+STATIONCODEINTO+", STATIONNAMEINTO = "+STATIONNAMEINTO+", STATIONNAMEFROM = "+STATIONNAMEFROM+"]";
    }
}
