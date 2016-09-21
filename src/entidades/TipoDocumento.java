/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author CEC
 */
public class TipoDocumento {
    private String tipoDocumento;
    private String NumeroDocumento;

    public TipoDocumento(String tipoDocumento, String NumeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }
    
        public String toString() {
        return tipoDocumento;
    }
}
