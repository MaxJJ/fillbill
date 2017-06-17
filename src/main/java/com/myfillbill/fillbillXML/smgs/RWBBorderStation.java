package com.myfillbill.fillbillXML.smgs;


import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



@XmlAccessorType(XmlAccessType.FIELD)
public class RWBBorderStation
{
    private String nodetype = "table";
    @XmlElement(name ="RWBBORDERSTATION_ITEM" )
    private List<RWBBORDERSTATION_ITEM> borderStationsList;

   

    public String getNodetype ()
    {
        return nodetype;
    }

    public void setNodetype (String nodetype)
    {
        this.nodetype = nodetype;
    }

    public List<RWBBORDERSTATION_ITEM> getBorderStationsList() {
        return borderStationsList;
    }

    public void setBorderStationsList(List<RWBBORDERSTATION_ITEM> borderStationsList) {
        this.borderStationsList = borderStationsList;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [nodetype = "+nodetype+", borderStationsList = "+borderStationsList+"]";
    }
}