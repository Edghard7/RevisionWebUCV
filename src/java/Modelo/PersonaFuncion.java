package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.context.FacesContext;

/**
 *
 * @author 
 */
public class PersonaFuncion {
    private int id_persona_funcion;
    private Persona objPersona = new Persona();
    private Funcion objFuncion = new Funcion();
    private int estado;
    private String estado_d;
    private String valida; //Almacena el retorno de los procedimientos almacenados
    private String funciones;

    public PersonaFuncion() {
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    
    public String getEstado_d() {
        return estado_d;
    }

    public void setEstado_d(String estado_d) {
        this.estado_d = estado_d;
    }

    public int getId_persona_funcion() {
        return id_persona_funcion;
    }

    public void setId_persona_funcion(int id_persona_funcion) {
        this.id_persona_funcion = id_persona_funcion;
    }

    public Persona getObjPersona() {
        return objPersona;
    }

    public void setObjPersona(Persona objPersona) {
        this.objPersona = objPersona;
    }

    public Funcion getObjFuncion() {
        return objFuncion;
    }

    public void setObjFuncion(Funcion objFuncion) {
        this.objFuncion = objFuncion;
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
    
    public static ArrayList<PersonaFuncion> getCargarPersonaFuncion(int id_persona) {        
        ArrayList<PersonaFuncion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        PersonaFuncion obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_funciones_de_persona(?)}");
            st.setInt(1, id_persona);
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<PersonaFuncion>();
                do {
                    obj = new PersonaFuncion();
                    obj.setId_persona_funcion(rs.getInt("id_persona_funcion"));
                    obj.getObjPersona().setId_persona(rs.getInt("id_persona"));
                    obj.getObjPersona().setApellidos(rs.getString("apellidos"));
                    obj.getObjPersona().setNombres(rs.getString("nombres"));
                    obj.getObjFuncion().setId_funcion(rs.getInt("id_funcion"));
                    obj.getObjFuncion().setNombre(rs.getString("funcion"));
                    obj.setEstado(rs.getInt("estado"));
                    obj.setEstado_d(rs.getString("estado_d"));
                    System.out.println("Tit: "+obj.getObjFuncion().getNombre());
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
    public static boolean registrarFuncion(PersonaFuncion obj){
         boolean a = false;
         Connection conexion=null;
         
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_persona_funcion(?,?,?)}");
             conexion.setAutoCommit(false);
             
             st.setInt(1,obj.getObjPersona().getId_persona());
             st.setInt(2, obj.getObjFuncion().getId_funcion());
            
       //--------------------------------------------------------
             st.registerOutParameter(3, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(3));
             
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
         System.out.println(""+obj.getObjPersona().getId_persona()+" - "+obj.getObjFuncion().getId_funcion());
     return a;
 } // fin registro
    
    // quitar una funcion
    public static boolean actualizarFuncion(PersonaFuncion obj){
         boolean a = false;
         Connection conexion=null;
         
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_actualizar_persona_funcion(?,?,?)}");
             conexion.setAutoCommit(false);
             
             st.setInt(1,obj.getId_persona_funcion());
             st.setInt(2,2); // deshabilita la funcion
       //--------------------------------------------------------
             st.registerOutParameter(3, java.sql.Types.VARCHAR);
             st.execute();
             obj.setValida(st.getString(3));
             
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
    
    
    //------------- funciones
    public static ArrayList<Funcion> getCargarFunciones(int persona) {        
        ArrayList<Funcion> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        Funcion obj = null;
        Funcion obj_ = new Funcion();
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_funciones_persona(?)}");
            st.setInt(1, persona);
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<Funcion>();
                do {
                    obj = new Funcion();
                    obj.setId_funcion(rs.getInt("id_funcion"));
                    obj.setNombre(rs.getString("funcion"));
                    
                    obj.setFunciones(obj.getNombre()+",");
                    
                    System.out.println("Funcion: "+obj.getNombre());
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
    
    //------------- funciones
    public static PersonaFuncion getCargarFunciones_(int persona) {                
        Connection conexion = null;
        ResultSet rs = null;        
        PersonaFuncion obj = new PersonaFuncion();
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_funciones_persona(?)}");
            st.setInt(1, persona);
            rs = st.executeQuery();
            
            String aux = "";
            
            if (rs.next()) {
                do {
                    aux += rs.getString("id_funcion")+",";
                    
                    System.out.println("Funcion: "+aux);

                } while (rs.next());
            }
            
            aux = aux.substring(0, aux.length()-1);
            
            System.out.println("Funcion_str : "+aux);
            
            obj.setFunciones(aux);
            
            rs.close();
            st.close();
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por:" + error.getMessage());
            error.printStackTrace();

        }
        return obj;
    }
    
}
