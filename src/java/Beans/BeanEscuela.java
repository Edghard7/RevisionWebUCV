/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Escuela;
import Utils.Mensaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class BeanEscuela {
    private Escuela objEscuelaReg;
    private Escuela objEscuelaList;
    private Escuela objEscuelaModif;
    private Escuela objEscuelaElim;
    private Escuela objEscuelaBusca;
    private ArrayList<Escuela> arrEscuela = null;
    private List<Escuela> arrEscuelaCbo = null;
    private ArrayList<Escuela> arrEscuelaBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public List<Escuela> getArrEscuelaCbo() {
        return arrEscuelaCbo;
    }

    public void setArrEscuelaCbo(List<Escuela> arrEscuelaCbo) {
        this.arrEscuelaCbo = arrEscuelaCbo;
    }
    
    public Escuela getObjEscuelaReg() {
        return objEscuelaReg;
    }

    public void setObjEscuelaReg(Escuela objEscuelaReg) {
        this.objEscuelaReg = objEscuelaReg;
    }

    public Escuela getObjEscuelaList() {
        return objEscuelaList;
    }

    public void setObjEscuelaList(Escuela objEscuelaList) {
        this.objEscuelaList = objEscuelaList;
    }

    public Escuela getObjEscuelaModif() {
        return objEscuelaModif;
    }

    public void setObjEscuelaModif(Escuela objEscuelaModif) {
        this.objEscuelaModif = objEscuelaModif;
    }

    public Escuela getObjEscuelaElim() {
        return objEscuelaElim;
    }

    public void setObjEscuelaElim(Escuela objEscuelaElim) {
        this.objEscuelaElim = objEscuelaElim;
    }

    public Escuela getObjEscuelaBusca() {
        return objEscuelaBusca;
    }

    public void setObjEscuelaBusca(Escuela objEscuelaBusca) {
        this.objEscuelaBusca = objEscuelaBusca;
    }

    public ArrayList<Escuela> getArrEscuela() {
        return arrEscuela;
    }

    public void setArrEscuela(ArrayList<Escuela> arrEscuela) {
        this.arrEscuela = arrEscuela;
    }

    public ArrayList<Escuela> getArrEscuelaBusq() {
        return arrEscuelaBusq;
    }

    public void setArrEscuelaBusq(ArrayList<Escuela> arrEscuelaBusq) {
        this.arrEscuelaBusq = arrEscuelaBusq;
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
    public void doIniciarEscuelaReg()
    {
        this.objEscuelaReg = new Escuela();
    }
    
    public void doIniciarEscuelaList()
    {
        this.objEscuelaList = new Escuela();
    }
    
    public void doIniciarEscuelaModif()
    {
        this.objEscuelaModif = new Escuela();
    }
    
    public void doIniciarEscuelaElim()
    {
        this.objEscuelaElim = new Escuela();
    }
    
    public void doIniciarEscuelaBusca()
    {
        this.objEscuelaBusca = new Escuela();
    }
    
    public void doIniciarArrEscuela()
    {
        this.arrEscuela = new ArrayList<Escuela>();
    }
    
    public void doIniciarArrEscuelaBusq()
    {
        this.arrEscuelaBusq = new ArrayList<Escuela>();
    }
    
    public void doIniciarArrEscuelaCbo()
    {
        this.arrEscuelaCbo = new ArrayList<Escuela>();
    }
    
    //--------------Constructor ----------------
    public BeanEscuela() {
        try {
            doIniciarEscuelaReg();
            doIniciarEscuelaBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Escuela");
        }        
    }
    
    public List<Escuela> doListarComboEscuela()
    {
        this.doIniciarArrEscuelaCbo();
        this.arrEscuelaCbo = Escuela.getCargarComboEscuela();
        return this.arrEscuelaCbo;
    }
    
    public List<Escuela> doListarComboEscuelaFacultad()
    {
        this.doIniciarArrEscuelaCbo();
        this.arrEscuelaCbo = Escuela.getCargarComboEscuelaFacultad(this.objEscuelaBusca);
        return this.arrEscuelaCbo;
    }
    
}
