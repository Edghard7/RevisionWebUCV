package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class LineaInvestigacion {
    private int id_linea;
    private Escuela objEscuela = new Escuela();
    private String nombre;
    private int estado;
    private String valida; //Almacena el retorno de los procedimientos almacenados
    private int nro;

    public LineaInvestigacion() {
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Escuela getObjEscuela() {
        return objEscuela;
    }

    public void setObjEscuela(Escuela objEscuela) {
        this.objEscuela = objEscuela;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    //---------------combo para seleccionar las linea de investigacion
    public static List<LineaInvestigacion> getCargarComboLinea(){        
        List<LineaInvestigacion> arreglo = null;
             LineaInvestigacion obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_linea_investigacion()}");        
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<LineaInvestigacion>();
            do{
               obj =new LineaInvestigacion();
             
             obj.setId_linea(rs.getInt("id_linea"));
             obj.setNombre(rs.getString("nombre"));
                
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
    
    //---------------combo para seleccionar las linea de investigacion x escuela
    public static List<LineaInvestigacion> getCargarComboLineaEscuela(LineaInvestigacion lin){        
        List<LineaInvestigacion> arreglo = null;
             LineaInvestigacion obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_linea_investigacion_x_escuela(?)}");            
        st.setInt(1, lin.getObjEscuela().getId_escuela());
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<LineaInvestigacion>();
            do{
               obj =new LineaInvestigacion();
             
             obj.setId_linea(rs.getInt("id_linea"));
             obj.setNombre(rs.getString("nombre"));
                
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
    
    //---------------combo para seleccionar las linea de investigacion x escuela
    public static ArrayList<LineaInvestigacion> getLineas_x_Escuela(int escuela){        
        ArrayList<LineaInvestigacion> arreglo = null;
             LineaInvestigacion obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_REPORTE_lineas_x_escuela(?)}");            
        st.setInt(1, escuela);
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<LineaInvestigacion>();
            do{
               obj =new LineaInvestigacion();
             obj.setNombre(rs.getString("linea"));
             obj.setNro(rs.getInt("nro"));
                
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
    
}
