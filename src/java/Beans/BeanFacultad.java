/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Facultad;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanFacultad {
    private Facultad objFacultadReg;
    private Facultad objFacultadList;
    private Facultad objFacultadModif;
    private Facultad objFacultadElim;
    private Facultad objFacultadBusca;
    private ArrayList<Facultad> arrFacultad = null;
    private ArrayList<Facultad> arrFacultadBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public Facultad getObjFacultadReg() {
        return objFacultadReg;
    }

    public void setObjFacultadReg(Facultad objFacultadReg) {
        this.objFacultadReg = objFacultadReg;
    }

    public Facultad getObjFacultadList() {
        return objFacultadList;
    }

    public void setObjFacultadList(Facultad objFacultadList) {
        this.objFacultadList = objFacultadList;
    }

    public Facultad getObjFacultadModif() {
        return objFacultadModif;
    }

    public void setObjFacultadModif(Facultad objFacultadModif) {
        this.objFacultadModif = objFacultadModif;
    }

    public Facultad getObjFacultadElim() {
        return objFacultadElim;
    }

    public void setObjFacultadElim(Facultad objFacultadElim) {
        this.objFacultadElim = objFacultadElim;
    }

    public Facultad getObjFacultadBusca() {
        return objFacultadBusca;
    }

    public void setObjFacultadBusca(Facultad objFacultadBusca) {
        this.objFacultadBusca = objFacultadBusca;
    }

    public ArrayList<Facultad> getArrFacultad() {
        return arrFacultad;
    }

    public void setArrFacultad(ArrayList<Facultad> arrFacultad) {
        this.arrFacultad = arrFacultad;
    }

    public ArrayList<Facultad> getArrFacultadBusq() {
        return arrFacultadBusq;
    }

    public void setArrFacultadBusq(ArrayList<Facultad> arrFacultadBusq) {
        this.arrFacultadBusq = arrFacultadBusq;
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
    public void doIniciarFacultadReg()
    {
        this.objFacultadReg = new Facultad();
    }
    
    public void doIniciarFacultadList()
    {
        this.objFacultadList = new Facultad();
    }
    
    public void doIniciarFacultadModif()
    {
        this.objFacultadModif = new Facultad();
    }
    
    public void doIniciarFacultadElim()
    {
        this.objFacultadElim = new Facultad();
    }
    
    public void doIniciarFacultadBusca()
    {
        this.objFacultadBusca = new Facultad();
    }
    
    public void doIniciarArrFacultad()
    {
        this.arrFacultad = new ArrayList<Facultad>();
    }
    
    public void doIniciarArrFacultadBusq()
    {
        this.arrFacultadBusq = new ArrayList<Facultad>();
    }
    
    //--------------Constructor ----------------
    public BeanFacultad() {
        try {
            doIniciarFacultadReg();
            doIniciarFacultadBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Facultad");
        }        
    }
    
    
}
