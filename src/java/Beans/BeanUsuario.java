/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import Modelo.ControladorBD;
import Modelo.Funcion;
import Modelo.PersonaFuncion;
import Modelo.Usuario;
import Utils.Constantes;
import Utils.Mensaje;
import Utils.encriptaCadenas;
import java.io.IOException;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Henry
 */
public class BeanUsuario implements Serializable{
    
    private Usuario objUsuario = new Usuario();
    private Usuario objUsuario_aux = new Usuario();
    private ArrayList<Usuario> arreglo = new ArrayList<Usuario>();
    private String parametro;
    private boolean usuarioLogeado;
    private boolean flgPassIguales;
    private String nombre_user;
    private String clave_user;

    public BeanUsuario() {
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public Usuario getObjUsuario_aux() {
        return objUsuario_aux;
    }

    public void setObjUsuario_aux(Usuario objUsuario_aux) {
        this.objUsuario_aux = objUsuario_aux;
    }

    public ArrayList<Usuario> getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList<Usuario> arreglo) {
        this.arreglo = arreglo;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public boolean isUsuarioLogeado() {
        return usuarioLogeado;
    }

    public void setUsuarioLogeado(boolean usuarioLogeado) {
        this.usuarioLogeado = usuarioLogeado;
    }

    public boolean isFlgPassIguales() {
        return flgPassIguales;
    }

    public void setFlgPassIguales(boolean flgPassIguales) {
        this.flgPassIguales = flgPassIguales;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getClave_user() {
        return clave_user;
    }

    public void setClave_user(String clave_user) {
        this.clave_user = clave_user;
    }
    
    //------- validar acceso al sistema
    public Usuario validar(String user, String pass) {
        ResultSet rs = null;
        Connection conexion = null;
        Usuario usuario = null;
        System.out.println("user: "+user+" - pass: "+pass);
        //FacesContext contex = FacesContext.getCurrentInstance();
        try {
            conexion = ControladorBD.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_sesion(?,?)}");
            st.setString(1, user);
            st.setString(2, pass);
            rs = st.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNombre(user.toLowerCase());
                usuario.getObjPersona().setApellidos(rs.getString("apellidos"));
                usuario.getObjPersona().setNombres(rs.getString("nombres"));
                usuario.getObjPersona().setId_persona(rs.getInt("id_persona"));
                usuario.getObjPersona().getObjTipoPersona().setId_tipo_persona(rs.getInt("id_tipo_persona"));
                usuario.getObjPersona().getObjTipoPersona().setNombre(rs.getString("tipo_persona"));
                rs.close();
                conexion.close();
            }

        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        /*
         * if(usuario!=null){//poner en modod sesion: tipo personal
         * contex.getExternalContext().getSessionMap().put("nombre_usuario",
         * usuario.getNombre_usuario()); } /muestra System.out.println("Este es
         * el retorno: "+usuario.getCod_tipo_personal() +" - "+user+" -
         * "+usuario.getPersonal()+" - "+usuario.getDescripcion() +" - "+usuario.getTipo_user());
         */
        return usuario;
    }
    
    public void pageLogin()
    {        
        FacesContext contex = FacesContext.getCurrentInstance();
        try {
            if (contex.getExternalContext().getSessionMap().get("isSesionAlive").
                    toString().trim().equals("true")) {
                System.out.println("Con session");                
                contex.getExternalContext().redirect(Constantes.PAGE_PRINCIPAL_JSF);
            }
        } catch (Exception e) {
        }
    }
    
    
    public void validarSesion() {
        FacesContext contex = FacesContext.getCurrentInstance();
        //salirSistema();
        try {
            if (contex.getExternalContext().getSessionMap().get("isSesionAlive") == null
                    || contex.getExternalContext().getSessionMap().get("isSesionAlive").
                    toString().trim().equals("false")) {
                contex.getExternalContext().redirect(Constantes.PAGE_LOGIN_JSF);
                contex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Autenticacion", "El usuario No existe !!"));
                System.out.println("Sin session");
            }else
            {
                //------------------- obtener funciones
                PersonaFuncion objFunciones =  new PersonaFuncion();
                objFunciones =  PersonaFuncion.getCargarFunciones_(objUsuario.getObjPersona().getId_persona());
                
                contex.getExternalContext().getSessionMap().put("funciones", null);
                contex.getExternalContext().getSessionMap().put("funciones", objFunciones.getFunciones());
            }
            
            
        } catch (Exception e) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(Constantes.PAGE_LOGIN_JSF);
            } catch (Exception ex) {
                System.out.println("Error en el metodo por: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }
    
    //--------------------------------------
    public String loginUsuario() {        
        String outcome = null;
        System.out.println("us: "+this.nombre_user+" Pass: "+this.clave_user);
        flgPassIguales = false;
        this.objUsuario = new Usuario();
        try {
            FacesContext contex = FacesContext.getCurrentInstance();
            if (this.objUsuario != null) {
                this.objUsuario = this.validar(this.nombre_user, 
                        encriptaCadenas.getStringMessageDigest(this.clave_user, encriptaCadenas.MD5));

                if (this.objUsuario != null) {
                    Mensaje.addMensajeInfo("Usuario logeado correctamente");
                    usuarioLogeado = true;
                    contex.getExternalContext().getSessionMap().put("usuario", this.objUsuario);
                    contex.getExternalContext().getSessionMap().put("isSesionAlive", this.usuarioLogeado);
                    contex.getExternalContext().getSessionMap().put("apellidos", this.objUsuario.getObjPersona().getApellidos());
                    contex.getExternalContext().getSessionMap().put("nombres", this.objUsuario.getObjPersona().getNombres());
                    contex.getExternalContext().getSessionMap().put("id_persona", this.objUsuario.getObjPersona().getId_persona());
                    contex.getExternalContext().getSessionMap().put("id_tipo_persona", this.objUsuario.getObjPersona().getObjTipoPersona().getId_tipo_persona());
                    contex.getExternalContext().getSessionMap().put("tipo_persona", this.objUsuario.getObjPersona().getObjTipoPersona().getNombre());
                    
                    //------------------- obtener funciones
                    PersonaFuncion objFunciones =  new PersonaFuncion();
                    objFunciones =  PersonaFuncion.getCargarFunciones_(objUsuario.getObjPersona().getId_persona());
                    contex.getExternalContext().getSessionMap().put("funciones", objFunciones.getFunciones());
                    
                    
                    outcome = Constantes.PAGE_PRINCIPAL_JSF;
                } else {
                    Mensaje.addMensajeError("Usuario o Password Incorrectos");
                    this.objUsuario = new Usuario();
                    this.nombre_user = "";
                    this.clave_user = "";
                    outcome = Constantes.PAGE_LOGIN_JSF;
                }
            } else {
                Mensaje.addMensajeError("Usuario o Password Incorrectos");
                this.objUsuario = new Usuario();
                this.nombre_user = "";
                this.clave_user = "";
                outcome = Constantes.PAGE_LOGIN_JSF;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return outcome + "?faces-redirect=true";
    }
    
    //---------------------------------------
    public void salirSistema() {
        FacesContext contex = FacesContext.getCurrentInstance();
        this.nombre_user = "";
        this.clave_user = "";
        String outcome = Constantes.PAGE_LOGIN_JSF;
        contex.getExternalContext().getSessionMap().clear();
        contex.getExternalContext().getSessionMap().put("usuario", null);
        contex.getExternalContext().getSessionMap().put("isSesionAlive", false);
        contex.getExternalContext().getSessionMap().put("apellidos", null);
        contex.getExternalContext().getSessionMap().put("nombres", null);
        contex.getExternalContext().getSessionMap().put("id_persona", null);
        contex.getExternalContext().getSessionMap().put("id_tipo_persona", null);
        contex.getExternalContext().getSessionMap().put("tipo_persona", null);
        contex.getExternalContext().getSessionMap().put("funciones", null);
        contex.getExternalContext().invalidateSession();

        try {
            contex.getExternalContext().redirect(outcome);
        } catch (IOException ex) {
            System.out.println("Error en el metodo por: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public String getPermisos(String param) {  
        FacesContext contex = FacesContext.getCurrentInstance();
        
        int cont = 0;
        
        if (contex.getExternalContext().getSessionMap().get("funciones") != null) {
            
            String funciones =  contex.getExternalContext().getSessionMap().get("funciones").toString();
            System.out.println("funciones_ses_: "+funciones);

            if (param.length() > 1)
            {
                String[] permite = param.split(",");

                for(int i = 0; i < permite.length; i++) {
                    if (funciones.indexOf(permite[i].toString()) > -1)
                    {
                        cont++;
                    } 
                }
            }else
            {
                //---------------
                if (funciones.indexOf(param) > -1)
                {
                    cont++;
                }
            }
            System.out.println("cont : "+cont);
            
        }
        
        return ""+cont;
    }
    
}
