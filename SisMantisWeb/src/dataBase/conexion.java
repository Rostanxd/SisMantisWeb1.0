package dataBase;

import entidades.syc_empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by RoStan on 22/01/2016.
 */

public class conexion {
    private Connection con;
    private static final String DRIVER      =   "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DBMS        =   "sqlserver";
    private static final String HOST        =   "localhost";
    private static final String PORT        =   "1433";
    private static final String DATABASE    =   "db_ConfigEmp";
    private static final String USER        =   "";
    private static final String PASSWORD    =   "";

    void Conexion(){}

    // Metodo para conectar a la Base de Datos de la syc_empresa

    public void conectar ()throws Exception{

        try{
            Class.forName(DRIVER);
            this.setCon(DriverManager.getConnection("jdbc:" + DBMS + "://"+HOST + ":" + PORT + ";databaseName=" + DATABASE + ";integratedSecurity=true;"));

            System.out.println("OK: LA CONEXION A LA BASE DE DATOS ES UN EXITO");

        }catch(Exception e){
            System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+e);
            throw e;
        }
        //System.out.println("CONEXION EXITOSA CON LA BASE DE DATOS");
    }

    // Metodo para desconectar de la Base de Datos
    public boolean desconectar()
    {
        try
        {
            this.getCon().close();
            System.out.println("HA SIDO DESCONECTADO DE LA BASE DE DATOS");
            return(true);
        }
        catch(Exception e)
        {
            return(false);
        }
    }

    public boolean verificaUsuario(String usuario, String pass){
        boolean resultado = false;
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = getCon().prepareStatement("USE [db_Empresa] " +
                    "SELECT* FROM syc_usuarios " +
                    "WHERE syc_usu_codigo = ? AND syc_usu_clave = ? AND syc_usu_estado = 'A'");
            st.setString(1,usuario);
            st.setString(2,pass);
            rs = st.executeQuery();
            if(rs.next()){
                resultado = true;
            }
            rs.close();
            st.close();

        }catch(Exception e){
            System.out.println("Error: "+e.toString());
        }
        return resultado;
    }

    public boolean verificaModulo(String modulo, String usuario){
        boolean resultado = false;
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = getCon().prepareStatement("USE [db_Empresa] SELECT* FROM syc_modulos_usr WHERE syc_mod_codigo = ? AND syc_usu_codigo = ? AND syc_mod_usr_estado = 'A'");
            st.setString(1,modulo);
            st.setString(2,usuario);
            rs = st.executeQuery();
            if(rs.next()){
                resultado = true;
            }
            rs.close();
            st.close();
        }catch(Exception e){
        }
        return resultado;
    }

    public String nombreModulo(String abv){
        String modulo = "";

        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = getCon().prepareStatement("USE [db_Empresa] SELECT* FROM syc_modulos WHERE syc_mod_codigo = ?");
            st.setString(1,abv);
            rs = st.executeQuery();
            while(rs.next()){
                modulo = rs.getString("syc_mod_descripcion");
            }
            rs.close();
            st.close();
        }catch(Exception e){
        }
        return modulo;
    }

    // Metodo para saber la fecha del servidor.
    public String serverDate(){
        String server = "";

        Calendar dateTime = Calendar.getInstance();

        int anio    = dateTime.get(Calendar.YEAR);
        int mes     = dateTime.get(Calendar.MONTH);
        int day     = dateTime.get(Calendar.DAY_OF_MONTH);
        int hour    = dateTime.get(Calendar.HOUR_OF_DAY);
        int minute  = dateTime.get(Calendar.MINUTE);
        int second  = dateTime.get(Calendar.SECOND);

        server = (""+anio+"/"+(mes+1)+"/"+day+" "+hour+":"+minute+":"+second+"");

        return server;
    }

    public ArrayList<syc_empresa> escojaEmpresa(String codUsu){
        ArrayList<syc_empresa> emp = new ArrayList<syc_empresa>();

        ResultSet rs = null;
        PreparedStatement st = null;

        try{
            st = getCon().prepareStatement("USE [db_Empresa] DECLARE @emp int SET @emp = (SELECT syc_emp_codigo FROM syc_usuarios_epr WHERE syc_usu_codigo = ?)"+
                    "SELECT* FROM syc_empresas WHERE syc_emp_codigo = @emp");

            st.setString(1,codUsu);
            rs = st.executeQuery();
            while(rs.next()){
                String  empDescripcion = rs.getString("syc_emp_descripcion");
                int  empCodigo = rs.getInt("syc_emp_codigo");
                syc_empresa e = new syc_empresa(empCodigo,empDescripcion);
                emp.add(e);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return emp;
    }

    public int codEmpresa(String des){
        int codEmp = 0;
        ResultSet rs = null;
        PreparedStatement st = null;

        try{
            st = getCon().prepareStatement("USE [db_Empresa] SELECT* FROM syc_empresas WHERE syc_emp_descripcion = ?");
            st.setString(1,des);
            rs = st.executeQuery();
            while(rs.next()){
                codEmp = rs.getInt("syc_emp_codigo");
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return codEmp;
    }

    public String desEmpresa(int codigo){
        String des = "";
        ResultSet rs = null;
        PreparedStatement st = null;
        try{
            st = getCon().prepareStatement("USE[db_Empresa] SELECT* FROM syc_empresas WHERE syc_emp_codigo = ?");
            st.setInt(1,codigo);
            rs = st.executeQuery();
            while(rs.next()){
                des = rs.getString("syc_emp_descripcion");
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return des;
    }


    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }
}
