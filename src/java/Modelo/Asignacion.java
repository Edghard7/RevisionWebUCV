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
 * @created 28-may-2015 12:38:10 a.m.
 */
public class Asignacion {

    private int id_asignacion;
    private TesisRecepcion objAsigRecpcion = new TesisRecepcion();
    private int estado;
    private String estado_d;
    /**
     * FK-Persona
     */
    private Persona objJefe = new Persona();
    /**
     * FK-Persona
     */
    private Persona objRevisor = new Persona();
    private Date fecha_asignacion;  
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public Asignacion(){

    }

    public TesisRecepcion getObjAsigRecpcion() {
        return objAsigRecpcion;
    }

    public void setObjAsigRecpcion(TesisRecepcion objAsigRecpcion) {
        this.objAsigRecpcion = objAsigRecpcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEstado_d() {
        return estado_d;
    }

    public void setEstado_d(String estado_d) {
        this.estado_d = estado_d;
    }

    
    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public TesisRecepcion getObjTesisRecpcion() {
        return objAsigRecpcion;
    }

    public void setObjTesisRecpcion(TesisRecepcion objAsigRecpcion) {
        this.objAsigRecpcion = objAsigRecpcion;
    }

    public Persona getObjJefe() {
        return objJefe;
    }

    public void setObjJefe(Persona objJefe) {
        this.objJefe = objJefe;
    }

    public Persona getObjRevisor() {
        return objRevisor;
    }

    public void setObjRevisor(Persona objRevisor) {
        this.objRevisor = objRevisor;
    }

    public Date getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(Date fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    public static boolean registrarAsignacion(Asignacion objAsig){
         boolean a = false;
         Connection conexion=null;
         System.out.println("llega 1");
         FacesContext contex = FacesContext.getCurrentInstance();         
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_asignacion(?,?,?,?)}");
             conexion.setAutoCommit(false);
             System.out.println("llega 2");
             st.setInt(1,objAsig.getObjTesisRecpcion().getId_tesis_recepcion());
             // Integer.parseInt(contex.getExternalContext().getSessionMap().get("id_persona").toString())
             st.setInt(2, objAsig.getObjJefe().getId_persona() );
             
             st.setInt(3,objAsig.getObjRevisor().getId_persona());
             
       //--------------------------------------------------------
             st.registerOutParameter(4, java.sql.Types.VARCHAR);
             st.execute();
             objAsig.setValida(st.getString(4));
             System.out.println("llega 3");
             if(objAsig.getValida().toString().equals("OK"))
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
    
    //---------------listar las tesis que aun no se han asignado
    public static ArrayList<Asignacion> getCargarAsignaciones(int persona) {        
        ArrayList<Asignacion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        Asignacion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_asignaciones_revisor(?)}");
            st.setInt(1, persona);
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<Asignacion>();
                do {
                    obj = new Asignacion();
                    /*
                    a.id_asignacion, a.id_tesis_recepcion, t.id_tesis,
                    tr.fecha_recepcion, a.fecha_asignacion, concat(pa.apellidos,', ',pa.nombres) as autor,
                    t.titulo, l.nombre as linea_inv, et.descripcion as esquema, es.nombre as escuela
                    */
                    obj.setId_asignacion(rs.getInt("id_asignacion"));
                    obj.getObjTesisRecpcion().setId_tesis_recepcion(rs.getInt("id_tesis_recepcion"));
                    obj.getObjTesisRecpcion().getObjTesis().setId_tesis(rs.getInt("id_tesis"));
                    obj.getObjAsigRecpcion().getObjTesis().getObjEsquema().setId_esquema(rs.getInt("id_esquema"));
                    obj.getObjTesisRecpcion().setFecha_recepcion(rs.getDate("fecha_recepcion"));
                    obj.setFecha_asignacion(rs.getDate("fecha_asignacion"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjAutor().setApellidos(rs.getString("autor"));
                    obj.getObjTesisRecpcion().getObjTesis().setTitulo(rs.getString("titulo"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjLinea().setNombre(rs.getString("linea_inv"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjEsquema().setDescripcion(rs.getString("esquema"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjLinea().getObjEscuela().setNombre(rs.getString("escuela"));
                    obj.setEstado(rs.getInt("estado"));
                    obj.setEstado_d(rs.getString("estado_d"));
                    
                    System.out.println("ID_ESUQME: "+obj.getObjAsigRecpcion().getObjTesis().getObjEsquema().getId_esquema());
                                        
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
    
    //---------------listar todas las asignaciones
    public static ArrayList<Asignacion> getCargarAsignaciones_all() {        
        ArrayList<Asignacion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        Asignacion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_asignaciones()}");            
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<Asignacion>();
                do {
                    obj = new Asignacion();
                    /*
                    a.id_asignacion, a.id_tesis_recepcion, t.id_tesis,
                    tr.fecha_recepcion, a.fecha_asignacion, concat(pa.apellidos,', ',pa.nombres) as autor,
                    t.titulo, l.nombre as linea_inv, et.descripcion as esquema, es.nombre as escuela
                    */
                    obj.setId_asignacion(rs.getInt("id_asignacion"));
                    obj.getObjTesisRecpcion().setId_tesis_recepcion(rs.getInt("id_tesis_recepcion"));
                    obj.getObjTesisRecpcion().getObjTesis().setId_tesis(rs.getInt("id_tesis"));
                    obj.getObjAsigRecpcion().getObjTesis().getObjEsquema().setId_esquema(rs.getInt("id_esquema"));
                    obj.getObjTesisRecpcion().setFecha_recepcion(rs.getDate("fecha_recepcion"));
                    obj.setFecha_asignacion(rs.getDate("fecha_asignacion"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjAutor().setApellidos(rs.getString("autor"));
                    obj.getObjTesisRecpcion().getObjTesis().setTitulo(rs.getString("titulo"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjLinea().setNombre(rs.getString("linea_inv"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjEsquema().setDescripcion(rs.getString("esquema"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjLinea().getObjEscuela().setNombre(rs.getString("escuela"));
                    obj.setEstado(rs.getInt("estado"));
                    obj.setEstado_d(rs.getString("estado_d"));
                    obj.getObjRevisor().setApellidos(rs.getString("revisor"));
                    
                    System.out.println("ID_ESUQME: "+obj.getObjAsigRecpcion().getObjTesis().getObjEsquema().getId_esquema());
                                        
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
    
    //---------------listar las tesis cuyo estado es finalizado
    public static ArrayList<Asignacion> getCargarTesisFinalizadas_all() {        
        ArrayList<Asignacion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        Asignacion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_tesis_finalizadas()}");            
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<Asignacion>();
                do {
                    obj = new Asignacion();
                    
                    obj.setId_asignacion(rs.getInt("id_asignacion"));
                    obj.getObjTesisRecpcion().setId_tesis_recepcion(rs.getInt("id_tesis_recepcion"));
                    obj.getObjTesisRecpcion().getObjTesis().setId_tesis(rs.getInt("id_tesis"));
                    obj.getObjAsigRecpcion().getObjTesis().getObjEsquema().setId_esquema(rs.getInt("id_esquema"));
                    obj.getObjTesisRecpcion().setFecha_recepcion(rs.getDate("fecha_recepcion"));
                    obj.setFecha_asignacion(rs.getDate("fecha_asignacion"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjAutor().setApellidos(rs.getString("autor"));
                    obj.getObjTesisRecpcion().getObjTesis().setTitulo(rs.getString("titulo"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjLinea().setNombre(rs.getString("linea_inv"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjEsquema().setDescripcion(rs.getString("esquema"));
                    obj.getObjTesisRecpcion().getObjTesis().getObjLinea().getObjEscuela().setNombre(rs.getString("escuela"));
                    obj.getObjRevisor().setApellidos(rs.getString("revisor"));
                    obj.setEstado(rs.getInt("estado"));
                    obj.setEstado_d(rs.getString("estado_d"));
                    
                    System.out.println("ID_ESUQME: "+obj.getObjAsigRecpcion().getObjTesis().getObjEsquema().getId_esquema());
                                        
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
    
    //------- metodo para seleccionar solo una de las tesis recipcionadas - cuya tesis sea identica
    //_-- este metodo sera llamado desde el bean
    public static ArrayList<Asignacion> getCargarTesisFinalizadas()
    {
        ArrayList<Asignacion> arrAsig =  getCargarTesisFinalizadas_all();
        System.out.println("Size arrAsig: "+arrAsig.size());
        ArrayList<Asignacion> newArr = new ArrayList<Asignacion>();
        int n = arrAsig.size();
        int x = 0;
        
        Asignacion obj_a = new Asignacion();
        obj_a = arrAsig.get(x);
        newArr.add(obj_a);
        
        System.out.println("obj: "+obj_a.getObjAsigRecpcion().getObjTesis().getTitulo());
        
        for (int i = 1; i < n; i++) {
            Asignacion obj = arrAsig.get(i);
            if(obj.getObjTesisRecpcion().getObjTesis().getId_tesis() != obj_a.getObjTesisRecpcion().getObjTesis().getId_tesis())
            {                
                newArr.add(obj);
            }
            obj_a = obj;
        }// fin for
        
        System.out.println("uno: " +arrAsig.get(x).getObjTesisRecpcion().getId_tesis_recepcion());
        System.out.println("Size arrAsig: "+arrAsig.size());
        System.out.println("Size newArr: "+newArr.size());
        
        return newArr;
    }
    

}//end Asignacion