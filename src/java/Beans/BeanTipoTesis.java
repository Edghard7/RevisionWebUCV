/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.TipoTesis;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanTipoTesis {
    private TipoTesis objFormTesisReg;
    private TipoTesis objFormTesisList;
    private TipoTesis objFormTesisModif;
    private TipoTesis objFormTesisElim;
    private TipoTesis objFormTesisBusca;
    private ArrayList<TipoTesis> arrFormTesis = null;
    private ArrayList<TipoTesis> arrFormTesisBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public TipoTesis getObjFormTesisReg() {
        return objFormTesisReg;
    }

    public void setObjFormTesisReg(TipoTesis objFormTesisReg) {
        this.objFormTesisReg = objFormTesisReg;
    }

    public TipoTesis getObjFormTesisList() {
        return objFormTesisList;
    }

    public void setObjFormTesisList(TipoTesis objFormTesisList) {
        this.objFormTesisList = objFormTesisList;
    }

    public TipoTesis getObjFormTesisModif() {
        return objFormTesisModif;
    }

    public void setObjFormTesisModif(TipoTesis objFormTesisModif) {
        this.objFormTesisModif = objFormTesisModif;
    }

    public TipoTesis getObjFormTesisElim() {
        return objFormTesisElim;
    }

    public void setObjFormTesisElim(TipoTesis objFormTesisElim) {
        this.objFormTesisElim = objFormTesisElim;
    }

    public TipoTesis getObjFormTesisBusca() {
        return objFormTesisBusca;
    }

    public void setObjFormTesisBusca(TipoTesis objFormTesisBusca) {
        this.objFormTesisBusca = objFormTesisBusca;
    }

    public ArrayList<TipoTesis> getArrFormTesis() {
        return arrFormTesis;
    }

    public void setArrFormTesis(ArrayList<TipoTesis> arrFormTesis) {
        this.arrFormTesis = arrFormTesis;
    }

    public ArrayList<TipoTesis> getArrFormTesisBusq() {
        return arrFormTesisBusq;
    }

    public void setArrFormTesisBusq(ArrayList<TipoTesis> arrFormTesisBusq) {
        this.arrFormTesisBusq = arrFormTesisBusq;
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
    public void doIniciarFormTesisReg()
    {
        this.objFormTesisReg = new TipoTesis();
    }
    
    public void doIniciarFormTesisList()
    {
        this.objFormTesisList = new TipoTesis();
    }
    
    public void doIniciarFormTesisModif()
    {
        this.objFormTesisModif = new TipoTesis();
    }
    
    public void doIniciarFormTesisElim()
    {
        this.objFormTesisElim = new TipoTesis();
    }
    
    public void doIniciarFormTesisBusca()
    {
        this.objFormTesisBusca = new TipoTesis();
    }
    
    public void doIniciarArrFormTesis()
    {
        this.arrFormTesis = new ArrayList<TipoTesis>();
    }
    
    public void doIniciarArrFormTesisBusq()
    {
        this.arrFormTesisBusq = new ArrayList<TipoTesis>();
    }
    
    //--------------Constructor ----------------
    public BeanTipoTesis() {
        try {
            doIniciarFormTesisReg();
            doIniciarFormTesisBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - FormatoTesis");
        }        
    }
    
}
