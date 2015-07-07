/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.TipoPersona;
import Utils.Mensaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class BeanTipoPersona {
    private TipoPersona objTPersonaReg;
    private TipoPersona objTPersonaList;
    private TipoPersona objTPersonaModif;
    private TipoPersona objTPersonaElim;
    private TipoPersona objTPersonaBusca;
    private ArrayList<TipoPersona> arrTPersona = null;
    private List<TipoPersona> arrTPersonaCbo = null;
    private ArrayList<TipoPersona> arrTPersonaBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public List<TipoPersona> getArrTPersonaCbo() {
        return arrTPersonaCbo;
    }

    public void setArrTPersonaCbo(List<TipoPersona> arrTPersonaCbo) {
        this.arrTPersonaCbo = arrTPersonaCbo;
    }
    
    public TipoPersona getObjTPersonaReg() {
        return objTPersonaReg;
    }

    public void setObjTPersonaReg(TipoPersona objTPersonaReg) {
        this.objTPersonaReg = objTPersonaReg;
    }

    public TipoPersona getObjTPersonaList() {
        return objTPersonaList;
    }

    public void setObjTPersonaList(TipoPersona objTPersonaList) {
        this.objTPersonaList = objTPersonaList;
    }

    public TipoPersona getObjTPersonaModif() {
        return objTPersonaModif;
    }

    public void setObjTPersonaModif(TipoPersona objTPersonaModif) {
        this.objTPersonaModif = objTPersonaModif;
    }

    public TipoPersona getObjTPersonaElim() {
        return objTPersonaElim;
    }

    public void setObjTPersonaElim(TipoPersona objTPersonaElim) {
        this.objTPersonaElim = objTPersonaElim;
    }

    public TipoPersona getObjTPersonaBusca() {
        return objTPersonaBusca;
    }

    public void setObjTPersonaBusca(TipoPersona objTPersonaBusca) {
        this.objTPersonaBusca = objTPersonaBusca;
    }

    public ArrayList<TipoPersona> getArrTipoPersona() {
        return arrTPersona;
    }

    public void setArrTPersona(ArrayList<TipoPersona> arrTPersona) {
        this.arrTPersona = arrTPersona;
    }

    public ArrayList<TipoPersona> getArrTPersonaBusq() {
        return arrTPersonaBusq;
    }

    public void setArrTPersonaBusq(ArrayList<TipoPersona> arrTPersonaBusq) {
        this.arrTPersonaBusq = arrTPersonaBusq;
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
    public void doIniciarTPersonaReg()
    {
        this.objTPersonaReg = new TipoPersona();
    }
    
    public void doIniciarTPersonaList()
    {
        this.objTPersonaList = new TipoPersona();
    }
    
    public void doIniciarTPersonaModif()
    {
        this.objTPersonaModif = new TipoPersona();
    }
    
    public void doIniciarTPersonaElim()
    {
        this.objTPersonaElim = new TipoPersona();
    }
    
    public void doIniciarTPersonaBusca()
    {
        this.objTPersonaBusca = new TipoPersona();
    }
    
    public void doIniciarArrTipoPersona()
    {
        this.arrTPersona = new ArrayList<TipoPersona>();
    }
    
    public void doIniciarArrTPersonaBusq()
    {
        this.arrTPersonaBusq = new ArrayList<TipoPersona>();
    }
    public void doIniciarArrTPersonaCbo()
    {
        this.arrTPersonaCbo = new ArrayList<TipoPersona>();
    }
    //--------------Constructor ----------------
    public BeanTipoPersona() {
        try {
            doIniciarTPersonaReg();
            doIniciarTPersonaBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - TipoPersona");
        }        
    }
    
    
    public List<TipoPersona> doListarComboTipoPersona()
    {
        this.doIniciarArrTPersonaCbo();
        this.arrTPersonaCbo = TipoPersona.getCargarComboTipoPersona();
        return this.arrTPersonaCbo;
    }
    
}
