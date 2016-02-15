package entidades;

import java.util.Date;

/**
 * Created by Bairon on 12/02/2016.
 */
public class syc_modulos_usr extends syc_modulos{

    private String syc_usu_codigo;
    private String syc_mod_usr_estado;

    public syc_modulos_usr(String syc_mod_codigo, String syc_mod_descripcion, String syc_mod_estado, Date syc_mod_fecha_act, Date syc_mod_fecha_val, String syc_mod_serial_act, String syc_mod_serial_val) {
        super(syc_mod_codigo, syc_mod_descripcion, syc_mod_estado, syc_mod_fecha_act, syc_mod_fecha_val, syc_mod_serial_act, syc_mod_serial_val);
        syc_usu_codigo = syc_usu_codigo;
        syc_mod_usr_estado = syc_mod_usr_estado;
    }


    public String getSyc_usu_codigo() {
        return syc_usu_codigo;
    }

    public void setSyc_usu_codigo(String syc_usu_codigo) {
        this.syc_usu_codigo = syc_usu_codigo;
    }

    public String getSyc_mod_usr_estado() {
        return syc_mod_usr_estado;
    }

    public void setSyc_mod_usr_estado(String syc_mod_usr_estado) {
        this.syc_mod_usr_estado = syc_mod_usr_estado;
    }
}
