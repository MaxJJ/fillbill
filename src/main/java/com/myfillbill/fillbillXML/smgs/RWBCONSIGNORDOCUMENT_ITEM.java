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
public class RWBCONSIGNORDOCUMENT_ITEM
{
    private String DocumentName;

    private String DOC_ID;

    private String DocumentNumber;

    private String DocumentDate;

    private String ModeCode;

    public String getDocumentName ()
    {
        return DocumentName;
    }

    public void setDocumentName (String DocumentName)
    {
        this.DocumentName = DocumentName;
    }

    public String getDOC_ID ()
    {
        return DOC_ID;
    }

    public void setDOC_ID (String DOC_ID)
    {
        this.DOC_ID = DOC_ID;
    }

    public String getDocumentNumber ()
    {
        return DocumentNumber;
    }

    public void setDocumentNumber (String DocumentNumber)
    {
        this.DocumentNumber = DocumentNumber;
    }

    public String getDocumentDate ()
    {
        return DocumentDate;
    }

    public void setDocumentDate (String DocumentDate)
    {
        this.DocumentDate = DocumentDate;
    }

    public String getModeCode ()
    {
        return ModeCode;
    }

    public void setModeCode (String ModeCode)
    {
        this.ModeCode = ModeCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DocumentName = "+DocumentName+", DOC_ID = "+DOC_ID+", DocumentNumber = "+DocumentNumber+", DocumentDate = "+DocumentDate+", ModeCode = "+ModeCode+"]";
    }
}
	
