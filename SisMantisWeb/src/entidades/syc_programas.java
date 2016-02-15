package entidades;

/**
 * Created by Bairon on 12/02/2016.
 */
public class syc_programas {
    private String syc_prg_codigo;
    private String syc_mod_codigo;
    private String syc_prg_descripcion;
    private String syc_prg_abreviatura;
    private String syc_prg_tipo;
    private String syc_prg_objeto;
    private String syc_prg_programa;

    public syc_programas(String syc_prg_codigo, String syc_mod_codigo, String syc_prg_descripcion, String syc_prg_abreviatura, String syc_prg_tipo, String syc_prg_objeto, String syc_prg_programa) {
        this.syc_prg_codigo = syc_prg_codigo;
        this.syc_mod_codigo = syc_mod_codigo;
        this.syc_prg_descripcion = syc_prg_descripcion;
        this.syc_prg_abreviatura = syc_prg_abreviatura;
        this.syc_prg_tipo = syc_prg_tipo;
        this.syc_prg_objeto = syc_prg_objeto;
        this.syc_prg_programa = syc_prg_programa;
    }


    public String getSyc_prg_codigo() {
        return syc_prg_codigo;
    }

    public void setSyc_prg_codigo(String syc_prg_codigo) {
        this.syc_prg_codigo = syc_prg_codigo;
    }

    public String getSyc_mod_codigo() {
        return syc_mod_codigo;
    }

    public void setSyc_mod_codigo(String syc_mod_codigo) {
        this.syc_mod_codigo = syc_mod_codigo;
    }

    public String getSyc_prg_descripcion() {
        return syc_prg_descripcion;
    }

    public void setSyc_prg_descripcion(String syc_prg_descripcion) {
        this.syc_prg_descripcion = syc_prg_descripcion;
    }

    public String getSyc_prg_abreviatura() {
        return syc_prg_abreviatura;
    }

    public void setSyc_prg_abreviatura(String syc_prg_abreviatura) {
        this.syc_prg_abreviatura = syc_prg_abreviatura;
    }

    public String getSyc_prg_tipo() {
        return syc_prg_tipo;
    }

    public void setSyc_prg_tipo(String syc_prg_tipo) {
        this.syc_prg_tipo = syc_prg_tipo;
    }

    public String getSyc_prg_objeto() {
        return syc_prg_objeto;
    }

    public void setSyc_prg_objeto(String syc_prg_objeto) {
        this.syc_prg_objeto = syc_prg_objeto;
    }

    public String getSyc_prg_programa() {
        return syc_prg_programa;
    }

    public void setSyc_prg_programa(String syc_prg_programa) {
        this.syc_prg_programa = syc_prg_programa;
    }
}
