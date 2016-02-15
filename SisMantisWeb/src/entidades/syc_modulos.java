package entidades;

import java.util.Date;

/**
 * Created by Bairon on 12/02/2016.
 */
public class syc_modulos {
    private String syc_mod_codigo;
    private String syc_mod_descripcion;
    private String syc_mod_estado;
    private Date syc_mod_fecha_act;
    private Date syc_mod_fecha_val;
    private String syc_mod_serial_act;
    private String syc_mod_serial_val;

    public syc_modulos(String syc_mod_codigo, String syc_mod_descripcion, String syc_mod_estado, Date syc_mod_fecha_act, Date syc_mod_fecha_val, String syc_mod_serial_act, String syc_mod_serial_val) {
        this.syc_mod_codigo = syc_mod_codigo;
        this.syc_mod_descripcion = syc_mod_descripcion;
        this.syc_mod_estado = syc_mod_estado;
        this.syc_mod_fecha_act = syc_mod_fecha_act;
        this.syc_mod_fecha_val = syc_mod_fecha_val;
        this.syc_mod_serial_act = syc_mod_serial_act;
        this.syc_mod_serial_val = syc_mod_serial_val;
    }


    public String getSyc_mod_codigo() {
        return syc_mod_codigo;
    }

    public void setSyc_mod_codigo(String syc_mod_codigo) {
        this.syc_mod_codigo = syc_mod_codigo;
    }

    public String getSyc_mod_descripcion() {
        return syc_mod_descripcion;
    }

    public void setSyc_mod_descripcion(String syc_mod_descripcion) {
        this.syc_mod_descripcion = syc_mod_descripcion;
    }

    public String getSyc_mod_estado() {
        return syc_mod_estado;
    }

    public void setSyc_mod_estado(String syc_mod_estado) {
        this.syc_mod_estado = syc_mod_estado;
    }

    public Date getSyc_mod_fecha_act() {
        return syc_mod_fecha_act;
    }

    public void setSyc_mod_fecha_act(Date syc_mod_fecha_act) {
        this.syc_mod_fecha_act = syc_mod_fecha_act;
    }

    public Date getSyc_mod_fecha_val() {
        return syc_mod_fecha_val;
    }

    public void setSyc_mod_fecha_val(Date syc_mod_fecha_val) {
        this.syc_mod_fecha_val = syc_mod_fecha_val;
    }

    public String getSyc_mod_serial_act() {
        return syc_mod_serial_act;
    }

    public void setSyc_mod_serial_act(String syc_mod_serial_act) {
        this.syc_mod_serial_act = syc_mod_serial_act;
    }

    public String getSyc_mod_serial_val() {
        return syc_mod_serial_val;
    }

    public void setSyc_mod_serial_val(String syc_mod_serial_val) {
        this.syc_mod_serial_val = syc_mod_serial_val;
    }
}
