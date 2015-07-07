/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.DetalleEsquema;
import Utils.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BeanDetalleEsquema {
    private DetalleEsquema objDetEsquemaReg;
    private DetalleEsquema objDetEsquemaList;
    private DetalleEsquema objDetEsquemaModif;
    private DetalleEsquema objDetEsquemaElim;
    private DetalleEsquema objDetEsquemaBusca;
    private ArrayList<DetalleEsquema> arrDetEsquema = null;
    private ArrayList<DetalleEsquema> arrDetEsquemaBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    public DetalleEsquema getObjDetEsquemaReg() {
        return objDetEsquemaReg;
    }

    public void setObjDetEsquemaReg(DetalleEsquema objDetEsquemaReg) {
        this.objDetEsquemaReg = objDetEsquemaReg;
    }

    public DetalleEsquema getObjDetEsquemaList() {
        return objDetEsquemaList;
    }

    public void setObjDetEsquemaList(DetalleEsquema objDetEsquemaList) {
        this.objDetEsquemaList = objDetEsquemaList;
    }

    public DetalleEsquema getObjDetEsquemaModif() {
        return objDetEsquemaModif;
    }

    public void setObjDetEsquemaModif(DetalleEsquema objDetEsquemaModif) {
        this.objDetEsquemaModif = objDetEsquemaModif;
    }

    public DetalleEsquema getObjDetEsquemaElim() {
        return objDetEsquemaElim;
    }

    public void setObjDetEsquemaElim(DetalleEsquema objDetEsquemaElim) {
        this.objDetEsquemaElim = objDetEsquemaElim;
    }

    public DetalleEsquema getObjDetEsquemaBusca() {
        return objDetEsquemaBusca;
    }

    public void setObjDetEsquemaBusca(DetalleEsquema objDetEsquemaBusca) {
        this.objDetEsquemaBusca = objDetEsquemaBusca;
    }

    public ArrayList<DetalleEsquema> getArrDetEsquema() {
        return arrDetEsquema;
    }

    public void setArrDetEsquema(ArrayList<DetalleEsquema> arrDetEsquema) {
        this.arrDetEsquema = arrDetEsquema;
    }

    public ArrayList<DetalleEsquema> getArrDetEsquemaBusq() {
        return arrDetEsquemaBusq;
    }

    public void setArrDetEsquemaBusq(ArrayList<DetalleEsquema> arrDetEsquemaBusq) {
        this.arrDetEsquemaBusq = arrDetEsquemaBusq;
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
    public void doIniciarDetEsquemaReg()
    {
        this.objDetEsquemaReg = new DetalleEsquema();
    }
    
    public void doIniciarDetEsquemaList()
    {
        this.objDetEsquemaList = new DetalleEsquema();
    }
    
    public void doIniciarDetEsquemaModif()
    {
        this.objDetEsquemaModif = new DetalleEsquema();
    }
    
    public void doIniciarDetEsquemaElim()
    {
        this.objDetEsquemaElim = new DetalleEsquema();
    }
    
    public void doIniciarDetEsquemaBusca()
    {
        this.objDetEsquemaBusca = new DetalleEsquema();
    }
    
    public void doIniciarArrDetEsquema()
    {
        this.arrDetEsquema = new ArrayList<DetalleEsquema>();
    }
    
    public void doIniciarArrDetEsquemaBusq()
    {
        this.arrDetEsquemaBusq = new ArrayList<DetalleEsquema>();
    }
    
    //--------------Constructor ----------------
    public BeanDetalleEsquema() {
        try {
            doIniciarDetEsquemaReg();
            doIniciarDetEsquemaBusca();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - DetalleEsquema");
        }        
    }
    
    public ArrayList<DetalleEsquema> doListarDetalleEsquema(int esquema)
    {
        this.doIniciarArrDetEsquema();
        this.arrDetEsquema = DetalleEsquema.getCargarDetalleEsquemaTesis(esquema);
        return this.arrDetEsquema;
    }
    
    //---- cantidad de registro que posee el array de detalle
    public String getSizeRegistrosDetalle() {        
        if (this.arrDetEsquema == null) {
            System.out.println("NADA de detalles");
            return "0";
        } else {
            System.out.println("regs: "+arrDetEsquema.size());
            return "" + this.arrDetEsquema.size();
        }
    }
    
}
