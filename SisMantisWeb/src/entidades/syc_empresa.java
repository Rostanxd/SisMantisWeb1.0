package entidades;

import java.io.InputStream;

/**
 * Created by RoStan on 22/01/2016.
 */
public class syc_empresa {
    private int syc_emp_codigo;
    private String syc_emp_ruc;
    private char syc_emp_estado;
    private String syc_emp_descripcion;
    private String syc_emp_telefono;
    private String syc_emp_telefono_alt;
    private String syc_emp_direccion;
    private String syc_emp_pagina_web;
    private String syc_emp_email;
    private InputStream syc_emp_logo;
    private int logoLongitud;
    private String syc_emp_creacion_usr;
    private String syc_emp_actualiza_usr;
    private char syc_emp_tipo_emp;
    private String syc_emp_creacion_fec;
    private String syc_emp_actualiza_fec;


    public syc_empresa(int codEmp, String descripcion){
        this.syc_emp_codigo         =   codEmp;
        this.syc_emp_descripcion    =   descripcion;
    }

    public syc_empresa(int codigo, String ruc, char estado, String descrip, String tel, String telAlt, String direccion, String pagWeb, String email, InputStream logo,
                       int longitud, String creaUsu, String actUsu, char tipo, String creaFec, String actFec){
        this.syc_emp_codigo = codigo;
        this.syc_emp_ruc = ruc;
        this.syc_emp_estado =   estado;
        this.syc_emp_descripcion = descrip;
        this.syc_emp_telefono = tel;
        this.syc_emp_telefono_alt = telAlt;
        this.syc_emp_direccion = direccion;
        this.syc_emp_pagina_web = pagWeb;
        this.syc_emp_email = email;
        this.syc_emp_logo = logo;
        this.logoLongitud = longitud;
        this.syc_emp_creacion_usr = creaUsu;
        this.syc_emp_actualiza_usr = actUsu;
        this.syc_emp_tipo_emp = tipo;
        this.syc_emp_creacion_fec = creaFec;
        this.syc_emp_actualiza_fec = actFec;
    }

    /**
     * @return the syc_emp_codigo
     */
    public int getSyc_emp_codigo() {
        return syc_emp_codigo;
    }

    /**
     * @param syc_emp_codigo the syc_emp_codigo to set
     */
    public void setSyc_emp_codigo(int syc_emp_codigo) {
        this.syc_emp_codigo = syc_emp_codigo;
    }

    /**
     * @return the syc_emp_ruc
     */
    public String getSyc_emp_ruc() {
        return syc_emp_ruc;
    }

    /**
     * @param syc_emp_ruc the syc_emp_ruc to set
     */
    public void setSyc_emp_ruc(String syc_emp_ruc) {
        this.syc_emp_ruc = syc_emp_ruc;
    }

    /**
     * @return the syc_emp_estado
     */
    public char getSyc_emp_estado() {
        return syc_emp_estado;
    }

    /**
     * @param syc_emp_estado the syc_emp_estado to set
     */
    public void setSyc_emp_estado(char syc_emp_estado) {
        this.syc_emp_estado = syc_emp_estado;
    }

    /**
     * @return the syc_emp_descripcion
     */
    public String getSyc_emp_descripcion() {
        return syc_emp_descripcion;
    }

    /**
     * @param syc_emp_descripcion the syc_emp_descripcion to set
     */
    public void setSyc_emp_descripcion(String syc_emp_descripcion) {
        this.syc_emp_descripcion = syc_emp_descripcion;
    }

    /**
     * @return the syc_emp_telefono
     */
    public String getSyc_emp_telefono() {
        return syc_emp_telefono;
    }

    /**
     * @param syc_emp_telefono the syc_emp_telefono to set
     */
    public void setSyc_emp_telefono(String syc_emp_telefono) {
        this.syc_emp_telefono = syc_emp_telefono;
    }

    /**
     * @return the syc_emp_telefono_alt
     */
    public String getSyc_emp_telefono_alt() {
        return syc_emp_telefono_alt;
    }

    /**
     * @param syc_emp_telefono_alt the syc_emp_telefono_alt to set
     */
    public void setSyc_emp_telefono_alt(String syc_emp_telefono_alt) {
        this.syc_emp_telefono_alt = syc_emp_telefono_alt;
    }

    /**
     * @return the syc_emp_direccion
     */
    public String getSyc_emp_direccion() {
        return syc_emp_direccion;
    }

    /**
     * @param syc_emp_direccion the syc_emp_direccion to set
     */
    public void setSyc_emp_direccion(String syc_emp_direccion) {
        this.syc_emp_direccion = syc_emp_direccion;
    }

    /**
     * @return the syc_emp_pagina_web
     */
    public String getSyc_emp_pagina_web() {
        return syc_emp_pagina_web;
    }

    /**
     * @param syc_emp_pagina_web the syc_emp_pagina_web to set
     */
    public void setSyc_emp_pagina_web(String syc_emp_pagina_web) {
        this.syc_emp_pagina_web = syc_emp_pagina_web;
    }

    /**
     * @return the syc_emp_email
     */
    public String getSyc_emp_email() {
        return syc_emp_email;
    }

    /**
     * @param syc_emp_email the syc_emp_email to set
     */
    public void setSyc_emp_email(String syc_emp_email) {
        this.syc_emp_email = syc_emp_email;
    }

    /**
     * @return the syc_emp_logo
     */
    public InputStream getSyc_emp_logo() {
        return syc_emp_logo;
    }

    /**
     * @param syc_emp_logo the syc_emp_logo to set
     */
    public void setSyc_emp_logo(InputStream syc_emp_logo) {
        this.syc_emp_logo = syc_emp_logo;
    }

    /**
     * @return the syc_emp_creacion_usr
     */
    public String getSyc_emp_creacion_usr() {
        return syc_emp_creacion_usr;
    }

    /**
     * @param syc_emp_creacion_usr the syc_emp_creacion_usr to set
     */
    public void setSyc_emp_creacion_usr(String syc_emp_creacion_usr) {
        this.syc_emp_creacion_usr = syc_emp_creacion_usr;
    }

    /**
     * @return the syc_emp_actualiza_usr
     */
    public String getSyc_emp_actualiza_usr() {
        return syc_emp_actualiza_usr;
    }

    /**
     * @param syc_emp_actualiza_usr the syc_emp_actualiza_usr to set
     */
    public void setSyc_emp_actualiza_usr(String syc_emp_actualiza_usr) {
        this.syc_emp_actualiza_usr = syc_emp_actualiza_usr;
    }

    /**
     * @return the syc_emp_tipo_emp
     */
    public char getSyc_emp_tipo_emp() {
        return syc_emp_tipo_emp;
    }

    /**
     * @param syc_emp_tipo_emp the syc_emp_tipo_emp to set
     */
    public void setSyc_emp_tipo_emp(char syc_emp_tipo_emp) {
        this.syc_emp_tipo_emp = syc_emp_tipo_emp;
    }

    /**
     * @return the syc_emp_creacion_fec
     */
    public String getSyc_emp_creacion_fec() {
        return syc_emp_creacion_fec;
    }

    /**
     * @param syc_emp_creacion_fec the syc_emp_creacion_fec to set
     */
    public void setSyc_emp_creacion_fec(String syc_emp_creacion_fec) {
        this.syc_emp_creacion_fec = syc_emp_creacion_fec;
    }

    /**
     * @return the syc_emp_actualiza_fec
     */
    public String getSyc_emp_actualiza_fec() {
        return syc_emp_actualiza_fec;
    }

    /**
     * @param syc_emp_actualiza_fec the syc_emp_actualiza_fec to set
     */
    public void setSyc_emp_actualiza_fec(String syc_emp_actualiza_fec) {
        this.syc_emp_actualiza_fec = syc_emp_actualiza_fec;
    }

    /**
     * @return the logoLongitud
     */
    public int getLogoLongitud() {
        return logoLongitud;
    }

    /**
     * @param logoLongitud the logoLongitud to set
     */
    public void setLogoLongitud(int logoLongitud) {
        this.logoLongitud = logoLongitud;
    }
}
