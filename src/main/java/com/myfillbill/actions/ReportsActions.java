/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfillbill.actions;

import com.gluonhq.particle.annotation.ParticleActions;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.inject.Inject;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.query.JRXPathQueryExecuterFactory;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRXmlUtils;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.controlsfx.control.action.ActionProxy;
import org.w3c.dom.Document;

/**
 *
 * @author Maksims
 */
@ParticleActions
public class ReportsActions {
    @Inject ParticleApplication app;
    @Inject ViewManager vm;
    
    
    @ActionProxy(text = "Print Invoice")
    private void doInvoice(){
        try {
//            ClassLoader cl = this.getClass().getClassLoader();
            InputStream invoiceTemplate = ReportsActions.class.getClass().getResourceAsStream("/reports/invoice_A4.jrxml");
            
                   
            
            
           
            FileChooser chooser = new FileChooser();
            File dataSourceFile =chooser.showOpenDialog(app.getPrimaryStage().getOwner());
       Document document =  JRXmlUtils.parse(JRLoader.getInputStream(dataSourceFile));
            System.out.println(document);
//            JRXmlDataSource xmlDataSource = new JRXmlDataSource(document);
      
            Map<String,Object> parameters = new HashMap();
            parameters.put(JRXPathQueryExecuterFactory.PARAMETER_XML_DATA_DOCUMENT, document);
            
            JasperReport report = JasperCompileManager.compileReport(invoiceTemplate);
//           JasperPrint jasperPrint= JasperFillManager.fillReport(report, parameters, xmlDataSource.dataSource());
           JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters);
//           String destPdf = chooser.showSaveDialog(app.getPrimaryStage().getOwner()).toString();
           File destPdf = chooser.showSaveDialog(app.getPrimaryStage().getOwner());
//            JasperExportManager.exportReportToPdfFile(jasperPrint, destPdf);
            
//            JasperExportManager.exportReportToHtmlFile(jasperPrint, destPdf);

            JRXlsExporter xlsExporter = new JRXlsExporter();
            
            xlsExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            xlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destPdf));
            xlsExporter.exportReport();
        } catch (JRException ex) {
            Logger.getLogger(ReportsActions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
