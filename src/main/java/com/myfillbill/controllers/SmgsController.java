package com.myfillbill.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.myfillbill.fillbillXML.smgs.FillBillSmgs;
import com.myfillbill.fillbillXML.smgs.RWBBORDERSTATION_ITEM;
import com.myfillbill.fillbillXML.smgs.RWBGOODS_ITEM;
import com.myfillbill.fillbillXML.smgs.RWBSEAL_ITEM;
import com.myfillbill.fillbillXML.smgs.SMGS_CARRIERS_ITEM;
import com.myfillbill.utils.Services;
import com.myfillbill.utils.SmgsProps;
import com.myfillbill.views.listCellViews.BorderStationListCell;
import com.myfillbill.views.listCellViews.RwbGoodsListCell;
import com.myfillbill.views.listCellViews.RwbSealsListCell;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;


public class SmgsController {

     @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;
    
     private Services get;
     private FillBillSmgs smgs;
private  SmgsProps props;

    @FXML
    private Button button;
      @FXML
    private Button readSmgsButton;
      private Action readSmgsAction;
    
     @FXML
    private ListView<RWBGOODS_ITEM> rwbGoods;
      @FXML
    private ListView<RWBSEAL_ITEM> sealsListView;

    @FXML
    private ListView<RWBBORDERSTATION_ITEM> borderstations;

    @FXML
    private ListView<SMGS_CARRIERS_ITEM> carriersListViews;
    
    @FXML
    private ResourceBundle resources;
    
    private Action actionHome;
    
    public void initialize() {
  
      ActionMap.register(this);
        actionHome =  ActionMap.action("goHome");
        
//        button.setText(resources.getString("button.text"));
        button.setOnAction(e -> viewManager.switchView("primary"));
        readSmgsAction = ActionMap.action("readsmgs");
         readSmgsButton.setOnAction((ActionEvent e) -> {readSmgsAction.handle(e);});
        initSmgsViewFields();
    }
    
    public void postInit() {
//         app.getParticle().getToolBarActions().add(0, actionHome);

this.get = new Services(app);
    }
    
    public void dispose() {
    }
   
       @ActionProxy(text = "Back")
    private void goHome() {
        viewManager.switchView("primary");
    }
    
    @ActionProxy(text = "Read SMGS")
    private void readsmgs(){
      
       smgs = get.fillBillSmgs();
       props = get.smgsProps(smgs, app);
   
    }

    private void initSmgsViewFields() {
       setCargoListView();
       setSealsListView();
       
      setCarriersListView();
      setBoarderStListView();  
        
    }

    private void setCargoListView() {
       
            rwbGoods.setCellFactory((ListView<RWBGOODS_ITEM> param) -> new RwbGoodsListCell() );
      rwbGoods.setOnMouseClicked((MouseEvent event) -> {
          if(event.getClickCount()==2){
              
//              RWBGOODS_ITEM selectedItem = rwbGoods.getSelectionModel().getSelectedItem();
//              app.getParticle().getFormManager().getForm(GoodsItemForm.class, Form.UpdateMode.UPDATE_IN_PLACE)
//                      .ifPresent(form -> {form.configure(selectedItem)
//                              .resizable(false).showAndWait();
//                      rwbGoods.refresh();
//                      });
          } 
       });
    }

    private void setSealsListView() {
             sealsListView.setCellFactory((ListView<RWBSEAL_ITEM> param) -> new RwbSealsListCell());
      sealsListView.setOnMouseClicked((MouseEvent event) -> {
          if(event.getClickCount()==2){
              
             
       } 
        
          });
      }

    private void setCarriersListView() {
        
    }

    private void setBoarderStListView() {
       
        borderstations.setCellFactory(param -> new BorderStationListCell());
        
        
    }
    
    
    
              }
    
    
    
    