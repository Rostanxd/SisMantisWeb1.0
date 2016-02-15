package entidades;

/**
 * Created by Bairon on 12/02/2016.
 */
public class syc_perfiles_det extends syc_perfiles_cab{

    private String syc_prg_codigo;
    private boolean syc_acc_nuevo;
    private boolean syc_acc_modificar;
    private boolean syc_acc_procesar;
    private boolean syc_acc_anular;
    private boolean syc_acc_imprimir;
    private boolean syc_acc_consultar;

    public syc_perfiles_det(String syc_per_codigo, String syc_per_descripcion, String syc_per_estado) {
        super(syc_per_codigo, syc_per_descripcion, syc_per_estado);

        syc_acc_nuevo = syc_acc_nuevo;
        syc_acc_modificar = syc_acc_modificar;
        syc_acc_procesar = syc_acc_procesar;
        syc_acc_anular = syc_acc_anular;
        syc_acc_imprimir = syc_acc_imprimir;
        syc_acc_consultar = syc_acc_consultar;
    }

    public String getSyc_prg_codigo() {
        return syc_prg_codigo;
    }

    public void setSyc_prg_codigo(String syc_prg_codigo) {
        this.syc_prg_codigo = syc_prg_codigo;
    }

    public boolean isSyc_acc_nuevo() {
        return syc_acc_nuevo;
    }

    public void setSyc_acc_nuevo(boolean syc_acc_nuevo) {
        this.syc_acc_nuevo = syc_acc_nuevo;
    }

    public boolean isSyc_acc_modificar() {
        return syc_acc_modificar;
    }

    public void setSyc_acc_modificar(boolean syc_acc_modificar) {
        this.syc_acc_modificar = syc_acc_modificar;
    }

    public boolean isSyc_acc_procesar() {
        return syc_acc_procesar;
    }

    public void setSyc_acc_procesar(boolean syc_acc_procesar) {
        this.syc_acc_procesar = syc_acc_procesar;
    }

    public boolean isSyc_acc_anular() {
        return syc_acc_anular;
    }

    public void setSyc_acc_anular(boolean syc_acc_anular) {
        this.syc_acc_anular = syc_acc_anular;
    }

    public boolean isSyc_acc_imprimir() {
        return syc_acc_imprimir;
    }

    public void setSyc_acc_imprimir(boolean syc_acc_imprimir) {
        this.syc_acc_imprimir = syc_acc_imprimir;
    }

    public boolean isSyc_acc_consultar() {
        return syc_acc_consultar;
    }

    public void setSyc_acc_consultar(boolean syc_acc_consultar) {
        this.syc_acc_consultar = syc_acc_consultar;
    }
}
