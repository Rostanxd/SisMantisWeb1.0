package dataBase;

import entidades.syc_empresa;
import entidades.syc_usuarios;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by RoStan on 22/01/2016.
 */
public class syc extends conexion {

    void syc(){}

    public String nombreUsuario(String usuCodigo){
        String usu = "";

        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = getCon().prepareStatement("USE [db_ConfigEmp] SELECT * FROM syc_usuarios WHERE syc_usu_codigo = ?");
            st.setString(1,usuCodigo);
            rs = st.executeQuery();
            while(rs.next()){
                String apellidos = rs.getString("syc_usu_apellidos");
                String nombres = rs.getString("syc_usu_nombres");
                usu = nombres+" "+apellidos;
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return usu;

    }

    public ArrayList<syc_usuarios> usuariosEmpresa(String codigo, String nombre){
        ArrayList<syc_usuarios> usu =   new ArrayList<syc_usuarios>();
        ResultSet rs = null;
        PreparedStatement st = null;
        try{
            if (codigo.equals("TODOS")) {
                st = this.getCon().prepareStatement("USE [db_Empresa] SELECT* FROM syc_usuarios;");
            }else{
                st = getCon().prepareStatement("USE[db_Empresa] SELECT * FROM syc_usuarios WHERE syc_usu_codigo LIKE ? AND syc_usu_estado = 'A'");
                st.setString(1,"%"+codigo+"%");
                rs = st.executeQuery();
            }
            while(rs.next()){
                String code = rs.getString("syc_usu_codigo");
                String apellidos = rs.getString("syc_usu_apellidos");
                String nombres = rs.getString("syc_usu_nombres");
                String estado = rs.getString("syc_usu_estado");
                syc_usuarios u = new syc_usuarios(code,apellidos,nombres,estado.charAt(0));
                usu.add(u);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return usu;

    }   // Fin metodo nombreUsuario

    public boolean verificaCodigoUsu(String codigo){
        boolean result  =   true;

        ResultSet rs = null;
        PreparedStatement st = null;
        System.out.println(codigo);

        try{
            st = getCon().prepareStatement("USE [db_Empresa] SELECT* FROM syc_usuarios WHERE syc_usu_codigo = ? AND syc_usu_estado = 'A'");
            st.setString(1,codigo);
            rs = st.executeQuery();
            if (rs.next()){
                result = false;
            }
            rs.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return result;
    }

    public boolean ingresoUsuario(syc_usuarios u){
        boolean result = false;
        ResultSet rs = null;
        PreparedStatement st = null;

        try{
            st = getCon().prepareStatement("USE [db_Empresa] INSERT INTO syc_usuarios(syc_usu_codigo,syc_usu_clave,syc_usu_apellidos,syc_usu_nombres,syc_usu_estado,"
                    + "syc_usu_tipo,syc_usu_email,syc_usu_creacion_fec,syc_usu_creacion_usr,syc_usu_actualiza_fec,syc_usu_actualiza_usr) VALUES (?,?,?,?,?,?,?,?,?,?,?)" );
            st.setString(1,u.getSyc_usu_codigo());
            st.setString(2,u.getSyc_usu_clave());
            st.setString(3,u.getSyc_usu_apellidos());
            st.setString(4,u.getSyc_usu_nombres());
            st.setString(5,String.valueOf(u.getSyc_usu_estado()));
            st.setString(6,String.valueOf(u.getSyc_usu_tipo()));
            st.setString(7,u.getSyc_usu_email());
            st.setString(8,u.getSyc_usu_creacion_fec());
            st.setString(9,u.getSyc_usu_creacion_usr());
            st.setString(10,u.getSyc_usu_actualiza_fec());
            st.setString(11,u.getSyc_usu_actualiza_usr());

            st.executeUpdate();
            st.close();

            result = true;
        }catch(Exception e){
            System.out.println("Error INSERT: "+e.toString());
            result = false;
        }
        return result;
    }

    public ArrayList<syc_usuarios> consultarUsuario(String codigo){
        ArrayList<syc_usuarios> resultado = new ArrayList<syc_usuarios>();

        ResultSet rs = null;
        PreparedStatement st = null;

        try{
            st = getCon().prepareStatement("USE [db_Empresa] SELECT* FROM syc_usuarios WHERE syc_usu_codigo = ? AND syc_usu_estado = 'A'");
            st.setString(1,codigo);
            rs = st.executeQuery();
            while(rs.next())
            {
                String code     =   rs.getString("syc_usu_codigo");
                String clave    =   rs.getString("syc_usu_clave");
                String apellido =   rs.getString("syc_usu_apellidos");
                String nombre   =   rs.getString("syc_usu_nombres");
                String estado   =   rs.getString("syc_usu_estado");
                String tipo     =   rs.getString("syc_usu_tipo");
                String email    =   rs.getString("syc_usu_email");
                String fecCrea  =   rs.getString("syc_usu_creacion_fec");
                String usuCrea  =   rs.getString("syc_usu_creacion_usr");
                String fecAct   =   rs.getString("syc_usu_actualiza_fec");
                String usuAct   =   rs.getString("syc_usu_actualiza_usr");

                syc_usuarios usu = new syc_usuarios(codigo,clave,apellido,nombre,estado.charAt(0),tipo.charAt(0),email,fecCrea,usuCrea,fecAct,usuAct);

                resultado.add(usu);

            }
            st.close();
            rs.close();

        }catch(Exception e){
            System.out.println(e.toString());
        }
        return resultado;
    }

    public boolean eliminarUsuarioLog(String codUsuario){
        boolean result = false;
        PreparedStatement st = null;
        try{
            st = getCon().prepareStatement("USE[db_Empresa] UPDATE syc_usuarios SET syc_usu_estado = 'I' WHERE syc_usu_codigo = ?");
            st.setString(1,codUsuario);
            st.executeUpdate();
            st.close();
            result = true;
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return result;
    }

    public ArrayList<syc_empresa> consultarEmpresa(int codEmpresa){
        ArrayList<syc_empresa> emp = new ArrayList<syc_empresa>();

        ResultSet rs = null;
        PreparedStatement st = null;
        System.out.println(codEmpresa);
        try{
            st = getCon().prepareStatement("USE[db_Empresa] SELECT* FROM syc_empresas WHERE syc_emp_codigo = ?");
            st.setInt(1,codEmpresa);
            rs = st.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("syc_emp_codigo");
                String ruc = rs.getString("syc_emp_ruc");
                String estado = rs.getString("syc_emp_estado");
                String descripcion = rs.getString("syc_emp_descripcion");
                String tel = rs.getString("syc_emp_telefono");
                String telAlt = rs.getString("syc_emp_telefono_alt");
                String dir = rs.getString("syc_emp_direccion");
                String pagWeb = rs.getString("syc_emp_pagina_web");
                String email = rs.getString("syc_emp_email");
                InputStream logo = rs.getBinaryStream("syc_emp_logo");
                String creUsu = rs.getString("syc_emp_creacion_usr");
                String actUsu = rs.getString("syc_emp_actualiza_usr");
                String tipo = rs.getString("syc_emp_tipo_emp");
                String creFec = rs.getString("syc_emp_creacion_fec");
                String actFec = rs.getString("syc_emp_actualiza_fec");

                syc_empresa e = new syc_empresa(codigo,ruc,estado.charAt(0),descripcion,tel,telAlt,dir,pagWeb,email,logo,0,creUsu,actUsu,tipo.charAt(0),creFec,actFec);

                emp.add(e);

            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

        return emp;
    }

    public boolean editarEmpresa(syc_empresa emp){
        boolean result = false;
        try{
            PreparedStatement st = null;
            st = getCon().prepareStatement("USE[db_Empresa] UPDATE syc_empresas SET syc_emp_ruc = ?, syc_emp_estado = ?, syc_emp_descripcion = ?, "
                    + "syc_emp_telefono = ?, syc_emp_telefono_alt = ?, syc_emp_direccion = ?, syc_emp_pagina_web = ?, syc_emp_email = ?, syc_emp_logo = ?, "
                    + "syc_emp_creacion_usr = ?, syc_emp_actualiza_usr = ?, syc_emp_tipo_emp = ?, syc_emp_creacion_fec = ?, syc_emp_actualiza_fec = ? WHERE syc_emp_codigo = ?");
            st.setString(1,emp.getSyc_emp_ruc());
            st.setString(2,String.valueOf(emp.getSyc_emp_estado()));
            st.setString(3,emp.getSyc_emp_descripcion());
            st.setString(4,emp.getSyc_emp_telefono());
            st.setString(5,emp.getSyc_emp_telefono_alt());
            st.setString(6,emp.getSyc_emp_direccion());
            st.setString(7,emp.getSyc_emp_pagina_web());
            st.setString(8,emp.getSyc_emp_email());
            st.setBinaryStream(9,emp.getSyc_emp_logo(),emp.getLogoLongitud());
            st.setString(10,emp.getSyc_emp_creacion_usr());
            st.setString(11,emp.getSyc_emp_actualiza_usr());
            st.setString(12,String.valueOf(emp.getSyc_emp_tipo_emp()));
            st.setString(13,emp.getSyc_emp_creacion_fec());
            st.setString(14,emp.getSyc_emp_actualiza_fec());

            st.setInt(15,emp.getSyc_emp_codigo());   //  codigo de la syc_empresa con el que hace el WHERE

            st.executeUpdate();
            st.close();

            result = true;
        }catch(Exception e){
            System.out.println(e.toString());
            result = false;
        }

        return result;
    }

    public boolean editarUsuario(syc_usuarios u){
        boolean result = false;
        ResultSet rs = null;
        PreparedStatement st = null;

        try{
            st = getCon().prepareStatement("USE [db_Empresa] UPDATE syc_usuarios SET syc_usu_clave = ?,syc_usu_apellidos = ?, syc_usu_nombres = ?, syc_usu_estado = ?,"
                    + "syc_usu_tipo = ?,syc_usu_email = ?,syc_usu_creacion_fec = ?,syc_usu_creacion_usr = ?,syc_usu_actualiza_fec = ?,syc_usu_actualiza_usr =? WHERE syc_usu_codigo = ?" );

            st.setString(1,u.getSyc_usu_clave());
            st.setString(2,u.getSyc_usu_apellidos());
            st.setString(3,u.getSyc_usu_nombres());
            st.setString(4,String.valueOf(u.getSyc_usu_estado()));
            st.setString(5,String.valueOf(u.getSyc_usu_tipo()));
            st.setString(6,u.getSyc_usu_email());
            st.setString(7,u.getSyc_usu_creacion_fec());
            st.setString(8,u.getSyc_usu_creacion_usr());
            st.setString(9,u.getSyc_usu_actualiza_fec());
            st.setString(10,u.getSyc_usu_actualiza_usr());

            st.setString(11,u.getSyc_usu_codigo());

            st.executeUpdate();
            st.close();

            result = true;
        }catch(Exception e){
            System.out.println("Error INSERT: "+e.toString());
            result = false;
        }
        return result;
    }
}
