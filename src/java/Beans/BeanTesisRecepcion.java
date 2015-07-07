/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.TesisRecepcion;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanTesisRecepcion {
    private TesisRecepcion objTRecepcionReg;
    private TesisRecepcion objTRecepcionList;
    private TesisRecepcion objTRecepcionModif;
    private TesisRecepcion objTRecepcionElim;
    private TesisRecepcion objTRecepcionBusca;
    private ArrayList<TesisRecepcion> arrTRecepcion = null;
    private ArrayList<TesisRecepcion> arrTRecepcionBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    public TesisRecepcion getObjTRecepcionReg() {
        return objTRecepcionReg;
    }

    public void setObjTRecepcionReg(TesisRecepcion objTRecepcionReg) {
        this.objTRecepcionReg = objTRecepcionReg;
    }

    public TesisRecepcion getObjTRecepcionList() {
        return objTRecepcionList;
    }

    public void setObjTRecepcionList(TesisRecepcion objTRecepcionList) {
        this.objTRecepcionList = objTRecepcionList;
    }

    public TesisRecepcion getObjTRecepcionModif() {
        return objTRecepcionModif;
    }

    public void setObjTRecepcionModif(TesisRecepcion objTRecepcionModif) {
        this.objTRecepcionModif = objTRecepcionModif;
    }

    public TesisRecepcion getObjTRecepcionElim() {
        return objTRecepcionElim;
    }

    public void setObjTRecepcionElim(TesisRecepcion objTRecepcionElim) {
        this.objTRecepcionElim = objTRecepcionElim;
    }

    public TesisRecepcion getObjTRecepcionBusca() {
        return objTRecepcionBusca;
    }

    public void setObjTRecepcionBusca(TesisRecepcion objTRecepcionBusca) {
        this.objTRecepcionBusca = objTRecepcionBusca;
    }

    public ArrayList<TesisRecepcion> getArrTesisRecepcion() {
        return arrTRecepcion;
    }

    public void setArrTRecepcion(ArrayList<TesisRecepcion> arrTRecepcion) {
        this.arrTRecepcion = arrTRecepcion;
    }

    public ArrayList<TesisRecepcion> getArrTRecepcionBusq() {
        return arrTRecepcionBusq;
    }

    public void setArrTRecepcionBusq(ArrayList<TesisRecepcion> arrTRecepcionBusq) {
        this.arrTRecepcionBusq = arrTRecepcionBusq;
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
    public void doIniciarTRecepcionReg()
    {
        this.objTRecepcionReg = new TesisRecepcion();
    }
    
    public void doIniciarTRecepcionList()
    {
        this.objTRecepcionList = new TesisRecepcion();
    }
    
    public void doIniciarTRecepcionModif()
    {
        this.objTRecepcionModif = new TesisRecepcion();
    }
    
    public void doIniciarTRecepcionElim()
    {
        this.objTRecepcionElim = new TesisRecepcion();
    }
    
    public void doIniciarTRecepcionBusca()
    {
        this.objTRecepcionBusca = new TesisRecepcion();
    }
    
    public void doIniciarArrTesisRecepcion()
    {
        this.arrTRecepcion = new ArrayList<TesisRecepcion>();
    }
    
    public void doIniciarArrTRecepcionBusq()
    {
        this.arrTRecepcionBusq = new ArrayList<TesisRecepcion>();
    }
    
    
    //--------------Constructor ----------------
    public BeanTesisRecepcion() {
        try {
            doIniciarTRecepcionReg();
            doIniciarTRecepcionBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - TesisRecepcion");
        }        
    }
}
