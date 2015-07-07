/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.LineaInvestigacion;
import Utils.Mensaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class BeanLineaInvestigacion {
    private LineaInvestigacion objLinInvestReg;
    private LineaInvestigacion objLinInvestList;
    private LineaInvestigacion objLinInvestModif;
    private LineaInvestigacion objLinInvestElim;
    private LineaInvestigacion objLinInvestBusca;
    private ArrayList<LineaInvestigacion> arrLinInvest = null;
    private List<LineaInvestigacion> arrLinInvestCbo = null;
    private ArrayList<LineaInvestigacion> arrLinInvestBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public List<LineaInvestigacion> getArrLinInvestCbo() {
        return arrLinInvestCbo;
    }

    public void setArrLinInvestCbo(List<LineaInvestigacion> arrLinInvestCbo) {
        this.arrLinInvestCbo = arrLinInvestCbo;
    }
    
    public LineaInvestigacion getObjLinInvestReg() {
        return objLinInvestReg;
    }

    public void setObjLinInvestReg(LineaInvestigacion objLinInvestReg) {
        this.objLinInvestReg = objLinInvestReg;
    }

    public LineaInvestigacion getObjLinInvestList() {
        return objLinInvestList;
    }

    public void setObjLinInvestList(LineaInvestigacion objLinInvestList) {
        this.objLinInvestList = objLinInvestList;
    }

    public LineaInvestigacion getObjLinInvestModif() {
        return objLinInvestModif;
    }

    public void setObjLinInvestModif(LineaInvestigacion objLinInvestModif) {
        this.objLinInvestModif = objLinInvestModif;
    }

    public LineaInvestigacion getObjLinInvestElim() {
        return objLinInvestElim;
    }

    public void setObjLinInvestElim(LineaInvestigacion objLinInvestElim) {
        this.objLinInvestElim = objLinInvestElim;
    }

    public LineaInvestigacion getObjLinInvestBusca() {
        return objLinInvestBusca;
    }

    public void setObjLinInvestBusca(LineaInvestigacion objLinInvestBusca) {
        this.objLinInvestBusca = objLinInvestBusca;
    }

    public ArrayList<LineaInvestigacion> getArrLinInvest() {
        return arrLinInvest;
    }

    public void setArrLinInvest(ArrayList<LineaInvestigacion> arrLinInvest) {
        this.arrLinInvest = arrLinInvest;
    }

    public ArrayList<LineaInvestigacion> getArrLinInvestBusq() {
        return arrLinInvestBusq;
    }

    public void setArrLinInvestBusq(ArrayList<LineaInvestigacion> arrLinInvestBusq) {
        this.arrLinInvestBusq = arrLinInvestBusq;
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
    public void doIniciarLinInvestReg()
    {
        this.objLinInvestReg = new LineaInvestigacion();
    }
    
    public void doIniciarLinInvestList()
    {
        this.objLinInvestList = new LineaInvestigacion();
    }
    
    public void doIniciarLinInvestModif()
    {
        this.objLinInvestModif = new LineaInvestigacion();
    }
    
    public void doIniciarLinInvestElim()
    {
        this.objLinInvestElim = new LineaInvestigacion();
    }
    
    public void doIniciarLinInvestBusca()
    {
        this.objLinInvestBusca = new LineaInvestigacion();
    }
    
    public void doIniciarArrLinInvest()
    {
        this.arrLinInvest = new ArrayList<LineaInvestigacion>();
    }
    
    public void doIniciarArrLinInvestBusq()
    {
        this.arrLinInvestBusq = new ArrayList<LineaInvestigacion>();
    }
    
    public void doIniciarArrLinInvestCbo()
    {
        this.arrLinInvestCbo = new ArrayList<LineaInvestigacion>();
    }
    
    //--------------Constructor ----------------
    public BeanLineaInvestigacion() {
        try {
            doIniciarLinInvestReg();
            doIniciarLinInvestBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - LineaInvestigacion");
        }        
    }
    
    //----Combo por escuela
    public List<LineaInvestigacion> doListarComboLineaEscuela()
    {
        this.doIniciarArrLinInvestCbo();
        this.arrLinInvestCbo = LineaInvestigacion.getCargarComboLineaEscuela(this.objLinInvestBusca);
        return this.arrLinInvestCbo;
    }
    
    //----Combo de todas las lineas
    public List<LineaInvestigacion> doListarComboLinea()
    {
        this.doIniciarArrLinInvestCbo();
        this.arrLinInvestCbo = LineaInvestigacion.getCargarComboLinea();
        return this.arrLinInvestCbo;
    }
    
}
