package com.myfillbill.fillbillXML.smgs;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
public class RWBBORDERSTATION_ITEM
{
    private String DOC_ID;

    private String RailwayCode;

    private String StationCode;

    private String RoadName;

    private String StationName;

    public String getDOC_ID ()
    {
        return DOC_ID;
    }

    public void setDOC_ID (String DOC_ID)
    {
        this.DOC_ID = DOC_ID;
    }

    public String getRailwayCode ()
    {
        return RailwayCode;
    }

    public void setRailwayCode (String RailwayCode)
    {
        this.RailwayCode = RailwayCode;
    }

    public String getStationCode ()
    {
        return StationCode;
    }

    public void setStationCode (String StationCode)
    {
        this.StationCode = StationCode;
    }

    public String getRoadName ()
    {
        return RoadName;
    }

    public void setRoadName (String RoadName)
    {
        this.RoadName = RoadName;
    }

    public String getStationName ()
    {
        return StationName;
    }

    public void setStationName (String StationName)
    {
        this.StationName = StationName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DOC_ID = "+DOC_ID+", RailwayCode = "+RailwayCode+", StationCode = "+StationCode+", RoadName = "+RoadName+", StationName = "+StationName+"]";
    }
}
