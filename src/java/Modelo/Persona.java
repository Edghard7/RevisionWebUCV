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
public class Persona {

    private int id_persona;
    private TipoPersona objTipoPersona = new TipoPersona();
    private String apellidos;
    private String ap_pat;
    private String ap_mat;
    private String nombres;
    private String correo;
    private int estado;
    private String valida;
    private String estado_d;
    private String usuario;

    public Persona(){

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getEstado_d() {
        return estado_d;
    }

    public void setEstado_d(String estado_d) {
        this.estado_d = estado_d;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }    
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public TipoPersona getObjTipoPersona() {
        return objTipoPersona;
    }

    public void setObjTipoPersona(TipoPersona objTipoPersona) {
        this.objTipoPersona = objTipoPersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
    
    // --------------------- Metodos de acceso a datos
     
    public static boolean registrarPersona(Persona objPer){
         boolean a = false;
         Connection conexion=null;
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_persona(?,?,?,?,?)}");
             conexion.setAutoCommit(false);
             
             st.setInt(1,objPer.getObjTipoPersona().getId_tipo_persona());                 
             
       //--------------------------------------------------------
             if(objPer.getApellidos()!=null)
             {
                 if(objPer.getApellidos().length()>0)
                 {
                     if(!objPer.getApellidos().matches("[a-zA-Z]"))
                     {
                         st.setString(2,objPer.getApellidos().toUpperCase());
                     }
                     else
                     {
                         System.err.println("Apellidos - este campo solo permite letras");
                     }                     
                 }
                 else
                 {
                     st.setString(2,null);
                 }
             }
             else
             {
                 st.setString(2,null);
             }//fin else
       //--------------------------------------------------------
             if(objPer.getNombres()!=null)
             {
                 if(objPer.getNombres().length()>0)
                 {
                     if(!objPer.getNombres().matches("[a-zA-Z]"))
                     {
                         st.setString(3,objPer.getNombres().toUpperCase());
                     }
                     else
                     {
                         System.err.println("Nombres - este campo solo permite letras");
                     }                     
                 }
                 else
                 {
                     st.setString(3,null);
                 }
             }
             else
             {
                 st.setString(3,null);
             }//fin else
       //--------------------------------------------------------
             st.setString(4,objPer.getCorreo());
       //--------------------------------------------------------
             st.registerOutParameter(5, java.sql.Types.VARCHAR);
             st.execute();
             objPer.setValida(st.getString(5));
             
             if(objPer.getValida().toString().equals("OK"))
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
         System.out.println("Objeto: "+objPer.getApellidos()+", "+objPer.getNombres()
                 +", "+objPer.getCorreo()+", "+objPer.getObjTipoPersona().getId_tipo_persona());
     return a;
 } // fin registro de personas
    
    
    //---------------combo para seleccionar las personas de acuerdo al tipo
    public static List<Persona> getCargarComboPersona(Persona per){        
        List<Persona> arreglo = null;
             Persona obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_persona_x_tipo(?)}");            
        st.setInt(1, per.getObjTipoPersona().getId_tipo_persona());
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<Persona>();
            do{
               obj =new Persona();
             
             obj.setId_persona(rs.getInt("id_persona"));
             obj.setApellidos(rs.getString("apellidos")+", "+rs.getString("nombres"));
                
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
    
    //---------------combo para seleccionar las personas de acuerdo a su funcion
    public static List<Persona> getCargarComboPersonaFuncion(Persona per){        
        List<Persona> arreglo = null;
             Persona obj=null;
       Connection conexion = null;
       ResultSet rs = null;
       try{
          conexion = ControladorBD.darConexionBD();
        CallableStatement st = conexion.prepareCall  ( "{call sp_combo_persona_x_funcion(?)}");            
        st.setInt(1, per.getObjTipoPersona().getId_tipo_persona());
        rs = st.executeQuery();        
        if (rs.next()){ 
            arreglo=new ArrayList<Persona>();
            do{
               obj =new Persona();
             
             obj.setId_persona(rs.getInt("id_persona"));
             obj.setApellidos(rs.getString("apellidos")+", "+rs.getString("nombres"));
                
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
    
    public static ArrayList<Persona> getCargarPersona() {        
        ArrayList<Persona> arreglo = null;
        Connection conexion = null;
        ResultSet rs = null;
        Persona obj = null;
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_listar_persona()}");
            rs = st.executeQuery();
            
            if (rs.next()) {
                arreglo = new ArrayList<Persona>();
                do {
                    obj = new Persona();
                    obj.setId_persona(rs.getInt("id_persona"));
                    obj.getObjTipoPersona().setId_tipo_persona(rs.getInt("id_tipo_persona"));
                    obj.setApellidos(rs.getString("apellidos"));
                    obj.setNombres(rs.getString("nombres"));
                    obj.setCorreo(rs.getString("correo"));
                    obj.setEstado(rs.getInt("estado"));
                    obj.setEstado_d(rs.getString("estado_d"));
                    obj.getObjTipoPersona().setNombre(rs.getString("tipo_persona"));
                    obj.setUsuario(rs.getString("usuario"));
                    
                    System.out.println("Tit: "+obj.getObjTipoPersona().getNombre());
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
    
    // editar o actualizar 
    public static boolean getActualizarPersona(Persona obj){
            boolean a=false;
            Connection conexion=null;
            
            try{
               conexion=ControladorBD.darConexionBD();
               CallableStatement st=conexion.prepareCall("{call sp_actualizar_persona(?,?,?,?,?,?,?)}");
               
               st.setInt(1,obj.getId_persona());
               st.setInt(2,obj.getObjTipoPersona().getId_tipo_persona());
               st.setString(3,obj.getApellidos());
               st.setString(4,obj.getNombres());
               st.setString(5, obj.getCorreo());
               st.setInt(6, obj.getEstado());
               st.registerOutParameter(7, java.sql.Types.VARCHAR);
               st.execute();
               obj.setValida(st.getString(7));
                System.out.println("llega: tipo_ "+obj.getObjTipoPersona().getId_tipo_persona());
                if(obj.getValida().toString().equals("OK"))
                {
                    a = true;//se registró correctamente
                }
                st.close();
                conexion.setAutoCommit(true);
                conexion.close();
            }catch(Exception error){
                    System.out.println("Error en el metodo por: " + error.getMessage());
                    error.printStackTrace();
            }
            
            return a;
    }
    
}//end Persona