/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public abstract class Vuelo {
    private String Origen;
    private String Destino;
    private String Fecha;
    private int Codigo;

    public Vuelo() {
    }

    public Vuelo(String Origen, String Destino, String Fecha, int Codigo) {
        this.Origen = Origen;
        this.Destino =Destino;
        this.Fecha = Fecha;
        this.Codigo= Codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
    
    
    
    
    
}
