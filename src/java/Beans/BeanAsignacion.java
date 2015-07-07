/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.Asignacion;
import Modelo.DetalleEsquema;
import Modelo.Observacion;
import Modelo.Revision;
import Modelo.TesisRecepcion;
import Utils.Constantes;
import Utils.Mensaje;
import java.util.ArrayList;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author 
 */
public class BeanAsignacion {
    private Asignacion objAsignacionReg;
    private Asignacion objAsignacionList;
    private Asignacion objAsignacionModif;
    private Asignacion objAsignacionElim;
    private Asignacion objAsignacionBusca;
    private Asignacion selectAsignacion;
    private TesisRecepcion selectTesisRecep;
    private TesisRecepcion objTesisRecepDetalle;
    private TesisRecepcion objTesisRecep_aux;
    private Revision objRevision;
    private Observacion objObservacion;
    private Observacion objObservacion_edit;
    private ArrayList<Asignacion> arrAsignacion = null;
    private ArrayList<Asignacion> arrAsignacion_aux = null;
    private ArrayList<TesisRecepcion> arrTesisRecepcion = null;
    private ArrayList<Asignacion> arrAsignacionBusq = null;
    
    private ArrayList<DetalleEsquema> arrDetEsquema = null;
    
    private ArrayList<Observacion> arrObservacion = null;
    
    private int esquema, asignacion;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;    
    private boolean bandMod = true;
    private boolean bandEli = true;
    private boolean bandFormVer = true;
    private boolean bandFormObs = true;
    
    //Bandera que apunta donde el usuario ha realizado un click
    private String puntAnt;

    public Observacion getObjObservacion_edit() {
        return objObservacion_edit;
    }

    public void setObjObservacion_edit(Observacion objObservacion_edit) {
        this.objObservacion_edit = objObservacion_edit;
    }

    
    public int getEsquema() {
        return esquema;
    }

    public boolean isBandFormObs() {
        return bandFormObs;
    }

    public void setBandFormObs(boolean bandFormObs) {
        this.bandFormObs = bandFormObs;
    }

    public void setEsquema(int esquema) {
        this.esquema = esquema;
    }

    public int getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(int asignacion) {
        this.asignacion = asignacion;
    }

    public ArrayList<Asignacion> getArrAsignacion_aux() {
        return arrAsignacion_aux;
    }

    public void setArrAsignacion_aux(ArrayList<Asignacion> arrAsignacion_aux) {
        this.arrAsignacion_aux = arrAsignacion_aux;
    }

    
    public Observacion getObjObservacion() {
        return objObservacion;
    }

    public void setObjObservacion(Observacion objObservacion) {
        this.objObservacion = objObservacion;
    }

    public ArrayList<Observacion> getArrObservacion() {
        return arrObservacion;
    }

    public void setArrObservacion(ArrayList<Observacion> arrObservacion) {
        this.arrObservacion = arrObservacion;
    }
    
    
    //encapsulamiento SET / GET
    public ArrayList<DetalleEsquema> getArrDetEsquema() {
        return arrDetEsquema;
    }

    public void setArrDetEsquema(ArrayList<DetalleEsquema> arrDetEsquema) {
        this.arrDetEsquema = arrDetEsquema;
    }
    
    
    public Revision getObjRevision() {
        return objRevision;
    }

    public void setObjRevision(Revision objRevision) {
        this.objRevision = objRevision;
    }
    
    public TesisRecepcion getSelectTesisRecep() {
        return selectTesisRecep;
    }

    public void setSelectTesisRecep(TesisRecepcion selectTesisRecep) {
        this.selectTesisRecep = selectTesisRecep;
    }
    
    public Asignacion getSelectAsignacion() {
        return selectAsignacion;
    }

    public void setSelectAsignacion(Asignacion selectAsignacion) {
        this.selectAsignacion = selectAsignacion;
    }
    
    public TesisRecepcion getObjTesisRecep_aux() {
        return objTesisRecep_aux;
    }

    public void setObjTesisRecep_aux(TesisRecepcion objTesisRecep_aux) {
        this.objTesisRecep_aux = objTesisRecep_aux;
    }
    
    
    public boolean isBandFormVer() {
        return bandFormVer;
    }

    public void setBandFormVer(boolean bandFormVer) {
        this.bandFormVer = bandFormVer;
    }
    
    public TesisRecepcion getObjTesisRecepDetalle() {
        return objTesisRecepDetalle;
    }

    public void setObjTesisRecepDetalle(TesisRecepcion objTesisRecepDetalle) {
        this.objTesisRecepDetalle = objTesisRecepDetalle;
    }
    
    public ArrayList<TesisRecepcion> getArrTesisRecepcion() {
        return arrTesisRecepcion;
    }

    public void setArrTesisRecepcion(ArrayList<TesisRecepcion> arrTesisRecepcion) {
        this.arrTesisRecepcion = arrTesisRecepcion;
    }
    
    public Asignacion getObjAsignacionReg() {
        return objAsignacionReg;
    }

    public void setObjAsignacionReg(Asignacion objAsignacionReg) {
        this.objAsignacionReg = objAsignacionReg;
    }

    public Asignacion getObjAsignacionList() {
        return objAsignacionList;
    }

    public void setObjAsignacionList(Asignacion objAsignacionList) {
        this.objAsignacionList = objAsignacionList;
    }

    public Asignacion getObjAsignacionModif() {
        return objAsignacionModif;
    }

    public void setObjAsignacionModif(Asignacion objAsignacionModif) {
        this.objAsignacionModif = objAsignacionModif;
    }

    public Asignacion getObjAsignacionElim() {
        return objAsignacionElim;
    }

    public void setObjAsignacionElim(Asignacion objAsignacionElim) {
        this.objAsignacionElim = objAsignacionElim;
    }

    public Asignacion getObjAsignacionBusca() {
        return objAsignacionBusca;
    }

    public void setObjAsignacionBusca(Asignacion objAsignacionBusca) {
        this.objAsignacionBusca = objAsignacionBusca;
    }

    public ArrayList<Asignacion> getArrAsignacion() {
        return arrAsignacion;
    }

    public void setArrAsignacion(ArrayList<Asignacion> arrAsignacion) {
        this.arrAsignacion = arrAsignacion;
    }

    public ArrayList<Asignacion> getArrAsignacionBusq() {
        return arrAsignacionBusq;
    }

    public void setArrAsignacionBusq(ArrayList<Asignacion> arrAsignacionBusq) {
        this.arrAsignacionBusq = arrAsignacionBusq;
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
    public void doIniciarObservacion_edit()
    {
        this.objObservacion_edit = new Observacion();
    }
    
    public void doIniciarAsignacionReg()
    {
        this.objAsignacionReg = new Asignacion();
    }
    
    public void doIniciarAsignacionList()
    {
        this.objAsignacionList = new Asignacion();
    }
    
    public void doIniciarAsignacionModif()
    {
        this.objAsignacionModif = new Asignacion();
    }
    
    public void doIniciarAsignacionElim()
    {
        this.objAsignacionElim = new Asignacion();
    }
    
    public void doIniciarAsignacionBusca()
    {
        this.objAsignacionBusca = new Asignacion();
    }
    
    public void doIniciarRevision()
    {
        this.objRevision= new Revision();
    }
    
    public void doIniciarObservacion()
    {
        this.objObservacion= new Observacion();
    }
    
    public void doIniciarArrAsignacion()
    {
        this.arrAsignacion = new ArrayList<Asignacion>();
    }
    
    public void doIniciarArrAsignacion_aux()
    {
        this.arrAsignacion_aux = new ArrayList<Asignacion>();
    }
    
    public void doIniciarArrAsignacionBusq()
    {
        this.arrAsignacionBusq = new ArrayList<Asignacion>();
    }
    
    public void doIniciarArrTesisRecepcion()
    {
        this.arrTesisRecepcion = new ArrayList<TesisRecepcion>();
    }
    
    
    public void doIniciarArrDetEsquema()
    {
        this.arrDetEsquema = new ArrayList<DetalleEsquema>();
    }
    
    
    public void doIniciarArrObservacion()
    {
        this.arrObservacion = new ArrayList<Observacion>();
    }
    
    //--------------Constructor ----------------
    public BeanAsignacion() {
        try {
            doIniciarAsignacionReg();
            doIniciarAsignacionBusca();
            //doIniciarRevision();
        } catch (Exception e) {
            Mensaje.manejarError(e,"Error al Iniciar Proceso - Asignacion");
        }        
    }
    
    //----- listar los datos de la tesis
    public ArrayList<TesisRecepcion> doListarTesis() {
        this.doIniciarArrTesisRecepcion();
        // bandExportTab = false;
        this.arrTesisRecepcion = TesisRecepcion.getCargarTesis_sin_Asignar();
        return this.arrTesisRecepcion;
    }
       
    //---- cantidad de registro que posee el array
    public String getSizeRegistrosTesis() {        
        if (this.arrTesisRecepcion == null) {
            System.out.println("NADA de tesis");
            return "0";
        } else {
            System.out.println("regs: "+arrTesisRecepcion.size());
            return "" + this.arrTesisRecepcion.size();
        }
    }
    
    //----- listar todas las asignaciones para el usuario actual
    public ArrayList<Asignacion> doListarAsiganaciones() {
        this.doIniciarArrAsignacion();
        FacesContext contex = FacesContext.getCurrentInstance();
        this.arrAsignacion = Asignacion.getCargarAsignaciones(Integer.parseInt(contex.getExternalContext().getSessionMap().get("id_persona").toString()));
        return this.arrAsignacion;
    }
    
    //---- cantidad de registro que posee el array de asignaciones
    public String getSizeRegistrosAsignaciones() {        
        if (this.arrAsignacion == null) {
            System.out.println("NADA de tesis");
            return "0";
        } else {
            System.out.println("regs: "+arrAsignacion.size());
            return "" + this.arrAsignacion.size();
        }
    }
    
    //----- listar todas las tesis disponibles para finalizar
    public ArrayList<Asignacion> doListarFinalizacion() {
        this.doIniciarArrAsignacion();        
        this.arrAsignacion = Asignacion.getCargarTesisFinalizadas();
        return this.arrAsignacion;
    }
    
    //---- cantidad de registro que posee el array de asignaciones
    public String getSizeRegistrosFinalizacion() {        
        if (this.arrAsignacion == null) {
            System.out.println("NADA de tesis FIN");
            return "0";
        } else {
            System.out.println("regs: "+arrAsignacion.size());
            return "" + this.arrAsignacion.size();
        }
    }
    
    //------------todas las asignaciones
    //----- listar todas las asignaciones para el usuario actual
    public ArrayList<Asignacion> doListarAsiganaciones_all() {
        this.doIniciarArrAsignacion_aux();        
        this.arrAsignacion_aux = Asignacion.getCargarAsignaciones_all();
        return this.arrAsignacion_aux;
    }
    
    //---- cantidad de registro que posee el array
    public String getSizeRegistrosAsig_aux() {        
        if (this.arrAsignacion_aux == null) {
            System.out.println("NADA de Asigna");
            return "0";
        } else {
            System.out.println("regs: "+arrAsignacion_aux.size());
            return "" + this.arrAsignacion_aux.size();
        }
    }    
    
    //----pasar el id de la recepcion de tesis    
    public String pasarTesis(TesisRecepcion tr) {        
        this.objTesisRecep_aux = tr;
        System.out.println("PasarTesis: "+this.objTesisRecep_aux.getObjTesis().getTitulo());
        return null;
    }
    
    //_----------------------------Registrar la asignacion    
    public String doRegistroAsignacion(){
        
        System.out.println("Trecepcion: "+this.selectTesisRecep.getId_tesis_recepcion());
        System.out.println("Asignacion: "+this.objAsignacionReg.getObjTesisRecpcion().getId_tesis_recepcion());
        System.out.println("Revisor: "+this.objAsignacionReg.getObjRevisor().getId_persona());
        // se pasa el atributo id_recepcion del objeto seleccionado al objeto de registro
        this.objAsignacionReg.getObjTesisRecpcion().setId_tesis_recepcion(this.selectTesisRecep.getId_tesis_recepcion());
        try{
             if(Asignacion.registrarAsignacion(this.objAsignacionReg)){
                 // se vuelve a ejecutar el metodo de listado de tesis sin asignar, para actualizar la tabla
                 doListarTesis();
                  Mensaje.guardarMensajeExito("Registrar Asignación", "Registrado Correctamente");  
                  this.doIniciarAsignacionReg();
              }
             else{
                    Mensaje.manejarError("Registrar Asignación", "Error de Registro");
                 }
        } catch (Exception e) {
            Mensaje.manejarError(e,"Registrar Asignación");
        }
        return null;
    }
    
    //apertura de una revision
    public String doRegistroRevision()
    {
        try {
            System.out.println("doReg: "+this.objRevision.getObjAsignacion().getId_asignacion());
            if(Revision.registrarRevision(this.objRevision)){                 
                  Mensaje.guardarMensajeExito("Registrar Revisión", "Registrado Correctamente");                    
              }
             else{
                    Mensaje.manejarError("Registrar Revisión", "Error de Registro");
                 }
        } catch (Exception e) {
        }
        return null;
    }
    
    //cierre de una revision
    public String doRegistroRevision_fin()
    {
        try {
            System.out.println("doReg: "+this.objRevision.getObjAsignacion().getId_asignacion());
            if(Revision.registrarRevision_cierre(this.objRevision)){                 
                  Mensaje.guardarMensajeExito("Registrar Revisión", "Registrado Correctamente");                    
                  doListarAsiganaciones();
              }
             else{
                    Mensaje.manejarError("Registrar Revisión", "Error de Registro");
                 }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    //Registro de la observación
    public String doRegistroObservacion()
    {
        try {
            
            this.objObservacion.getObjRevision().getObjAsignacion().setId_asignacion(this.asignacion);
            
            System.out.println("doReg: "+this.objObservacion.getObservacion());
            System.out.println("doReg det: "+this.objObservacion.getObjDetalleEsquema().getId_detalle());
            System.out.println("doReg asig: "+this.objObservacion.getObjRevision().getObjAsignacion().getId_asignacion());
            if(Observacion.registrarObservacion(objObservacion)){                 
                  Mensaje.guardarMensajeExito("Registrar Observación", "Registrado Correctamente");                    
                  this.doIniciarObservacion();
              }
             else{
                    Mensaje.manejarError("Registrar Observación", "Error de Registro");
                 }
        } catch (Exception e) {
        }
        return null;
    }
    
    //cierre definitivo de la revision:: por parte del jefe de investigacion
    public String doFinRevisionTesis()
    {
        try {
            System.out.println("doReg: "+this.objRevision.getObjAsignacion().getId_asignacion());
            if(Revision.registrarFinRevision(this.objRevision)){                 
                  Mensaje.guardarMensajeExito("Fin de Revisión", "Finalizado Correctamente");                    
                  doListarFinalizacion();
              }
             else{
                    Mensaje.manejarError("Fin de Revisión", "Error al Finalizar");
                 }
        } catch (Exception e) {
            System.err.println("Error Por: "+e.getMessage());
        }
        return null;
    }
    
    
    //--------------- Inicio
    public String pasoDatos(Asignacion asig) {
        this.doIniciarRevision();
        this.objRevision.setObjAsignacion(asig);          
        this.doRegistroRevision();
        doListarAsiganaciones(); // inicio de la revision
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getId_asignacion());
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getObjTesisRecpcion().getObjTesis().getTitulo());
        return null;
    }
    
    // finalizar
    public String pasoDatos_fin(Asignacion asig) {
        this.doIniciarRevision();
        this.objRevision.setObjAsignacion(asig);          
        doListarAsiganaciones();
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getId_asignacion());
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getObjTesisRecpcion().getObjTesis().getTitulo());
        return null;
    }
    
    // finalizar FIN revision
    public String pasoDatos_fin_rev(Asignacion asig) {
        this.doIniciarRevision();
        this.objRevision.setObjAsignacion(asig);          
        doListarFinalizacion();
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getId_asignacion());
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getObjTesisRecpcion().getObjTesis().getTitulo());
        return null;
    }
    
    // para registrar observaciones
    public String pasoDatos_observacion(DetalleEsquema det) {
        this.doIniciarRevision();
        this.doIniciarObservacion();
        // this.objRevision.setObjAsignacion(asig);          
        // doListarAsiganaciones();
        this.objObservacion.setObjDetalleEsquema(det);
        System.out.println("revision inicio: "+this.objObservacion.getObjDetalleEsquema().getNombre());        
        return null;
    }
    
    // ver detalle
    public String mostrarRevision(Asignacion asig) {
        this.doIniciarRevision();
        this.objRevision.setObjAsignacion(asig);        
        this.bandVer = false;
        this.bandFormVer = true;
        this.bandFormObs =  true;
        this.activeTabIndex = Constantes.TAB_VER_REV;
        
        //--------------ejecuta metodo de carga del detalle del esquema (parametro id_esquema)
        this.doListarDetalleEsquema(asig.getObjTesisRecpcion().getObjTesis().getObjEsquema().getId_esquema());
        
        //--------------ejecuta metodo de carga para las observaciones ya registradas
        this.doListarObservaciones(
                asig.getObjTesisRecpcion().getObjTesis().getObjEsquema().getId_esquema(), 
                asig.getId_asignacion()
        );
        
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getId_asignacion());
        System.out.println("revision inicio: "+this.objRevision.getObjAsignacion().getObjTesisRecpcion().getObjTesis().getTitulo());
        return null;
    }
    
    //--------------- Vers solo las observaciones
    public String verObservaciones(Asignacion asig) {  
        this.doIniciarRevision();
        this.bandVer = false;
        this.bandFormObs =  true;
        this.bandFormVer =  false;
        this.activeTabIndex = Constantes.TAB_VER_REV;
        this.objRevision.setObjAsignacion(asig);          
        this.doIniciarArrObservacion();
        //--------------ejecuta metodo de carga para las observaciones ya registradas
        this.doListarObservaciones(
                asig.getObjTesisRecpcion().getObjTesis().getObjEsquema().getId_esquema(), 
                asig.getId_asignacion()
        );
        System.out.println("ob inicio: "+this.objRevision.getObjAsignacion().getId_asignacion());
        System.out.println("ob inicio: "+this.objRevision.getObjAsignacion().getObjTesisRecpcion().getObjTesis().getTitulo());
        return null;
    }
    
    //------------cambio de tabs
    public void onClickCambio(javax.faces.event.ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();// 1 -> proviene de tab_Listar
        System.out.println("P_anterior: "+this.puntAnt);
    }
    
    //---------desactivar el tab de detalle
    public String desactivaTabVer() {
        this.bandVer = true;
        //Pregunta si la Detalle Mostrada Proviene listado total:1 
        if (puntAnt.compareTo("1") == 0) {
            this.activeTabIndex = Constantes.TAB_LISTAR_REV;
        }

        return null;
    }
    
    
    
    //---------------- detalle del esquema -------------------------------------------
    public ArrayList<DetalleEsquema> doListarDetalleEsquema(int esquema)
    {
        this.doIniciarArrDetEsquema();
        System.out.println("esquema: "+esquema);
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
    
    
    
    //---------------- observaciones  -------------------------------------------
    public ArrayList<Observacion> doListarObservaciones(int esquema, int asig)
    {
        this.doIniciarArrObservacion();
        System.out.println("Observacion: "+esquema +" - "+asig);
        this.setEsquema(esquema);
        this.setAsignacion(asig);
        this.arrObservacion = Observacion.getCargarObservaciones(esquema, asig);
        return this.arrObservacion;
    }
    // ---- metodo sin parametros
    public ArrayList<Observacion> doListarObservaciones_aux()
    {
        this.doIniciarArrObservacion();
        System.out.println("Observacion: "+esquema +" - "+asignacion);
        this.arrObservacion = Observacion.getCargarObservaciones(esquema, asignacion);
        return this.arrObservacion;
    }
    
    //---- cantidad de registro que posee el array de detalle
    public String getSizeRegistrosObservacion() {        
        if (this.arrObservacion == null) {
            System.out.println("NADA de obs");
            return "0";
        } else {
            System.out.println("regs: "+this.arrObservacion.size());
            return "" + this.arrObservacion.size();
        }
    }
    
    
    //--------Editar observaciones
    
    public void onEdit(RowEditEvent event) { 
        this.doIniciarObservacion_edit();
        final Observacion obs=(Observacion) event.getObject();     
        this.objObservacion_edit = obs; 
        System.out.println("RowEdit: "+this.objObservacion_edit.getId_observacion()+"-"+this.objObservacion_edit.getObservacion()+"-"+this.objObservacion_edit.getEstado());
        Observacion.getActualizarObservacion(this.objObservacion_edit);
        doListarObservaciones_aux();
    }  
    
    public void onCancel(RowEditEvent event) {  
        doListarObservaciones_aux();
    }
    
    //------fin edicion
    
    
}
