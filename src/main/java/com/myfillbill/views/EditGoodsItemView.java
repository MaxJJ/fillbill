package com.myfillbill.views;

import com.gluonhq.particle.view.FXMLView;

//@ParticleView(name = "editgoods")
public class EditGoodsItemView extends FXMLView {
    
    public EditGoodsItemView() {
        super(EditGoodsItemView.class.getResource("editgoods.fxml"));
        
    }
    
    @Override
    public void start() {
        
        System.out.println("view --"+getContent());
    }
    
    @Override
    public void stop() {
//        ((PrimaryController) getController()).dispose();
    }
    
   
}
