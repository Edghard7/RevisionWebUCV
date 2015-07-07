/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Revision;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanRevision {
    private Revision objRevisionReg;
    private Revision objRevisionList;
    private Revision objRevisionModif;
    private Revision objRevisionElim;
    private Revision objRevisionBusca;
    private ArrayList<Revision> arrRevision = null;
    private ArrayList<Revision> arrRevisionBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    public Revision getObjRevisionReg() {
        return objRevisionReg;
    }

    public void setObjRevisionReg(Revision objRevisionReg) {
        this.objRevisionReg = objRevisionReg;
    }

    public Revision getObjRevisionList() {
        return objRevisionList;
    }

    public void setObjRevisionList(Revision objRevisionList) {
        this.objRevisionList = objRevisionList;
    }

    public Revision getObjRevisionModif() {
        return objRevisionModif;
    }

    public void setObjRevisionModif(Revision objRevisionModif) {
        this.objRevisionModif = objRevisionModif;
    }

    public Revision getObjRevisionElim() {
        return objRevisionElim;
    }

    public void setObjRevisionElim(Revision objRevisionElim) {
        this.objRevisionElim = objRevisionElim;
    }

    public Revision getObjRevisionBusca() {
        return objRevisionBusca;
    }

    public void setObjRevisionBusca(Revision objRevisionBusca) {
        this.objRevisionBusca = objRevisionBusca;
    }

    public ArrayList<Revision> getArrRevision() {
        return arrRevision;
    }

    public void setArrRevision(ArrayList<Revision> arrRevision) {
        this.arrRevision = arrRevision;
    }

    public ArrayList<Revision> getArrRevisionBusq() {
        return arrRevisionBusq;
    }

    public void setArrRevisionBusq(ArrayList<Revision> arrRevisionBusq) {
        this.arrRevisionBusq = arrRevisionBusq;
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
    public void doIniciarRevisionReg()
    {
        this.objRevisionReg = new Revision();
    }
    
    public void doIniciarRevisionList()
    {
        this.objRevisionList = new Revision();
    }
    
    public void doIniciarRevisionModif()
    {
        this.objRevisionModif = new Revision();
    }
    
    public void doIniciarRevisionElim()
    {
        this.objRevisionElim = new Revision();
    }
    
    public void doIniciarRevisionBusca()
    {
        this.objRevisionBusca = new Revision();
    }
    
    public void doIniciarArrRevision()
    {
        this.arrRevision = new ArrayList<Revision>();
    }
    
    public void doIniciarArrRevisionBusq()
    {
        this.arrRevisionBusq = new ArrayList<Revision>();
    }
    
    //--------------Constructor ----------------
    public BeanRevision() {
        try {
            doIniciarRevisionReg();
            doIniciarRevisionBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Revision");
        }        
    }
    
    
    
}
