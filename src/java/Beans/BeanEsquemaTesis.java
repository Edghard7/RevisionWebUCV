/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.EsquemaTesis;
import Utils.Mensaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henry
 */
public class BeanEsquemaTesis {
    private EsquemaTesis objEsqTesisReg;
    private EsquemaTesis objEsqTesisList;
    private EsquemaTesis objEsqTesisModif;
    private EsquemaTesis objEsqTesisElim;
    private EsquemaTesis objEsqTesisBusca;
    private ArrayList<EsquemaTesis> arrEsqTesis = null;
    private List<EsquemaTesis> arrEsqTesisCbo = null;
    private ArrayList<EsquemaTesis> arrEsqTesisBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public List<EsquemaTesis> getArrEsqTesisCbo() {
        return arrEsqTesisCbo;
    }

    public void setArrEsqTesisCbo(List<EsquemaTesis> arrEsqTesisCbo) {
        this.arrEsqTesisCbo = arrEsqTesisCbo;
    }
    
    public EsquemaTesis getObjEsqTesisReg() {
        return objEsqTesisReg;
    }

    public void setObjEsqTesisReg(EsquemaTesis objEsqTesisReg) {
        this.objEsqTesisReg = objEsqTesisReg;
    }

    public EsquemaTesis getObjEsqTesisList() {
        return objEsqTesisList;
    }

    public void setObjEsqTesisList(EsquemaTesis objEsqTesisList) {
        this.objEsqTesisList = objEsqTesisList;
    }

    public EsquemaTesis getObjEsqTesisModif() {
        return objEsqTesisModif;
    }

    public void setObjEsqTesisModif(EsquemaTesis objEsqTesisModif) {
        this.objEsqTesisModif = objEsqTesisModif;
    }

    public EsquemaTesis getObjEsqTesisElim() {
        return objEsqTesisElim;
    }

    public void setObjEsqTesisElim(EsquemaTesis objEsqTesisElim) {
        this.objEsqTesisElim = objEsqTesisElim;
    }

    public EsquemaTesis getObjEsqTesisBusca() {
        return objEsqTesisBusca;
    }

    public void setObjEsqTesisBusca(EsquemaTesis objEsqTesisBusca) {
        this.objEsqTesisBusca = objEsqTesisBusca;
    }

    public ArrayList<EsquemaTesis> getArrEsqTesis() {
        return arrEsqTesis;
    }

    public void setArrEsqTesis(ArrayList<EsquemaTesis> arrEsqTesis) {
        this.arrEsqTesis = arrEsqTesis;
    }

    public ArrayList<EsquemaTesis> getArrEsqTesisBusq() {
        return arrEsqTesisBusq;
    }

    public void setArrEsqTesisBusq(ArrayList<EsquemaTesis> arrEsqTesisBusq) {
        this.arrEsqTesisBusq = arrEsqTesisBusq;
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
    public void doIniciarEsqTesisReg()
    {
        this.objEsqTesisReg = new EsquemaTesis();
    }
    
    public void doIniciarEsqTesisList()
    {
        this.objEsqTesisList = new EsquemaTesis();
    }
    
    public void doIniciarEsqTesisModif()
    {
        this.objEsqTesisModif = new EsquemaTesis();
    }
    
    public void doIniciarEsqTesisElim()
    {
        this.objEsqTesisElim = new EsquemaTesis();
    }
    
    public void doIniciarEsqTesisBusca()
    {
        this.objEsqTesisBusca = new EsquemaTesis();
    }
    
    public void doIniciarArrEsqTesis()
    {
        this.arrEsqTesis = new ArrayList<EsquemaTesis>();
    }
    
    public void doIniciarArrEsqTesisBusq()
    {
        this.arrEsqTesisBusq = new ArrayList<EsquemaTesis>();
    }
    
    public void doIniciarArrEsqTesisCbo()
    {
        this.arrEsqTesisCbo = new ArrayList<EsquemaTesis>();
    }
    
    //--------------Constructor ----------------
    public BeanEsquemaTesis() {
        try {
            doIniciarEsqTesisReg();
            doIniciarEsqTesisBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - EsquemaTesis");
        }        
    }
    
    //_-------combo de esquema de tesis
    public List<EsquemaTesis> doListarComboEsquemaTesis()
    {
        this.doIniciarArrEsqTesisCbo();
        this.arrEsqTesisCbo = EsquemaTesis.getCargarComboEsquemaTesis();
        return this.arrEsqTesisCbo;
    }
    
}
