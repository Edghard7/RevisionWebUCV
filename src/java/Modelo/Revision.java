package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.faces.context.FacesContext;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:11 a.m.
 */
public class Revision {

    private int id_revision;
    private Asignacion objAsignacion = new Asignacion();
    /**
     * -Obervaciones generales
     */
    private String comentario;
    /**
     * --- el estado de esta revision
     */
    private int estado;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public Revision(){

    }

    public int getId_revision() {
        return id_revision;
    }

    public void setId_revision(int id_revision) {
        this.id_revision = id_revision;
    }

    public Asignacion getObjAsignacion() {
        return objAsignacion;
    }

    public void setObjAsignacion(Asignacion objAsignacion) {
        this.objAsignacion = objAsignacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
    
    // registro de apertura de  revision
    public static boolean registrarRevision(Revision obj){
         boolean a = false;
         Connection conexion=null;
         System.out.println("llega 1");
         FacesContext contex = FacesContext.getCurrentInstance();         
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_apertura_revision(?,?)}");
             conexion.setAutoCommit(false);
            
             st.setInt(1,obj.getObjAsignacion().getId_asignacion());
             
       //--------------------------------------------------------
             st.registerOutParameter(2, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(2));
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
 } // fin registro
    
    // registro de cierre de  revision
    public static boolean registrarRevision_cierre(Revision obj){
         boolean a = false;
         Connection conexion=null;
         System.out.println("llega 1");
         FacesContext contex = FacesContext.getCurrentInstance();         
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_cierre_revision(?,?,?)}");
             conexion.setAutoCommit(false);
            
             st.setInt(1,obj.getObjAsignacion().getId_asignacion());
             st.setString(2, obj.getComentario());
             
       //--------------------------------------------------------
             st.registerOutParameter(3, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(3));
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
    
    
    // registro de cierre de  revision
    public static boolean registrarFinRevision(Revision obj){
         boolean a = false;
         Connection conexion=null;
         System.out.println("llega 1");                 
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_fin_revision(?,?)}");
             conexion.setAutoCommit(false);
            
             st.setInt(1,obj.getObjAsignacion().getObjTesisRecpcion().getObjTesis().getId_tesis());             
             
       //--------------------------------------------------------
             st.registerOutParameter(2, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(2));
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
 } // fin de revision
    
}//end Revision