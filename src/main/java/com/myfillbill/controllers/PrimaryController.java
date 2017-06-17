package com.myfillbill.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.form.Form;
import com.gluonhq.particle.form.FormManager;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;
import com.myfillbill.fillbillXML.invoice.FillBillInvoice;
import com.myfillbill.fillbillXML.invoice.test.INVOICEGOODS_ITEM;
import com.myfillbill.utils.InvoiceProps;
import com.myfillbill.utils.Services;
import com.myfillbill.views.GoodsItemForm;
import com.myfillbill.views.listCellViews.GoodsListCell;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;


public class PrimaryController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

    @Inject private StateManager stateManager;
     @Inject private FormManager formManager;
   private Services get;
    private boolean first = false;
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
     @FXML
   private ResourceBundle resources;
    
     private Action actionSignin;
     
    @FXML
    private AnchorPane primary;
    @FXML
    private TextField sellerName;
    @FXML
    private TextField sellerINN;
    @FXML
    private ListView<INVOICEGOODS_ITEM> goodsList;
    
   @FXML
    private Button readInvoice;
    private Action readInvoiceAction;
    
   @FXML
    private Button save;
    private Action saveInvoiceAction;
    
   @FXML
    private Button checkInvoice;
    private Action checkInvoiceAction;
    
private FillBillInvoice invoice;
private  InvoiceProps props;
    
    public void initialize() {
        ActionMap.register(this);
        
//        actionSignin =  ActionMap.action("signin");
        readInvoiceAction = ActionMap.action("readinv");
        saveInvoiceAction = ActionMap.action("saveinv");

        
        button.setOnAction(e -> viewManager.switchView("smgs"));
        
       readInvoice.textProperty().setValue(readInvoiceAction.getText());
       readInvoice.setOnAction((ActionEvent e) -> {readInvoiceAction.handle(e);});
       save.setOnAction((ActionEvent e) -> {saveInvoiceAction.handle(e);});
  
     
    }
    
    public void postInit() {
        
        this.get = new Services(app);
//        if (first) {
//            stateManager.setPersistenceMode(StateManager.PersistenceMode.USER);
//            addUser(stateManager.getProperty("UserName").orElse("").toString());
//            first = false;
//        }
//        app.getParticle().getToolBarActions().add(0, actionSignin);
        setList();
    }
    
//    public void dispose() {
//        app.getParticle().getToolBarActions().remove(actionSignin);
//    }
//    
//    public void addUser(String userName) {
//        label.setText(resources.getString("label.text") + (userName.isEmpty() ? "" :  ", " + userName) + "!");
//        stateManager.setProperty("UserName", userName);
//    }

//    @ActionProxy(text="Sign In")
//    private void signin() {
//        TextInputDialog input = new TextInputDialog(stateManager.getProperty("UserName").orElse("").toString());
//        input.setTitle("User name");
//        input.setHeaderText(null);
//        input.setContentText("Input your name:");
//        input.showAndWait().ifPresent(this::addUser);
//    }
    
    @ActionProxy(text = "Read invoice")
    private void readinv(){
      
       invoice = get.fillBillInvoice();
       props = get.invoiceProps(invoice, app);
   
    }
    
    @ActionProxy(text = "Save invoice")
    private void saveinv(){
      
    get.saveInvoice( props.getInvoice());   
        
    }


   private void setList(){
       
       goodsList.setCellFactory((ListView<INVOICEGOODS_ITEM> param) -> new GoodsListCell());
      goodsList.setOnMouseClicked((MouseEvent event) -> {
          if(event.getClickCount()==2){
              
              INVOICEGOODS_ITEM selectedItem = goodsList.getSelectionModel().getSelectedItem();
              app.getParticle().getFormManager().getForm(GoodsItemForm.class, Form.UpdateMode.UPDATE_IN_PLACE)
                      .ifPresent(form -> {form.configure(selectedItem)
                              .resizable(false).showAndWait();
                      goodsList.refresh();
                      });
          }
       });
              
              }
   
   
    public TextField getSellerName() {
        return sellerName;
    }

    public void setSellerName(TextField sellerName) {
        this.sellerName = sellerName;
    }

    public TextField getSellerINN() {
        return sellerINN;
    }

    public void setSellerINN(TextField sellerINN) {
        this.sellerINN = sellerINN;
    }
    
}