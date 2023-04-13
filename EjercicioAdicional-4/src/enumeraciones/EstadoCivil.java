/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author Usuario
 */
public enum EstadoCivil {
    SOLTERO(1,"Soltero"), CASADO(2,"Casado"), SEPARADO (3,"Separado"), DIVORCIADO(4,"Divorciado"), VIUDO(5,"Viudo");
    
    public int clave;
    public String descripcion;

    private EstadoCivil(int clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }
    
    

    public static EstadoCivil getCASADO() {
        return CASADO;
    }

    public static EstadoCivil getSOLTERO() {
        return SOLTERO;
    }

    public static EstadoCivil getSEPARADO() {
        return SEPARADO;
    }

    public static EstadoCivil getDIVORCIADO() {
        return DIVORCIADO;
    }

    public static EstadoCivil getVIUDO() {
        return VIUDO;
    }

    public int getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
