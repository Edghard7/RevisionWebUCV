package Modelo;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.context.FacesContext;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:12 a.m.
 */
public class Tesis implements Serializable {

    private int id_tesis;    
    /**
     * FK-Persona
     */
    private Persona objAutor = new Persona();
    /**
     * FK-Persona
     */
    private Persona objRecepcionista = new Persona();
    private LineaInvestigacion objLinea = new LineaInvestigacion();
    private EsquemaTesis objEsquema = new EsquemaTesis();
    private String titulo;
    private Date fecha_sustentacion;
    private Date fecha_registro;
    private int estado;	
    private int nro;
    private int id_director; //-----
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public Tesis(){

    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    
    public int getId_tesis() {
        return id_tesis;
    }

    public void setId_tesis(int id_tesis) {
        this.id_tesis = id_tesis;
    }

    public Persona getObjAutor() {
        return objAutor;
    }

    public void setObjAutor(Persona objAutor) {
        this.objAutor = objAutor;
    }

    public Persona getObjRecepcionista() {
        return objRecepcionista;
    }

    public void setObjRecepcionista(Persona objRecepcionista) {
        this.objRecepcionista = objRecepcionista;
    }

    public LineaInvestigacion getObjLinea() {
        return objLinea;
    }

    public void setObjLinea(LineaInvestigacion objLinea) {
        this.objLinea = objLinea;
    }

    public EsquemaTesis getObjEsquema() {
        return objEsquema;
    }

    public void setObjEsquema(EsquemaTesis objEsquema) {
        this.objEsquema = objEsquema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha_sustentacion() {
        return fecha_sustentacion;
    }

    public void setFecha_sustentacion(Date fecha_sustentacion) {
        this.fecha_sustentacion = fecha_sustentacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
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

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }
    
    
    // acceso a datos
    public static boolean registrarTesis(Tesis objTesis){
         boolean a = false;
         Connection conexion=null;
         FacesContext contex = FacesContext.getCurrentInstance();
         try {
             conexion = ControladorBD.darConexionBD();
             CallableStatement st= conexion.prepareCall("{call sp_registro_tesis(?,?,?,?,?,?,?,?)}");
             conexion.setAutoCommit(false);
             
             st.setInt(1,objTesis.getObjAutor().getId_persona());
             st.setInt(2, Integer.parseInt(contex.getExternalContext().getSessionMap().get("id_persona").toString()) );
             st.setInt(3,objTesis.getId_director());
             st.setInt(4,objTesis.getObjLinea().getId_linea());
             st.setInt(5,objTesis.getObjEsquema().getId_esquema());
             
       //--------------------------------------------------------
             if(objTesis.getTitulo()!=null)
             {
                 if(objTesis.getTitulo().length()>0)
                 {
                     st.setString(6,objTesis.getTitulo());
                 }
                 else
                 {
                     st.setString(6,null);
                 }
             }
             else
             {
                 st.setString(6,null);
             }//fin else
       //--------------------------------------------------------             
             java.sql.Date fc = new java.sql.Date(objTesis.getFecha_sustentacion().getTime());
             System.out.println("F1: "+objTesis.getFecha_sustentacion()
                     +" F2: "+objTesis.getFecha_sustentacion().getTime()
                     +" F3: "+fc.toString());
             st.setDate(7, fc);
       //--------------------------------------------------------
             st.registerOutParameter(8, java.sql.Types.VARCHAR);
             st.execute();
             objTesis.setValida(st.getString(8));
             
             if(objTesis.getValida().toString().equals("OK"))
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
         System.out.println("Tesis: "+objTesis.getTitulo());
     return a;
 } // fin registro
    
    
   
    
    
}//end Tesis