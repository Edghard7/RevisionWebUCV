/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Escuela;
import Modelo.LineaInvestigacion;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author 
 */
@ManagedBean
public class ChartView implements Serializable {
    
    private LineChartModel lineChart;
    private BarChartModel barChart;
    private HorizontalBarChartModel horizontalChart;
    private PieChartModel pieChart;
    
    //_-------------------------------------------
    private BarChartModel barChartEscuelasTesis;
    private PieChartModel pieChartEscuelasTesis;
    private PieChartModel pieChartEscuelaLineas;
    //-----------------------------------------------
    private boolean bandVer =  false;
    private int id_escuela;
    private ArrayList<LineaInvestigacion> arrLinea = null;
    ///
    
    @PostConstruct
    public void init() {
        //createLineModels();
        createBarModels();
        createPieModels();
    }
    
    // set - get
    
    public ArrayList<LineaInvestigacion> getArrLinea() {
        return arrLinea;
    }

    public void setArrLinea(ArrayList<LineaInvestigacion> arrLinea) {
        this.arrLinea = arrLinea;
    }
    
    public boolean isBandVer() {
        return bandVer;
    }

    public void setBandVer(boolean bandVer) {
        this.bandVer = bandVer;
    }
    
    
    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }
    
    public PieChartModel getPieChartEscuelaLineas() {
        return pieChartEscuelaLineas;
    }

    public void setPieChartEscuelaLineas(PieChartModel pieChartEscuelaLineas) {
        this.pieChartEscuelaLineas = pieChartEscuelaLineas;
    }
    
    public PieChartModel getPieChartEscuelasTesis() {
        return pieChartEscuelasTesis;
    }

    public void setPieChartEscuelasTesis(PieChartModel pieChartEscuelasTesis) {
        this.pieChartEscuelasTesis = pieChartEscuelasTesis;
    }
    
    public BarChartModel getBarChartEscuelasTesis() {
        return barChartEscuelasTesis;
    }

    public void setBarChartEscuelasTesis(BarChartModel barChartEscuelasTesis) {
        this.barChartEscuelasTesis = barChartEscuelasTesis;
    }
    
    public LineChartModel getLineChart() {
        return lineChart;
    }

    public void setLineChart(LineChartModel lineChart) {
        this.lineChart = lineChart;
    }

    public BarChartModel getBarChart() {
        return barChart;
    }

    public void setBarChart(BarChartModel barChart) {
        this.barChart = barChart;
    }

    public HorizontalBarChartModel getHorizontalChart() {
        return horizontalChart;
    }

    public void setHorizontalChart(HorizontalBarChartModel horizontalChart) {
        this.horizontalChart = horizontalChart;
    }

    public PieChartModel getPieChart() {
        return pieChart;
    }

    public void setPieChart(PieChartModel pieChart) {
        this.pieChart = pieChart;
    }
    
    //-------------------
    public void doIniciarArrLinea()
    {
        this.arrLinea = new ArrayList<LineaInvestigacion>();
    }
    
    //--------------------LINE CHART------------------------------------------------------------------------------
    private void createLineModels() {
        lineChart = initLinearModel();
        lineChart.setTitle("Linear Chart");
        lineChart.setLegendPosition("e");
        Axis yAxis = lineChart.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
    }
    
    
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");
 
        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);
 
        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");
 
        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);
 
        model.addSeries(series1);
        model.addSeries(series2);
         
        return model;
    }
    
    
    //--------------------BAR CHART------------------------------------------------------------------------------
    private void createBarModels() {
        //createBarModel();
        createBarModel_TesisEscuela();
    }
    
    private void createPieModels()
    {
        createPieTesis_x_Escuela();
        createPieLineasInv_x_Escuela();
    }
     
    private void createBarModel() {
        barChart = initBarModel();
         
        barChart.setTitle("Bar Chart");
        barChart.setLegendPosition("ne");
         
        Axis xAxis = barChart.getAxis(AxisType.X);
        xAxis.setLabel("Gender");
         
        Axis yAxis = barChart.getAxis(AxisType.Y);
        yAxis.setLabel("Births");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
    //-----------------------------------------R
    private void createBarModel_TesisEscuela() {
        barChartEscuelasTesis = initTesis_x_Escuela();
         
        barChartEscuelasTesis.setTitle("Nro de tesis por cada escuela");
        barChartEscuelasTesis.setLegendPosition("ne");
         
        Axis xAxis = barChartEscuelasTesis.getAxis(AxisType.X);
        xAxis.setLabel("Escuelas");
         
        Axis yAxis = barChartEscuelasTesis.getAxis(AxisType.Y);
        yAxis.setLabel("Nro");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
    //----- llenado desde BD
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
         
        return model;
    }
    
    //----- llenado desde BD
    private BarChartModel initTesis_x_Escuela() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries Escuelas = new ChartSeries();
        
        ArrayList<Escuela> arrEscuela = Escuela.getTesis_x_Escuela();
        
        
        
        if (arrEscuela != null)
        {
            try {
                int n = arrEscuela.size();
                Escuelas.setLabel("Escuelas");
                for (int i = 0; i < n; i++) {
                    Escuelas.set(arrEscuela.get(i).getNombre(), arrEscuela.get(i).getNro());
                }   
                
            } catch (Exception e) {
                System.err.println("Error Report: "+e.getMessage());
            }
            
        }else
        {
            Escuelas.setLabel("No hay valores");   
            Escuelas.set("No hay valores",0); 
        }
 
        model.addSeries(Escuelas);
         
        return model;
    }
    
    //- ------------pie
    private void createPieTesis_x_Escuela() {
        pieChartEscuelasTesis = new PieChartModel();
         
        pieChartEscuelasTesis.setTitle("Nro de tesis por cada escuela");
        pieChartEscuelasTesis.setLegendPosition("w");
        pieChartEscuelasTesis.setShowDataLabels(true);
        
        //ChartSeries Escuelas = new ChartSeries();
        
        ArrayList<Escuela> arrEscuela = Escuela.getTesis_x_Escuela();
        
        
        if (arrEscuela != null)
        {
            try {
                int n = arrEscuela.size();
                //Escuelas.setLabel("Escuelas");
                for (int i = 0; i < n; i++) {
                    pieChartEscuelasTesis.set(arrEscuela.get(i).getNombre()+"("+arrEscuela.get(i).getNro()+ ")", arrEscuela.get(i).getNro());
                }   
                
            } catch (Exception e) {
                System.err.println("Error Report: "+e.getMessage());
            }
            
        }else
        {
            //Escuelas.setLabel("No hay valores");   
            pieChartEscuelasTesis.set("No hay valores",0); 
        }
        
    }
    
    
    //- ------------pie lineas
    public PieChartModel createPieLineasInv_x_Escuela() {
        pieChartEscuelaLineas = new PieChartModel();
         
        pieChartEscuelaLineas.setTitle("Nro de uso de Líneas de investigación por escuela ");
        pieChartEscuelaLineas.setLegendPosition("w");
        pieChartEscuelaLineas.setShowDataLabels(true);
        
        //ChartSeries Escuelas = new ChartSeries();
        
        //ArrayList<LineaInvestigacion> arrLinea = LineaInvestigacion.getLineas_x_Escuela(id_escuela);
        
        if (arrLinea != null)
        {
            try {
                int n = arrLinea.size();
                //Escuelas.setLabel("Escuelas");
                for (int i = 0; i < n; i++) {
                    pieChartEscuelaLineas.set(arrLinea.get(i).getNombre()+"("+arrLinea.get(i).getNro()+ ")", arrLinea.get(i).getNro());
                }   
                
            } catch (Exception e) {
                System.err.println("Error Report: "+e.getMessage());
            }
            
        }else
        {
            //Escuelas.setLabel("No hay valores");   
            pieChartEscuelaLineas.set("No hay valores",0); 
        }
        
        return pieChartEscuelaLineas;
        
    }
    
    public void cargarLineasTesis()
    {
        this.doIniciarArrLinea();
        this.bandVer = true;
        System.out.println("id: "+id_escuela);
        arrLinea = LineaInvestigacion.getLineas_x_Escuela(id_escuela);
        //System.out.println("nro: "+arrLinea.size());
    }
    
    public String getSizeRegistrosArrLinea() {        
        if (this.arrLinea == null) {
            System.out.println("NADA DE lineas");
            return "0";
        } else {
            System.out.println("lienas: "+arrLinea.size());
            //return "" + this.arrTesisRecepcion_aux.size();
            return ""+arrLinea.size();
        }
    }  
    
}
