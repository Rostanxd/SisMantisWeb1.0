package entidades;

/**
 * Created by RoStan on 22/01/2016.
 */
public class syc_usuarios {
    private String  syc_usu_codigo;
    private String  syc_usu_clave;
    private String  syc_usu_apellidos;
    private String  syc_usu_nombres;
    private char    syc_usu_estado;
    private char    syc_usu_tipo;
    private String  syc_usu_email;
    private String  syc_usu_creacion_fec;
    private String  syc_usu_creacion_usr;
    private String  syc_usu_actualiza_fec;
    private String  syc_usu_actualiza_usr;

    public syc_usuarios(String codigo, String apellido, String nombre, char estado){
        this.syc_usu_codigo     =   codigo;
        this.syc_usu_apellidos  =   apellido;
        this.syc_usu_nombres    =   nombre;
        this.syc_usu_estado     =   estado;
    }

    public syc_usuarios(String codigo, String clave, String apellido, String nombre,
                        String email){
        this.syc_usu_codigo     =   codigo;
        this.syc_usu_clave      =   clave;
        this.syc_usu_apellidos  =   apellido;
        this.syc_usu_nombres    =   nombre;
        this.syc_usu_email      =   email;
    }

    public syc_usuarios(String codigo, String clave, String apellido, String nombre, char estado, char tipo, String email, String fecCre, String usuCre, String fecAct, String usuAct){
        this.syc_usu_codigo     =   codigo;
        this.syc_usu_clave      =   clave;
        this.syc_usu_apellidos  =   apellido;
        this.syc_usu_nombres    =   nombre;
        this.syc_usu_estado     =   estado;
        this.syc_usu_tipo       =   tipo;
        this.syc_usu_email      =   email;
        this.syc_usu_creacion_fec   =   fecCre;
        this.syc_usu_creacion_usr   =   usuCre;
        this.syc_usu_actualiza_fec  =   fecAct;
        this.syc_usu_actualiza_usr  =   usuAct;
    }

    /**
     * @return the syc_usu_codigo
     */
    public String getSyc_usu_codigo() {
        return syc_usu_codigo;
    }

    /**
     * @param syc_usu_codigo the syc_usu_codigo to set
     */
    public void setSyc_usu_codigo(String syc_usu_codigo) {
        this.syc_usu_codigo = syc_usu_codigo;
    }

    /**
     * @return the syc_usu_clave
     */
    public String getSyc_usu_clave() {
        return syc_usu_clave;
    }

    /**
     * @param syc_usu_clave the syc_usu_clave to set
     */
    public void setSyc_usu_clave(String syc_usu_clave) {
        this.syc_usu_clave = syc_usu_clave;
    }

    /**
     * @return the syc_usu_apellidos
     */
    public String getSyc_usu_apellidos() {
        return syc_usu_apellidos;
    }

    /**
     * @param syc_usu_apellidos the syc_usu_apellidos to set
     */
    public void setSyc_usu_apellidos(String syc_usu_apellidos) {
        this.syc_usu_apellidos = syc_usu_apellidos;
    }

    /**
     * @return the syc_usu_nombres
     */
    public String getSyc_usu_nombres() {
        return syc_usu_nombres;
    }

    /**
     * @param syc_usu_nombres the syc_usu_nombres to set
     */
    public void setSyc_usu_nombres(String syc_usu_nombres) {
        this.syc_usu_nombres = syc_usu_nombres;
    }

    /**
     * @return the syc_usu_estado
     */
    public char getSyc_usu_estado() {
        return syc_usu_estado;
    }

    /**
     * @param syc_usu_estado the syc_usu_estado to set
     */
    public void setSyc_usu_estado(char syc_usu_estado) {
        this.syc_usu_estado = syc_usu_estado;
    }

    /**
     * @return the syc_usu_tipo
     */
    public char getSyc_usu_tipo() {
        return syc_usu_tipo;
    }

    /**
     * @param syc_usu_tipo the syc_usu_tipo to set
     */
    public void setSyc_usu_tipo(char syc_usu_tipo) {
        this.syc_usu_tipo = syc_usu_tipo;
    }

    /**
     * @return the syc_usu_email
     */
    public String getSyc_usu_email() {
        return syc_usu_email;
    }

    /**
     * @param syc_usu_email the syc_usu_email to set
     */
    public void setSyc_usu_email(String syc_usu_email) {
        this.syc_usu_email = syc_usu_email;
    }

    /**
     * @return the syc_usu_creacion_fec
     */
    public String getSyc_usu_creacion_fec() {
        return syc_usu_creacion_fec;
    }

    /**
     * @param syc_usu_creacion_fec the syc_usu_creacion_fec to set
     */
    public void setSyc_usu_creacion_fec(String syc_usu_creacion_fec) {
        this.syc_usu_creacion_fec = syc_usu_creacion_fec;
    }

    /**
     * @return the syc_usu_creacion_usr
     */
    public String getSyc_usu_creacion_usr() {
        return syc_usu_creacion_usr;
    }

    /**
     * @param syc_usu_creacion_usr the syc_usu_creacion_usr to set
     */
    public void setSyc_usu_creacion_usr(String syc_usu_creacion_usr) {
        this.syc_usu_creacion_usr = syc_usu_creacion_usr;
    }

    /**
     * @return the syc_usu_actualiza_fec
     */
    public String getSyc_usu_actualiza_fec() {
        return syc_usu_actualiza_fec;
    }

    /**
     * @param syc_usu_actualiza_fec the syc_usu_actualiza_fec to set
     */
    public void setSyc_usu_actualiza_fec(String syc_usu_actualiza_fec) {
        this.syc_usu_actualiza_fec = syc_usu_actualiza_fec;
    }

    /**
     * @return the syc_usu_actualiza_usr
     */
    public String getSyc_usu_actualiza_usr() {
        return syc_usu_actualiza_usr;
    }

    /**
     * @param syc_usu_actualiza_usr the syc_usu_actualiza_usr to set
     */
    public void setSyc_usu_actualiza_usr(String syc_usu_actualiza_usr) {
        this.syc_usu_actualiza_usr = syc_usu_actualiza_usr;
    }
}
