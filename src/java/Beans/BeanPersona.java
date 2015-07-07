/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Funcion;
import Modelo.Persona;
import Modelo.PersonaFuncion;
import Utils.Constantes;
import Utils.Mensaje;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author 
 */
public class BeanPersona {
    private Persona objPersonaReg;
    private Persona objPersonaList;
    private Persona objPersonaModif;
    private Persona objPersonaElim;
    private Persona objPersonaBusca;
    private PersonaFuncion objPerFuncion;
    private Funcion objFuncion;
    private ArrayList<Persona> arrPersona = null;
    private ArrayList<PersonaFuncion> arrPersonaFuncion= null;
    private List<Persona> arrPersonaCbo = null;
    private List<Funcion> arrFucnionCbo = null;
    private ArrayList<Persona> arrPersonaBusq = null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    private boolean bandFormVer = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;
    
    //encapsulamiento SET / GET
    
    public PersonaFuncion getObjPerFuncion() {
        return objPerFuncion;
    }

    public void setObjPerFuncion(PersonaFuncion objPerFuncion) {
        this.objPerFuncion = objPerFuncion;
    }
    
    public Funcion getObjFuncion() {
        return objFuncion;
    }

    public void setObjFuncion(Funcion objFuncion) {
        this.objFuncion = objFuncion;
    }

    public List<Funcion> getArrFucnionCbo() {
        return arrFucnionCbo;
    }

    public void setArrFucnionCbo(List<Funcion> arrFucnionCbo) {
        this.arrFucnionCbo = arrFucnionCbo;
    }
    
    public ArrayList<PersonaFuncion> getArrPersonaFuncion() {
        return arrPersonaFuncion;
    }

    public void setArrPersonaFuncion(ArrayList<PersonaFuncion> arrPersonaFuncion) {
        this.arrPersonaFuncion = arrPersonaFuncion;
    }

    public boolean isBandFormVer() {
        return bandFormVer;
    }

    public void setBandFormVer(boolean bandFormVer) {
        this.bandFormVer = bandFormVer;
    }
    
    
    public List<Persona> getArrPersonaCbo() {
        return arrPersonaCbo;
    }

    public void setArrPersonaCbo(List<Persona> arrPersonaCbo) {
        this.arrPersonaCbo = arrPersonaCbo;
    }
    
    public Persona getObjPersonaReg() {
        return objPersonaReg;
    }

    public void setObjPersonaReg(Persona objPersonaReg) {
        this.objPersonaReg = objPersonaReg;
    }

    public Persona getObjPersonaList() {
        return objPersonaList;
    }

    public void setObjPersonaList(Persona objPersonaList) {
        this.objPersonaList = objPersonaList;
    }

    public Persona getObjPersonaModif() {
        return objPersonaModif;
    }

    public void setObjPersonaModif(Persona objPersonaModif) {
        this.objPersonaModif = objPersonaModif;
    }

    public Persona getObjPersonaElim() {
        return objPersonaElim;
    }

    public void setObjPersonaElim(Persona objPersonaElim) {
        this.objPersonaElim = objPersonaElim;
    }

    public Persona getObjPersonaBusca() {
        return objPersonaBusca;
    }

    public void setObjPersonaBusca(Persona objPersonaBusca) {
        this.objPersonaBusca = objPersonaBusca;
    }

    public ArrayList<Persona> getArrPersona() {
        return arrPersona;
    }

    public void setArrPersona(ArrayList<Persona> arrPersona) {
        this.arrPersona = arrPersona;
    }

    public ArrayList<Persona> getArrPersonaBusq() {
        return arrPersonaBusq;
    }

    public void setArrPersonaBusq(ArrayList<Persona> arrPersonaBusq) {
        this.arrPersonaBusq = arrPersonaBusq;
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
    public void doIniciarPersonaReg()
    {
        this.objPersonaReg = new Persona();
    }
    
    public void doIniciarPerFuncion()
    {
        this.objPerFuncion = new PersonaFuncion();
    }
    
    public void doIniciarObjFuncion()
    {
        this.objFuncion = new Funcion();
    }
    
    public void doIniciarPersonaList()
    {
        this.objPersonaList = new Persona();
    }
    
    public void doIniciarPersonaModif()
    {
        this.objPersonaModif = new Persona();
    }
    
    public void doIniciarPersonaElim()
    {
        this.objPersonaElim = new Persona();
    }
    
    public void doIniciarPersonaBusca()
    {
        this.objPersonaBusca = new Persona();
    }
    
    public void doIniciarArrPersona()
    {
        this.arrPersona = new ArrayList<Persona>();
    }
    
    public void doIniciarArrPersonaFuncion()
    {
        this.arrPersonaFuncion = new ArrayList<PersonaFuncion>();
    }
    
    public void doIniciarArrPersonaBusq()
    {
        this.arrPersonaBusq = new ArrayList<Persona>();
    }
    
    public void doIniciarArrPersonaCbo()
    {
        this.arrPersonaCbo = new ArrayList<Persona>();
    }
    
     public void doIniciarArrFuncionCbo()
    {
        this.arrFucnionCbo = new ArrayList<Funcion>();
    }
    
    //--------------Constructor ----------------
    public BeanPersona() {
        try {
            doIniciarPersonaReg();
            doIniciarPersonaBusca();
            doIniciarPerFuncion();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Persona");
        }        
    }
    
    //------------Combo de persona x tipo
    public List<Persona> doListarComboPersona(int tipo)
    {
        this.doIniciarArrPersonaCbo();
        Persona aux = new Persona();
        aux.getObjTipoPersona().setId_tipo_persona(tipo);
        this.arrPersonaCbo = Persona.getCargarComboPersona(aux);
        return this.arrPersonaCbo;
    }
    
    //------------Combo de persona x funcion
    public List<Persona> doListarComboPersonaFuncion(int funcion)
    {
        this.doIniciarArrPersonaCbo();
        Persona aux = new Persona();
        aux.getObjTipoPersona().setId_tipo_persona(funcion);
        this.arrPersonaCbo = Persona.getCargarComboPersonaFuncion(aux);
        return this.arrPersonaCbo;
    }
    
    //------------Combo de persona x funcion
    public List<Funcion> doListarComboFuncion()
    {
        this.doIniciarArrFuncionCbo();
        this.arrFucnionCbo = Funcion.getCargarComboFuncion();
        return this.arrFucnionCbo;
    }
    
    //------------Registrar una persona--------------------------------------------------------------- 
    public String doRegistroPersona(){
        try{
            this.objPersonaReg.setApellidos(this.objPersonaReg.getAp_pat().trim()+" "+this.objPersonaReg.getAp_mat().trim());
             if(Persona.registrarPersona(this.objPersonaReg)){
                  Mensaje.guardarMensajeExito("Registrar Persona", "Registrado Correctamente");  
                  this.doIniciarPersonaReg();
              }
             else{
                    Mensaje.manejarError("Registrar Persona", "Error de Registro");
                 }
        } catch (Exception e) {
            Mensaje.manejarError(e,"Registrar Persona");
        }
        return null;
    }
    
    //------------Registrar una funcion--------------------------------------------------------------- 
    public String doRegistroPersonaFuncion(){
        try{
             if(PersonaFuncion.registrarFuncion(objPerFuncion)){
                  Mensaje.guardarMensajeExito("Registrar Funcion", "Registrado Correctamente");  
                  doListarPersonaFuncion(objPerFuncion.getObjPersona().getId_persona());
                  //this.doIniciarPerFuncion();                  
              }
             else{
                    Mensaje.manejarError("Registrar Funcion", "Error de Registro");
                 }
        } catch (Exception e) {
            Mensaje.manejarError(e,"Registrar Funcion");
        }
        return null;
    }
    
    //----- listar los datos de la tesis
    public ArrayList<Persona> doListarPersona() {
        this.doIniciarArrPersona();
        // bandExportTab = false;
        this.arrPersona = Persona.getCargarPersona();
        return this.arrPersona;
    }
    
    //---- cantidad de registro que posee el array
    public String getSizeRegistrosPersona() {        
        if (this.arrPersona == null) {
            System.out.println("NADA de persona");
            return "0";
        } else {
            System.out.println("regs: "+arrPersona.size());
            return "" + this.arrPersona.size();
        }
    }  
    
    //------------ ver los detalles de la tesis
    public String mostrarFunciones(Persona per) {
        doIniciarPerFuncion();
        this.objPerFuncion.setObjPersona(per);
        doListarPersonaFuncion(per.getId_persona());
        this.bandVer = false;
        this.activeTabIndex = Constantes.TAB_VER; //tab 2
        //Hace Visible el Formulario para Mostrar Detalle 
        this.bandFormVer = true;
        return null;
    }
    
    //----- listar los datos de la tesis
    public ArrayList<PersonaFuncion> doListarPersonaFuncion(int persona) {
        this.doIniciarArrPersonaFuncion();
        // bandExportTab = false;
        this.arrPersonaFuncion = PersonaFuncion.getCargarPersonaFuncion(persona);
        return this.arrPersonaFuncion;
    }
    
    //---- cantidad de registro que posee el array
    public String getSizeRegistrosPersonaFuncion() {        
        if (this.arrPersonaFuncion == null) {
            System.out.println("NADA de persona funcion");
            return "0";
        } else {
            System.out.println("regs: "+arrPersonaFuncion.size());
            return "" + this.arrPersonaFuncion.size();
        }
    }  
    
     //---------desactivar el tab de detalle
    public String desactivaTabVer() {
        this.bandVer = true;
        doListarPersona();
        //Pregunta si la Detalle Mostrada Proviene listado total:1 
        if (puntAnt.compareTo("1") == 0) {
            this.activeTabIndex = Constantes.TAB_LISTAR;
        }
        return null;
    }
    
    //------------cambio de tabs
    public void onClickCambio(javax.faces.event.ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();// 1 -> proviene de tab_Listar
        System.out.println("P_anterior: "+this.puntAnt);
    }
    
    
    //--------Editar observaciones
    
    public void onEdit(RowEditEvent event) { 
        this.doIniciarPersonaModif();
        final Persona per=(Persona) event.getObject();     
        this.objPersonaModif = per; 
        System.out.println("RowEdit: "+this.objPersonaModif.getId_persona()+"-"+this.objPersonaModif.getObjTipoPersona().getId_tipo_persona());
        Persona.getActualizarPersona(this.objPersonaModif);
        doListarPersona();
    }  
    
    public void onCancel(RowEditEvent event) {  
        doListarPersona();
    }
    
    //------fin edicion
    
    
    public void onEditFuncion(RowEditEvent event) { 
        this.doIniciarPerFuncion();
        final PersonaFuncion per=(PersonaFuncion) event.getObject();     
        this.objPerFuncion = per; 
        System.out.println("RowCancel: "+this.objPerFuncion.getId_persona_funcion());
        PersonaFuncion.actualizarFuncion(objPerFuncion);
        doListarPersonaFuncion(objPerFuncion.getObjPersona().getId_persona());
    }  
    
    public void onCancelFuncion(RowEditEvent event) {  
        
    }
}
