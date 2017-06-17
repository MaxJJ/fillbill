package com.myfillbill;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;
import static org.controlsfx.control.action.ActionMap.actions;

public class MyFillBill extends ParticleApplication {
    

    
    public MyFillBill() {
        
        super("Gluon Desktop Application");
         
        
        
    }

    @Override
    public void postInit(Scene scene) {
  
        scene.getStylesheets().add(MyFillBill.class.getResource("style.css").toExternalForm());

        setTitle("Gluon Desktop Application");

        getParticle().buildMenu("File -> [exit]", "Help -> [about]");
        
        getParticle().buildMenu("FillBill -> [read]");
        getParticle().buildMenu("Report -> [doInvoice]","Form Test -> [editgood]");
        
        getParticle().getToolBarActions().addAll(actions("---", "about", "exit"));
        
        
    }
    

}