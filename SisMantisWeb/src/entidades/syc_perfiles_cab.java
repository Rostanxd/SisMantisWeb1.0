package entidades;

/**
 * Created by Bairon on 12/02/2016.
 */
public class syc_perfiles_cab {
    private String syc_per_codigo;
    private String syc_per_descripcion;
    private String syc_per_estado;

    public syc_perfiles_cab(String syc_per_codigo, String syc_per_descripcion, String syc_per_estado) {
        this.syc_per_codigo = syc_per_codigo;
        this.syc_per_descripcion = syc_per_descripcion;
        this.syc_per_estado = syc_per_estado;
    }


    public String getSyc_per_codigo() {
        return syc_per_codigo;
    }

    public void setSyc_per_codigo(String syc_per_codigo) {
        this.syc_per_codigo = syc_per_codigo;
    }

    public String getSyc_per_descripcion() {
        return syc_per_descripcion;
    }

    public void setSyc_per_descripcion(String syc_per_descripcion) {
        this.syc_per_descripcion = syc_per_descripcion;
    }

    public String getSyc_per_estado() {
        return syc_per_estado;
    }

    public void setSyc_per_estado(String syc_per_estado) {
        this.syc_per_estado = syc_per_estado;
    }
}
