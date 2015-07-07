/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Observacion;
import Utils.Constantes;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanObservacion {
    private Observacion objObservacionReg;
    private Observacion objObservacionList;
    private Observacion objObservacionModif;
    private Observacion objObservacionElim;
    private Observacion objObservacionBusca;
    private ArrayList<Observacion> arrObservacion = null;
    private ArrayList<Observacion> arrObservacionBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    private boolean bandFormVer = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public boolean isBandFormVer() {
        return bandFormVer;
    }

    public void setBandFormVer(boolean bandFormVer) {
        this.bandFormVer = bandFormVer;
    }
    
    public Observacion getObjObservacionReg() {
        return objObservacionReg;
    }

    public void setObjObservacionReg(Observacion objObservacionReg) {
        this.objObservacionReg = objObservacionReg;
    }

    public Observacion getObjObservacionList() {
        return objObservacionList;
    }

    public void setObjObservacionList(Observacion objObservacionList) {
        this.objObservacionList = objObservacionList;
    }

    public Observacion getObjObservacionModif() {
        return objObservacionModif;
    }

    public void setObjObservacionModif(Observacion objObservacionModif) {
        this.objObservacionModif = objObservacionModif;
    }

    public Observacion getObjObservacionElim() {
        return objObservacionElim;
    }

    public void setObjObservacionElim(Observacion objObservacionElim) {
        this.objObservacionElim = objObservacionElim;
    }

    public Observacion getObjObservacionBusca() {
        return objObservacionBusca;
    }

    public void setObjObservacionBusca(Observacion objObservacionBusca) {
        this.objObservacionBusca = objObservacionBusca;
    }

    public ArrayList<Observacion> getArrObservacion() {
        return arrObservacion;
    }

    public void setArrObservacion(ArrayList<Observacion> arrObservacion) {
        this.arrObservacion = arrObservacion;
    }

    public ArrayList<Observacion> getArrObservacionBusq() {
        return arrObservacionBusq;
    }

    public void setArrObservacionBusq(ArrayList<Observacion> arrObservacionBusq) {
        this.arrObservacionBusq = arrObservacionBusq;
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
    public void doIniciarObservacionReg()
    {
        this.objObservacionReg = new Observacion();
    }
    
    public void doIniciarObservacionList()
    {
        this.objObservacionList = new Observacion();
    }
    
    public void doIniciarObservacionModif()
    {
        this.objObservacionModif = new Observacion();
    }
    
    public void doIniciarObservacionElim()
    {
        this.objObservacionElim = new Observacion();
    }
    
    public void doIniciarObservacionBusca()
    {
        this.objObservacionBusca = new Observacion();
    }
    
    public void doIniciarArrObservacion()
    {
        this.arrObservacion = new ArrayList<Observacion>();
    }
    
    public void doIniciarArrObservacionBusq()
    {
        this.arrObservacionBusq = new ArrayList<Observacion>();
    }
    
    //--------------Constructor ----------------
    public BeanObservacion() {
        try {
            doIniciarObservacionReg();
            doIniciarObservacionBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Observacion");
        }        
    }
    
    //----- listar los datos de la tesis
    public ArrayList<Observacion> doListarObservacion(int tesis) {
        this.doIniciarArrObservacion();
        // bandExportTab = false;
        this.arrObservacion = Observacion.getCargarObservaciones_Tesis(tesis);
        return this.arrObservacion;
    }
    
    //---- cantidad de registro que posee el array
    public String getSizeRegistrosObservacion() {        
        if (this.arrObservacion == null) {
            System.out.println("NADA de tesis_ observacion");
            return "0";
        } else {
            System.out.println("regs observaciones: "+arrObservacion.size());
            return "" + this.arrObservacion.size();
        }
    }
    
    
    // cambia de vista
    //------------ ver los detalles de la tesis
    public String mostrarObservaciones(int tesis) {
        this.bandVer = false;
        this.activeTabIndex = Constantes.TAB_LISTAR; //tab 2
        //Hace Visible el Formulario para Mostrar Detalle 
        this.bandFormVer = true;
        
        // ejecuta metodo de carga de observaciones
        doListarObservacion(tesis);
        
        return null;
    }
    
    //---------desactivar el tab de detalle
    public String desactivaTabVer() {
        this.bandVer = true;
        this.bandFormVer = false;
        
        doIniciarArrObservacion();
        
        //Pregunta si la Detalle Mostrada Proviene listado total:1 
        if (puntAnt.compareTo("1") == 0) {
            this.activeTabIndex = Constantes.TAB_REGISTRAR;
        }

        return null;
    }
    
    //------------cambio de tabs
    public void onClickCambio(javax.faces.event.ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();// 1 -> proviene de tab_Listar
        System.out.println("P_anterior: "+this.puntAnt);
    }
    
    
}
