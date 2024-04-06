/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author harum
 */
public class NodoSE<T> {
    private Cuenta cuenta;
    private Solicitud solicitud;
    private NodoSE<T> siguiente;

    // constructores


    public NodoSE(Cuenta cuenta) {
        this.cuenta = cuenta;
        this.siguiente=null;
    }
    public NodoSE(Solicitud solicitud) {
        this.solicitud = solicitud;
        this.siguiente=null;
    }
    public NodoSE(Cuenta cuenta,NodoSE<T> pSiguiente) {
        this.cuenta = cuenta;
        this.siguiente=pSiguiente;
    }
    public NodoSE(Solicitud solicitud,NodoSE<T> pSiguiente) {
        this.solicitud = solicitud;
        this.siguiente=pSiguiente;
    }


    //get/set

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public NodoSE <T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoSE<T> pSiguiente){
        siguiente = pSiguiente;
    }
}
