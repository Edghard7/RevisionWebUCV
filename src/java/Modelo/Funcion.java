package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:11 a.m.
 */
public class Funcion {

    private int id_funcion;
    /**
     * recepcionista
     *        jefe
     *        revisor
     *        seguidor
     */
    private String nombre;
    private String funciones;
    private int estado;    

    public Funcion(){

    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    
    public int getId_funcion() {
        return id_funcion;
    }

    public void setId_funcion(int id_funcion) {
        this.id_funcion = id_funcion;
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
    
    
     public static List<Funcion> getCargarComboFuncion(){        
        List<Funcion> arreglo = null;
             Funcion obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_funcion()}");                    
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<Funcion>();
            do{
               obj =new Funcion();
             
             obj.setId_funcion(rs.getInt("id_funcion"));
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

}//end Funcion