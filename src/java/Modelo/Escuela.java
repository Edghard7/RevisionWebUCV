package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:10 a.m.
 */
public class Escuela {

    private int id_escuela;
    private Facultad objFacultad =  new Facultad();
    private String nombre;    
    private String valida; //Almacena el retorno de los procedimientos almacenados
    
    private int nro;

    public Escuela(){

    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    
    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public Facultad getObjFacultad() {
        return objFacultad;
    }

    public void setObjFacultad(Facultad objFacultad) {
        this.objFacultad = objFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    //---------------combo para seleccionar las escuelas
    public static List<Escuela> getCargarComboEscuela(){        
        List<Escuela> arreglo = null;
             Escuela obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_escuela()}");            
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<Escuela>();
            do{
               obj =new Escuela();
             
             obj.setId_escuela(rs.getInt("id_escuela"));
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
    
    //---------------combo para seleccionar las escuelas x facultad
    public static List<Escuela> getCargarComboEscuelaFacultad(Escuela esc){        
        List<Escuela> arreglo = null;
             Escuela obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_escuela_x_facultad(?)}");            
        st.setInt(1, esc.getObjFacultad().getId_facultad());
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<Escuela>();
            do{
               obj =new Escuela();
             
             obj.setId_escuela(rs.getInt("id_escuela"));
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
    
    
     public static ArrayList<Escuela> getTesis_x_Escuela(){
        ArrayList<Escuela> arr=null;       
        ResultSet rs=null;
        Escuela obj=null;
        Connection conexion = null;
        
        try{
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall( "{call sp_REPORTE_tesis_x_escuela()}");                            
            rs = st.executeQuery();
            if (rs.next()){                              
               arr = new ArrayList<Escuela>();
                do{
                    obj =new Escuela();
                    obj.setNombre(rs.getString("escuela"));
                    obj.setNro(rs.getInt("nro_tesis"));

                    arr.add(obj);
               } while (rs.next());
            }  
                 rs.close();
                 st.close();
                 conexion.close();
        }catch(Exception error){
                System.out.println("Error en el metodo por: " + error.getMessage());
                error.printStackTrace();
        }
        
    return arr;                
    }
    
    
}//end Escuela