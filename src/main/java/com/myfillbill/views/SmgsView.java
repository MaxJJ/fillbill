package com.myfillbill.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.myfillbill.controllers.SmgsController;

@ParticleView(name = "smgs", isDefault = false)
public class SmgsView extends FXMLView {
    
    public SmgsView() {
        super(SmgsView.class.getResource("smgs.fxml"));
    }
    
    @Override
    public void start() {
  
        ((SmgsController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((SmgsController) getController()).dispose();
    }
    
}
