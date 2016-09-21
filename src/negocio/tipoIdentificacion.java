/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author CEC
 */
public class tipoIdentificacion {
    private String codigo_catalogo;
    private String descripcion;
    private String tipo_catalogo;

    public tipoIdentificacion(){};
    public tipoIdentificacion(String codigo_catalogo, String descripcion) {
        this.codigo_catalogo = codigo_catalogo;
        this.descripcion = descripcion;
    }



    public String getCodigo_catalogo() {
        return codigo_catalogo;
    }

    public void setCodigo_catalogo(String codigo_catalogo) {
        this.codigo_catalogo = codigo_catalogo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_catalogo() {
        return tipo_catalogo;
    }

    public void setTipo_catalogo(String tipo_catalogo) {
        this.tipo_catalogo = tipo_catalogo;
    }
    
    public String toString(){
        return getDescripcion();
    }
}
