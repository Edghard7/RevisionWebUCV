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
public class EsquemaTesis {
    private int id_esquema;
    private TipoTesis objTipoTesis = new TipoTesis();
    private String descripcion;
    private int estado;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public EsquemaTesis() {
    }

    public int getId_esquema() {
        return id_esquema;
    }

    public void setId_esquema(int id_esquema) {
        this.id_esquema = id_esquema;
    }

    public TipoTesis getObjTipoTesis() {
        return objTipoTesis;
    }

    public void setObjTipoTesis(TipoTesis objTipoTesis) {
        this.objTipoTesis = objTipoTesis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
    //---------------combo para seleccionar los esquemas de tesis
    public static List<EsquemaTesis> getCargarComboEsquemaTesis(){        
        List<EsquemaTesis> arreglo = null;
             EsquemaTesis obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_esquema_tesis()}");            
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<EsquemaTesis>();
            do{
               obj =new EsquemaTesis();
             
             obj.setId_esquema(rs.getInt("id_esquema"));
             obj.setDescripcion(rs.getString("descripcion"));
                
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
