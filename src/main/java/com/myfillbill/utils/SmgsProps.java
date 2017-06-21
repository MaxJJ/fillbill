/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.utils;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.View;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.utils.fields.smgsfields.SmgsItemsFields;
import com.myfillbill.utils.fields.smgsfields.SmgsConsigneeFields;
import com.myfillbill.utils.fields.smgsfields.SmgsConsignorFields;
import com.myfillbill.utils.fields.smgsfields.SmgsHeaderFields;

/**
 *
 * @author Maksims
 */
public class SmgsProps {
    
    private FillBillSmgs smgs;
    private ParticleApplication app;
    private View smgsView;
    
    
    private SmgsConsigneeFields consignee;
    private SmgsConsignorFields consignor;
    private SmgsHeaderFields header;
    private SmgsItemsFields cargo;
    
     public SmgsProps() {
    }
    

    
    public SmgsProps(FillBillSmgs smgs,ParticleApplication app) {
      this.smgs=smgs;  
      this.app=app;
       smgsView=app.getParticle().getViewManager().getCurrentView();
      init();
    }

    private void init() {
        
       this.consignee = new SmgsConsigneeFields(smgsView,smgs);
       this.consignor = new SmgsConsignorFields(smgsView,smgs);
       this.header = new SmgsHeaderFields(smgsView,smgs);
       this.cargo = new SmgsItemsFields(smgsView,smgs);
        
    }
    
   public FillBillSmgs getSmgsUpdated(){
       
       consignee.update();
       consignor.update();
       header.update();
       
       return smgs;
   }
}
