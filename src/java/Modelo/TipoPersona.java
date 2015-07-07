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
public class TipoPersona {
    private int id_tipo_persona;
    private String nombre;
    private int estado;

    public TipoPersona() {
    }

    public int getId_tipo_persona() {
        return id_tipo_persona;
    }

    public void setId_tipo_persona(int id_tipo_persona) {
        this.id_tipo_persona = id_tipo_persona;
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
    
    
    //---------------combo para seleccionar el tipo d epersona
    public static List<TipoPersona> getCargarComboTipoPersona(){        
        List<TipoPersona> arreglo = null;
             TipoPersona obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_tipo_persona()}");            
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<TipoPersona>();
            do{
               obj =new TipoPersona();
             
             obj.setId_tipo_persona(rs.getInt("id_tipo_persona"));
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
    
}
