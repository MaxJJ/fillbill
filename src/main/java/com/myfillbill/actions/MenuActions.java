package com.myfillbill.actions;

import com.gluonhq.particle.annotation.ParticleActions;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.fillbillXML.invoice.test.INVOICEGOODS_ITEM;
import com.myfillbill.utils.Io;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.inject.Inject;
import org.controlsfx.control.action.ActionProxy;

@ParticleActions
public class MenuActions {
    @Inject FillBillInvoice i;
    @Inject ParticleApplication app;
    @Inject ViewManager vm;
    @ActionProxy(text="Exit", accelerator="alt+F4")
    private void exit() {
        app.exit();
    }
    @ActionProxy(text="Read", accelerator="alt+F5")
    private void read() {
        System.out.println("menu --- autowired --- "+ i);
       Io io = new Io(app,vm);
       io.readInvoice();
        FillBillInvoice invoice = io.getInvoice();
              
        List<INVOICEGOODS_ITEM> igi = invoice.getInvoiceItem().getINVOICEGoods().getList();
        
        for (INVOICEGOODS_ITEM invoicegoods_item : igi) {
            
            System.out.println(igi.toString());
        }
        
        io.writeInvoice();
        
    }
    
    @ActionProxy(text="About")
    private void about() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Gluon Desktop");
        alert.setHeaderText("About Gluon Desktop");
        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/icon.png").toExternalForm(), 48, 48, true, true)));
        alert.setContentText("This is a basic Gluon Desktop Application");
        alert.showAndWait();
    }
        
}