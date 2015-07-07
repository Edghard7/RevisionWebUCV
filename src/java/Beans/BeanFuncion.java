/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Funcion;
import Utils.Mensaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class BeanFuncion {
    private Funcion objFuncionReg;
    private Funcion objFuncionList;
    private Funcion objFuncionModif;
    private Funcion objFuncionElim;
    private Funcion objFuncionBusca;
    private ArrayList<Funcion> arrFuncion = null;
    private ArrayList<Funcion> arrFuncionBusq = null;
    private List<Funcion> arrFuncionCbo = new ArrayList<Funcion>();
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    public Funcion getObjFuncionReg() {
        return objFuncionReg;
    }

    public List<Funcion> getArrFuncionCbo() {
        return arrFuncionCbo;
    }

    public void setArrFuncionCbo(List<Funcion> arrFuncionCbo) {
        this.arrFuncionCbo = arrFuncionCbo;
    }

    public void setObjFuncionReg(Funcion objFuncionReg) {
        this.objFuncionReg = objFuncionReg;
    }

    public Funcion getObjFuncionList() {
        return objFuncionList;
    }

    public void setObjFuncionList(Funcion objFuncionList) {
        this.objFuncionList = objFuncionList;
    }

    public Funcion getObjFuncionModif() {
        return objFuncionModif;
    }

    public void setObjFuncionModif(Funcion objFuncionModif) {
        this.objFuncionModif = objFuncionModif;
    }

    public Funcion getObjFuncionElim() {
        return objFuncionElim;
    }

    public void setObjFuncionElim(Funcion objFuncionElim) {
        this.objFuncionElim = objFuncionElim;
    }

    public Funcion getObjFuncionBusca() {
        return objFuncionBusca;
    }

    public void setObjFuncionBusca(Funcion objFuncionBusca) {
        this.objFuncionBusca = objFuncionBusca;
    }

    public ArrayList<Funcion> getArrFuncion() {
        return arrFuncion;
    }

    public void setArrFuncion(ArrayList<Funcion> arrFuncion) {
        this.arrFuncion = arrFuncion;
    }

    public ArrayList<Funcion> getArrFuncionBusq() {
        return arrFuncionBusq;
    }

    public void setArrFuncionBusq(ArrayList<Funcion> arrFuncionBusq) {
        this.arrFuncionBusq = arrFuncionBusq;
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
    public void doIniciarFuncionReg()
    {
        this.objFuncionReg = new Funcion();
    }
    
    public void doIniciarFuncionList()
    {
        this.objFuncionList = new Funcion();
    }
    
    public void doIniciarFuncionModif()
    {
        this.objFuncionModif = new Funcion();
    }
    
    public void doIniciarFuncionElim()
    {
        this.objFuncionElim = new Funcion();
    }
    
    public void doIniciarFuncionBusca()
    {
        this.objFuncionBusca = new Funcion();
    }
    
    public void doIniciarArrFuncion()
    {
        this.arrFuncion = new ArrayList<Funcion>();
    }
    
    public void doIniciarArrFuncionBusq()
    {
        this.arrFuncionBusq = new ArrayList<Funcion>();
    }
    
    //--------------Constructor ----------------
    public BeanFuncion() {
        try {
            doIniciarFuncionReg();
            doIniciarFuncionBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Funcion");
        }        
    }
    
     public List<Funcion> doListarComboFuncion()
    {
        this.arrFuncionCbo = Funcion.getCargarComboFuncion();
        return this.arrFuncionCbo;
    }
    
}
