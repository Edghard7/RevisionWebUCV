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
public class DetalleEsquema {
    
    private int id_detalle;
    private EsquemaTesis objEsquema = new EsquemaTesis();
    private String capitulo;
    private String nombre;
    private String contenido;
    private int orden;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public DetalleEsquema() {
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public EsquemaTesis getObjEsquema() {
        return objEsquema;
    }

    public void setObjEsquema(EsquemaTesis objEsquema) {
        this.objEsquema = objEsquema;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    
    //---------------listado del esquema de la tesis
    public static ArrayList<DetalleEsquema> getCargarDetalleEsquemaTesis(int esquema){        
        ArrayList<DetalleEsquema> arreglo = null;
             DetalleEsquema obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_listar_esquema(?)}");            
        st.setInt(1, esquema);
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<DetalleEsquema>();
            do{
               obj =new DetalleEsquema();
             
             obj.setId_detalle(rs.getInt("id_detalle"));
             obj.getObjEsquema().setId_esquema(rs.getInt("id_esquema"));
             obj.getObjEsquema().setDescripcion(rs.getString("esquema"));
             obj.setCapitulo(rs.getString("capitulo"));
             obj.setNombre(rs.getString("nombre"));
             obj.setContenido(rs.getString("contenido"));
             obj.setOrden(rs.getInt("orden"));
                
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
