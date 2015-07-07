package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.context.FacesContext;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:11 a.m.
 */
public class Observacion {

    private int id_observacion;
    /**
     * FK-Detalle_Esquema
     */
    private DetalleEsquema objDetalleEsquema = new DetalleEsquema();
    private Revision objRevision = new Revision();
    private String observacion;
    private String estado_d;
    /**
     * si fue corregida o no
     */
    private int estado;
    private Date fecha;
    private Date fecha_act;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public Observacion(){

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha_act() {
        return fecha_act;
    }

    public void setFecha_act(Date fecha_act) {
        this.fecha_act = fecha_act;
    }

    public String getEstado_d() {
        return estado_d;
    }

    public void setEstado_d(String estado_d) {
        this.estado_d = estado_d;
    }
    
    public int getId_observacion() {
        return id_observacion;
    }

    public void setId_observacion(int id_observacion) {
        this.id_observacion = id_observacion;
    }

    public DetalleEsquema getObjDetalleEsquema() {
        return objDetalleEsquema;
    }

    public void setObjDetalleEsquema(DetalleEsquema objDetalleEsquema) {
        this.objDetalleEsquema = objDetalleEsquema;
    }

    public Revision getObjRevision() {
        return objRevision;
    }

    public void setObjRevision(Revision objRevision) {
        this.objRevision = objRevision;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    //---------------listado de las observaciones de la tesis
    public static ArrayList<Observacion> getCargarObservaciones(int esquema, int asig){        
        ArrayList<Observacion> arreglo = null;
             Observacion obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_listar_observaciones_asig(?,?)}");            
        st.setInt(1, esquema);
        st.setInt(2, asig);
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<Observacion>();
            do{
               obj =new Observacion();
             
             obj.getObjDetalleEsquema().setId_detalle(rs.getInt("id_detalle"));
             obj.getObjDetalleEsquema().getObjEsquema().setId_esquema(rs.getInt("id_esquema"));
             obj.getObjDetalleEsquema().getObjEsquema().setDescripcion(rs.getString("esquema"));
             obj.getObjDetalleEsquema().setCapitulo(rs.getString("capitulo"));
             obj.getObjDetalleEsquema().setNombre(rs.getString("nombre"));
             obj.getObjDetalleEsquema().setContenido(rs.getString("contenido"));
             obj.getObjDetalleEsquema().setOrden(rs.getInt("orden"));
             obj.setId_observacion(rs.getInt("id_observacion"));
             obj.getObjRevision().setId_revision(rs.getInt("id_revision"));
             obj.setObservacion(rs.getString("observacion"));
             obj.setFecha(rs.getDate("fecha"));
             obj.setEstado(rs.getInt("estado"));
             obj.setEstado_d(rs.getString("estado_des"));
                
             arreglo.add(obj);
            }while (rs.next());
        } 
         rs.close();
         st.close();
         conexion.close();
       }catch(Exception error){
           System.out.println("Error en el metodo por: " +  error.getMessage());
           error.printStackTrace();
       }
         
         return arreglo;
     }
    
    // registro de una observacion
    public static boolean registrarObservacion(Observacion obj){
         boolean a = false;
         Connection conexion=null;
         System.out.println("llega 1");
              
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_observacion_asignacion(?,?,?,?)}");
             conexion.setAutoCommit(false);
            
             st.setInt(1,obj.getObjDetalleEsquema().getId_detalle());
             st.setInt(2, obj.getObjRevision().getObjAsignacion().getId_asignacion());
             st.setString(3, obj.getObservacion());
             
       //--------------------------------------------------------
             st.registerOutParameter(4, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(4));
             System.out.println("llega 3");
             if(obj.getValida().toString().equals("OK"))
             {
                 a = true;//se registró correctamente
             }
             st.close();
             conexion.setAutoCommit(true);
             conexion.close();
         }//fin try 
         catch (Exception error) 
         {
             System.out.println("Error Registrar :"+ error.getMessage());
         }// fin catch
         
     return a;
 } // fin registro de asignaciones
    
    
    // editar o actualizar el estado de la observacion realizada
    public static boolean getActualizarObservacion(Observacion obj){
            boolean a=false;
            Connection conexion=null;
            
            try{
               conexion=ControladorBD.darConexionBD();
               CallableStatement st=conexion.prepareCall("{call sp_actualizar_observacion(?,?,?,?)}");
               
               st.setInt(1,obj.getId_observacion());
               st.setString(2,obj.getObservacion());
               st.setInt(3,obj.getEstado());
               st.registerOutParameter(4, java.sql.Types.VARCHAR);
               st.execute();
               obj.setValida(st.getString(4));
                System.out.println("llega");
                if(obj.getValida().toString().equals("OK"))
                {
                    a = true;//se registró correctamente
                }
                st.close();
                conexion.setAutoCommit(true);
                conexion.close();
            }catch(Exception error){
                    System.out.println("Error en el metodo por: " + error.getMessage());
                    error.printStackTrace();
            }
            
            return a;
    }
    
    
    public static ArrayList<Observacion> getCargarObservaciones_Tesis(int tesis) {        
        ArrayList<Observacion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        Observacion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_REPORTE_observaciones_x_tesis(?)}");
            st.setInt(1, tesis);
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<Observacion>();
                do {
                    obj = new Observacion();
                    obj.getObjRevision().getObjAsignacion().getObjTesisRecpcion().getObjTesis().setTitulo(rs.getString("titulo"));
                    obj.getObjRevision().getObjAsignacion().getObjTesisRecpcion().setFecha_recepcion(rs.getDate("fecha_recepcion"));
                    obj.getObjDetalleEsquema().setId_detalle(rs.getInt("id_detalle_esquema"));
                    obj.getObjDetalleEsquema().setNombre(rs.getString("esquema"));
                    obj.setObservacion(rs.getString("observacion"));
                    obj.setFecha(rs.getDate("fecha"));
                    obj.setEstado_d(rs.getString("estado_des"));
                    
                    
                    System.out.println("Tit: "+obj.getEstado_d());
                    arreglo.add(obj);

                } while (rs.next());
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por:" + error.getMessage());
            error.printStackTrace();

        }
        return arreglo;
    }
   
    
}//end Observacion