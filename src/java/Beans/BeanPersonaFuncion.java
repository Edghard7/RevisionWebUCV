/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.PersonaFuncion;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanPersonaFuncion {
    private PersonaFuncion objPerFuncionReg;
    private PersonaFuncion objPerFuncionList;
    private PersonaFuncion objPerFuncionModif;
    private PersonaFuncion objPerFuncionElim;
    private PersonaFuncion objPerFuncionBusca;
    private ArrayList<PersonaFuncion> arrPerFuncion = null;
    private ArrayList<PersonaFuncion> arrPerFuncionBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    public PersonaFuncion getObjPerFuncionReg() {
        return objPerFuncionReg;
    }

    public void setObjPerFuncionReg(PersonaFuncion objPerFuncionReg) {
        this.objPerFuncionReg = objPerFuncionReg;
    }

    public PersonaFuncion getObjPerFuncionList() {
        return objPerFuncionList;
    }

    public void setObjPerFuncionList(PersonaFuncion objPerFuncionList) {
        this.objPerFuncionList = objPerFuncionList;
    }

    public PersonaFuncion getObjPerFuncionModif() {
        return objPerFuncionModif;
    }

    public void setObjPerFuncionModif(PersonaFuncion objPerFuncionModif) {
        this.objPerFuncionModif = objPerFuncionModif;
    }

    public PersonaFuncion getObjPerFuncionElim() {
        return objPerFuncionElim;
    }

    public void setObjPerFuncionElim(PersonaFuncion objPerFuncionElim) {
        this.objPerFuncionElim = objPerFuncionElim;
    }

    public PersonaFuncion getObjPerFuncionBusca() {
        return objPerFuncionBusca;
    }

    public void setObjPerFuncionBusca(PersonaFuncion objPerFuncionBusca) {
        this.objPerFuncionBusca = objPerFuncionBusca;
    }

    public ArrayList<PersonaFuncion> getArrPersonaFuncion() {
        return arrPerFuncion;
    }

    public void setArrPerFuncion(ArrayList<PersonaFuncion> arrPerFuncion) {
        this.arrPerFuncion = arrPerFuncion;
    }

    public ArrayList<PersonaFuncion> getArrPerFuncionBusq() {
        return arrPerFuncionBusq;
    }

    public void setArrPerFuncionBusq(ArrayList<PersonaFuncion> arrPerFuncionBusq) {
        this.arrPerFuncionBusq = arrPerFuncionBusq;
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
    public void doIniciarPerFuncionReg()
    {
        this.objPerFuncionReg = new PersonaFuncion();
    }
    
    public void doIniciarPerFuncionList()
    {
        this.objPerFuncionList = new PersonaFuncion();
    }
    
    public void doIniciarPerFuncionModif()
    {
        this.objPerFuncionModif = new PersonaFuncion();
    }
    
    public void doIniciarPerFuncionElim()
    {
        this.objPerFuncionElim = new PersonaFuncion();
    }
    
    public void doIniciarPerFuncionBusca()
    {
        this.objPerFuncionBusca = new PersonaFuncion();
    }
    
    public void doIniciarArrPersonaFuncion()
    {
        this.arrPerFuncion = new ArrayList<PersonaFuncion>();
    }
    
    public void doIniciarArrPerFuncionBusq()
    {
        this.arrPerFuncionBusq = new ArrayList<PersonaFuncion>();
    }
    
    //--------------Constructor ----------------
    public BeanPersonaFuncion() {
        try {
            doIniciarPerFuncionReg();
            doIniciarPerFuncionBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - PersonaFuncion");
        }        
    }
    
}
