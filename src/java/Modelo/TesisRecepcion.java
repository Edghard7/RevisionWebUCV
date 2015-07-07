/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.context.FacesContext;

/**
 *
 * @author 
 */
public class TesisRecepcion implements Serializable {
    private int id_tesis_recepcion;
    private Tesis objTesis = new Tesis();
    private Persona objRecepcionista = new Persona();
    private Persona objDirector = new Persona();
    private Date fecha_recepcion;
    private int estado;
    private String desEstado;
    private int id_aux;
    private String aux;
    private String valida; //Almacena el retorno de los procedimientos almacenados
    private int cont;

    public TesisRecepcion() {
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    
    public int getId_aux() {
        return id_aux;
    }

    public void setId_aux(int id_aux) {
        this.id_aux = id_aux;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public String getDesEstado() {
        return desEstado;
    }

    public void setDesEstado(String desEstado) {
        this.desEstado = desEstado;
    }

    public int getId_tesis_recepcion() {
        return id_tesis_recepcion;
    }

    public void setId_tesis_recepcion(int id_tesis_recepcion) {
        this.id_tesis_recepcion = id_tesis_recepcion;
    }

    public Tesis getObjTesis() {
        return objTesis;
    }

    public void setObjTesis(Tesis objTesis) {
        this.objTesis = objTesis;
    }

    public Persona getObjRecepcionista() {
        return objRecepcionista;
    }

    public void setObjRecepcionista(Persona objRecepcionista) {
        this.objRecepcionista = objRecepcionista;
    }

    public Persona getObjDirector() {
        return objDirector;
    }

    public void setObjDirector(Persona objDirector) {
        this.objDirector = objDirector;
    }

    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
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
    
    //---------------listar las tesis
    public static ArrayList<TesisRecepcion> getCargarTesis() {        
        ArrayList<TesisRecepcion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        TesisRecepcion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_tesis()}");
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<TesisRecepcion>();
                do {
                    obj = new TesisRecepcion();
                    /*
                    t.id_tesis,t.titulo,concat(pa.apellidos,', ',pa.nombres ) as autor,
                    concat(pr.apellidos,', ',pr.nombres ) as recepcionista,

                    t.fecha_sustentacion,t.fecha_registro,tr.fecha_recepcion as fecha_ult_recep,
                    es.nombre as escuela,l.nombre as linea_inv,e.descripcion as esquema
                    */
                    obj.getObjTesis().setId_tesis(rs.getInt("id_tesis"));
                    System.out.println("T1: ");                    
                    obj.getObjTesis().setTitulo(rs.getString("titulo") );
                    System.out.println("T2: ");
                    obj.getObjTesis().getObjAutor().setApellidos(rs.getString("autor"));
                    obj.getObjRecepcionista().setApellidos(rs.getString("recepcionista"));
                    obj.getObjTesis().setFecha_sustentacion(rs.getDate("fecha_sustentacion"));
                    obj.getObjTesis().setFecha_registro(rs.getDate("fecha_registro"));
                    obj.setFecha_recepcion(rs.getDate("fecha_ult_recep"));
                    obj.getObjTesis().getObjLinea().getObjEscuela().setNombre(rs.getString("escuela"));
                    obj.getObjTesis().getObjLinea().setNombre(rs.getString("linea_inv"));
                    obj.getObjTesis().getObjEsquema().setDescripcion(rs.getString("esquema"));
                    obj.setEstado(rs.getInt("estado"));
                    obj.setDesEstado(rs.getString("estado_des"));
                    
                    System.out.println("Tit: "+obj.getObjTesis().getTitulo());
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
    
    //---------------listar las tesis que aun no se han asignado
    public static ArrayList<TesisRecepcion> getCargarTesis_sin_Asignar() {        
        ArrayList<TesisRecepcion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        TesisRecepcion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_tesis_sin_asignar()}");
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<TesisRecepcion>();
                do {
                    obj = new TesisRecepcion();
                    /*
                    t.id_tesis,t.titulo,concat(pa.apellidos,', ',pa.nombres ) as autor,
                    concat(pr.apellidos,', ',pr.nombres ) as recepcionista,

                    t.fecha_sustentacion,t.fecha_registro,tr.fecha_recepcion as fecha_ult_recep,
                    es.nombre as escuela,l.nombre as linea_inv,e.descripcion as esquema
                    */
                    obj.setId_tesis_recepcion(rs.getInt("id_tesis_recepcion"));
                    obj.getObjTesis().setId_tesis(rs.getInt("id_tesis"));
                    System.out.println("T1: ");                    
                    obj.getObjTesis().setTitulo(rs.getString("titulo") );
                    System.out.println("T2: ");
                    obj.getObjTesis().getObjAutor().setApellidos(rs.getString("autor"));
                    obj.getObjRecepcionista().setApellidos(rs.getString("recepcionista"));
                    obj.getObjTesis().setFecha_sustentacion(rs.getDate("fecha_sustentacion"));
                    obj.getObjTesis().setFecha_registro(rs.getDate("fecha_registro"));
                    obj.setFecha_recepcion(rs.getDate("fecha_ult_recep"));
                    obj.getObjTesis().getObjLinea().getObjEscuela().setNombre(rs.getString("escuela"));
                    obj.getObjTesis().getObjLinea().setNombre(rs.getString("linea_inv"));
                    obj.getObjTesis().getObjEsquema().setDescripcion(rs.getString("esquema"));
                    obj.setEstado(rs.getInt("id_estado"));                    
                    obj.setDesEstado(rs.getString("estado"));                    
                    
                    System.out.println("Tit: "+obj.getObjTesis().getTitulo());
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
    
    
    // acceso a datos
    public static boolean registrarTesisRecepcion(TesisRecepcion obj){
         boolean a = false;
         Connection conexion=null;
         FacesContext contex = FacesContext.getCurrentInstance();
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_tesis_recepcion(?,?,?,?,?)}");
             conexion.setAutoCommit(false);
             
             st.setInt(1,obj.getObjTesis().getId_tesis());
             st.setInt(2, Integer.parseInt(contex.getExternalContext().getSessionMap().get("id_persona").toString()) );
             st.setInt(3,obj.getObjDirector().getId_persona());
             st.setString(4, "R".toString());
             
             st.registerOutParameter(5, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(5));
             
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
         System.out.println("TesisRecepcion: "+obj.getValida());
     return a;
 } // fin registro
    
    //para validacion
    public static ArrayList<TesisRecepcion> getCuentaTesisRevisadas(int tesis) {        
        ArrayList<TesisRecepcion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        TesisRecepcion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_validar_recepcion_tesis(?)}");
            st.setInt(1, tesis);           
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<TesisRecepcion>();
                do {
                    obj = new TesisRecepcion();                    
                    obj.setId_tesis_recepcion(rs.getInt("id_tesis_recepcion"));                    
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
        System.out.println("MOD:RECEP::: "+tesis);
        return arreglo;
    }
    
}