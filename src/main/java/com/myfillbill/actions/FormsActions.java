/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.actions;

import com.gluonhq.particle.annotation.ParticleActions;
import com.gluonhq.particle.form.Form;
import com.gluonhq.particle.form.FormManager;
import com.myfillbill.fillbillXML.invoice.test.INVOICEGOODS_ITEM;
import com.myfillbill.views.GoodsItemForm;
import javax.inject.Inject;
import org.controlsfx.control.action.ActionProxy;

/**
 *
 * @author Maksims
 */
@ParticleActions
public class FormsActions {
   @Inject private FormManager formManager;
   
   
   
   @ActionProxy(text = "Item edit")
   public void editgood(){
       INVOICEGOODS_ITEM a = null;
       System.out.println("before --- ");
       formManager.getForm(GoodsItemForm.class, Form.UpdateMode.UPDATE_NEW_INSTANCE)
           .ifPresent(form -> form.configure(a)
                                  .resizable(false)
                                  .showAndWait());
       System.out.println("after --- "+a.hashCode());
       System.out.println(a.getGoodsDescription());
       
       
   }
   
}
