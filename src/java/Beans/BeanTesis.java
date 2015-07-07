/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Tesis;
import Modelo.TesisRecepcion;
import Utils.Constantes;
import Utils.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanTesis implements Serializable {
    private Tesis objTesisReg;
    private Tesis objTesisList;
    private Tesis objTesisModif;
    private Tesis objTesisElim;
    private Tesis objTesisBusca;
    private TesisRecepcion objTesisRecepDetalle;
    private TesisRecepcion selectTesisRecepcion;
    private TesisRecepcion objTesisRecepReg;
    private ArrayList<Tesis> arrTesis = null;
    private ArrayList<Tesis> arrTesisBusq = null;
    
    private ArrayList<TesisRecepcion> arrTesisRecepcion = null;
    private ArrayList<TesisRecepcion> arrTesisRecepcion_aux = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    private boolean bandFormVer = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    // validacion de ingreso de nueva recepcion de tesis
    private String valida;
    
    //encapsulamiento SET / GET
    
    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    public TesisRecepcion getObjTesisRecepReg() {
        return objTesisRecepReg;
    }

    public void setObjTesisRecepReg(TesisRecepcion objTesisRecepReg) {
        this.objTesisRecepReg = objTesisRecepReg;
    }
    
    
    public TesisRecepcion getSelectTesisRecepcion() {
        return selectTesisRecepcion;
    }

    public void setSelectTesisRecepcion(TesisRecepcion selectTesisRecepcion) {
        this.selectTesisRecepcion = selectTesisRecepcion;
    }
    
    
    public TesisRecepcion getObjTesisRecepDetalle() {
        return objTesisRecepDetalle;
    }

    public void setObjTesisRecepDetalle(TesisRecepcion objTesisRecepDetalle) {
        this.objTesisRecepDetalle = objTesisRecepDetalle;
    }
    
    
    public boolean isBandFormVer() {
        return bandFormVer;
    }

    public void setBandFormVer(boolean bandFormVer) {
        this.bandFormVer = bandFormVer;
    }
    
    public ArrayList<TesisRecepcion> getArrTesisRecepcion() {
        return arrTesisRecepcion;
    }

    public void setArrTesisRecepcion(ArrayList<TesisRecepcion> arrTesisRecepcion) {
        this.arrTesisRecepcion = arrTesisRecepcion;
    }
    
    
    public Tesis getObjTesisReg() {
        return objTesisReg;
    }

    public void setObjTesisReg(Tesis objTesisReg) {
        this.objTesisReg = objTesisReg;
    }

    public Tesis getObjTesisList() {
        return objTesisList;
    }

    public void setObjTesisList(Tesis objTesisList) {
        this.objTesisList = objTesisList;
    }

    public Tesis getObjTesisModif() {
        return objTesisModif;
    }

    public void setObjTesisModif(Tesis objTesisModif) {
        this.objTesisModif = objTesisModif;
    }

    public Tesis getObjTesisElim() {
        return objTesisElim;
    }

    public void setObjTesisElim(Tesis objTesisElim) {
        this.objTesisElim = objTesisElim;
    }

    public Tesis getObjTesisBusca() {
        return objTesisBusca;
    }

    public void setObjTesisBusca(Tesis objTesisBusca) {
        this.objTesisBusca = objTesisBusca;
    }

    public ArrayList<Tesis> getArrTesis() {
        return arrTesis;
    }

    public void setArrTesis(ArrayList<Tesis> arrTesis) {
        this.arrTesis = arrTesis;
    }

    public ArrayList<Tesis> getArrTesisBusq() {
        return arrTesisBusq;
    }

    public void setArrTesisBusq(ArrayList<Tesis> arrTesisBusq) {
        this.arrTesisBusq = arrTesisBusq;
    }

    public Integer getActiveTabIndex() {
        return activeTabIndex;
    }

    public void setActiveTabIndex(Integer activeTabIndex) {
        this.activeTabIndex = activeTabIndex;
    }

    public boolean isBandVer() {
        return bandVer;
    }

    public void setBandVer(boolean bandVer) {
        this.bandVer = bandVer;
    }

    public boolean isBandMod() {
        return bandMod;
    }

    public void setBandMod(boolean bandMod) {
        this.bandMod = bandMod;
    }

    public boolean isBandEli() {
        return bandEli;
    }

    public void setBandEli(boolean bandEli) {
        this.bandEli = bandEli;
    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }
    
    //-----------------Inicializaciones------------------------
    public void doIniciarTesisReg()
    {
        this.objTesisReg = new Tesis();
    }        
    
    public void doIniciarTesisList()
    {
        this.objTesisList = new Tesis();
    }
    
    public void doIniciarTesisModif()
    {
        this.objTesisModif = new Tesis();
    }
    
    public void doIniciarTesisElim()
    {
        this.objTesisElim = new Tesis();
    }
    
    public void doIniciarTesisBusca()
    {
        this.objTesisBusca = new Tesis();
    }
    
    public void doIniciarArrTesis()
    {
        this.arrTesis = new ArrayList<Tesis>();
    }
    
    public void doIniciarArrTesisBusq()
    {
        this.arrTesisBusq = new ArrayList<Tesis>();
    }
    
    public void doIniciarArrTesisRecepcion()
    {
        this.arrTesisRecepcion = new ArrayList<TesisRecepcion>();
    }
    
    public void doIniciarArrTesisRecepcion_aux()
    {
        this.arrTesisRecepcion_aux = new ArrayList<TesisRecepcion>();
    }
    
    public void doIniciarSelectTesisRecepcion()
    {
        this.selectTesisRecepcion = new TesisRecepcion();
    }
    
    public void doIniciarTesisRecepReg()
    {
        this.objTesisRecepReg = new TesisRecepcion();
    }
    
    
    //--------------Constructor ----------------
    public BeanTesis() {
        try {
            doIniciarTesisReg();
            doIniciarTesisRecepReg();
            doIniciarTesisBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Tesis");
        }        
    }
    
    //----- listar los datos de la tesis
    public ArrayList<TesisRecepcion> doListarTesis() {
        this.doIniciarArrTesisRecepcion();
        // bandExportTab = false;
        this.arrTesisRecepcion = TesisRecepcion.getCargarTesis();
        return this.arrTesisRecepcion;
    }
    
    //---- cantidad de registro que posee el array
    public String getSizeRegistrosTesis() {        
        if (this.arrTesisRecepcion == null) {
            System.out.println("NADA de tesis");
            return "0";
        } else {
            System.out.println("regs: "+arrTesisRecepcion.size());
            return "" + this.arrTesisRecepcion.size();
        }
    }    
    
    // para validacion de ingreso de una nueva recepcion de tesis
    //----- listar los datos de la tesis
    public ArrayList<TesisRecepcion> doRecepcionFinalizada(int tesis) {
        this.doIniciarArrTesisRecepcion_aux();
        System.out.println("ID: "+tesis);
        this.arrTesisRecepcion_aux = TesisRecepcion.getCuentaTesisRevisadas(tesis);
        return this.arrTesisRecepcion_aux;
    }
    
     //---- cantidad de registro que posee el array de revision de tesis
    public boolean getSizeRegistrosRecepFin() {        
        if (this.arrTesisRecepcion_aux == null) {
            System.out.println("NADA DE REVISIONES");
            return true;
        } else {
            System.out.println("Revision: "+arrTesisRecepcion_aux.size());
            //return "" + this.arrTesisRecepcion_aux.size();
            return false;
        }
    }  
    
    //------------ ver los detalles de la tesis
    public String mostrarDetalleTesis(TesisRecepcion tr) {
        this.objTesisRecepDetalle = tr;
        this.bandVer = false;
        this.activeTabIndex = Constantes.TAB_VER; //tab 2
        //Hace Visible el Formulario para Mostrar Detalle 
        this.bandFormVer = true;
        return null;
    }
    
    //---------desactivar el tab de detalle
    public String desactivaTabVer() {
        this.bandVer = true;
        //Pregunta si la Detalle Mostrada Proviene listado total:1 
        if (puntAnt.compareTo("1") == 0) {
            this.activeTabIndex = Constantes.TAB_LISTAR;
        }

        return null;
    }
    
    //------------cambio de tabs
    public void onClickCambio(javax.faces.event.ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();// 1 -> proviene de tab_Listar
        System.out.println("P_anterior: "+this.puntAnt);
    }
    
    //------------Registrar una tesis--------------------------------------------------------------- 
    public String doRegistroTesis(){
        try{
             if(Tesis.registrarTesis(this.objTesisReg)){
                  Mensaje.guardarMensajeExito("Registrar Tesis", "Registrado Correctamente");  
                  this.doIniciarTesisReg();
              }
             else{
                    Mensaje.manejarError("Registrar Tesis", "Error de Registro");
                 }
        } catch (Exception e) {
            Mensaje.manejarError(e,"Registrar Tesis");
        }
        return null;
    }
    
    //------------Registrar una nueva recepcion de tesis--------------------------------------------------------------- 
    public String doRegistroTesisRecepcion(){
        try{
            objTesisRecepReg.setObjTesis(selectTesisRecepcion.getObjTesis());
             if(TesisRecepcion.registrarTesisRecepcion(objTesisRecepReg)){
                  Mensaje.guardarMensajeExito("Registrar Recepcion Tesis", "Registrado Correctamente");  
                  this.doIniciarTesisRecepReg();
              }
             else{
                    Mensaje.manejarError("Registrar Recepcion Tesis", "Error de Registro");
                 }
        } catch (Exception e) {
            Mensaje.manejarError(e,"Registrar Recepcion Tesis");
        }
        return null;
    }
    
}
