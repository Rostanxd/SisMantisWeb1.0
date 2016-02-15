package entidades;

import java.util.Date;

/**
 * Created by Bairon on 12/02/2016.
 */
public class syc_usuarios_epr extends syc_usuarios {

    private String syc_emp_codigo;
    private String syc_per_codigo;
    private String syc_uxe_creacion;
    private Date syc_uxe_fex_creacion;
    private String syc_uxe_actualiza;
    private Date syc_uxe_fex_actualiza;
    private String syc_uxe_estado;

    public syc_usuarios_epr(String codigo, String clave, String apellido, String nombre, char estado, char tipo, String email, String fecCre, String usuCre, String fecAct, String usuAct) {
        super(codigo, clave, apellido, nombre, estado, tipo, email, fecCre, usuCre, fecAct, usuAct);
        syc_emp_codigo = syc_emp_codigo;
        syc_per_codigo = syc_per_codigo;
        syc_uxe_creacion = syc_uxe_creacion;
        syc_uxe_fex_creacion = syc_uxe_fex_creacion;
        syc_uxe_actualiza = syc_uxe_actualiza;
        syc_uxe_fex_actualiza = syc_uxe_fex_actualiza;
        syc_uxe_estado = syc_uxe_estado;
    }

    public String getSyc_emp_codigo() {
        return syc_emp_codigo;
    }

    public void setSyc_emp_codigo(String syc_emp_codigo) {
        this.syc_emp_codigo = syc_emp_codigo;
    }

    public String getSyc_per_codigo() {
        return syc_per_codigo;
    }

    public void setSyc_per_codigo(String syc_per_codigo) {
        this.syc_per_codigo = syc_per_codigo;
    }

    public String getSyc_uxe_creacion() {
        return syc_uxe_creacion;
    }

    public void setSyc_uxe_creacion(String syc_uxe_creacion) {
        this.syc_uxe_creacion = syc_uxe_creacion;
    }

    public Date getSyc_uxe_fex_creacion() {
        return syc_uxe_fex_creacion;
    }

    public void setSyc_uxe_fex_creacion(Date syc_uxe_fex_creacion) {
        this.syc_uxe_fex_creacion = syc_uxe_fex_creacion;
    }

    public String getSyc_uxe_actualiza() {
        return syc_uxe_actualiza;
    }

    public void setSyc_uxe_actualiza(String syc_uxe_actualiza) {
        this.syc_uxe_actualiza = syc_uxe_actualiza;
    }

    public Date getSyc_uxe_fex_actualiza() {
        return syc_uxe_fex_actualiza;
    }

    public void setSyc_uxe_fex_actualiza(Date syc_uxe_fex_actualiza) {
        this.syc_uxe_fex_actualiza = syc_uxe_fex_actualiza;
    }

    public String getSyc_uxe_estado() {
        return syc_uxe_estado;
    }

    public void setSyc_uxe_estado(String syc_uxe_estado) {
        this.syc_uxe_estado = syc_uxe_estado;
    }
}
