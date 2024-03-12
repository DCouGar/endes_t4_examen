/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endes_t4_examen_couce_garcia_daniel;

/**
 * Este clase se encarga de crea un cuenta bancaria
 * @author Daniel Couce García
 * @version 1.0
 * @since 2024/03/12
 */
public class CuentaBancaria {
    /**
     * este atributo representa el numero de identificacion de una cuenta
     */
    private String numeroCuenta;
    /**
     * Este atributo representa el saldo almacenado en la cuenta bancaria
     */
    private double saldo;
    /**
     * Este atributo representa el cliente al que le pertence la cuenta
     */
    private Cliente propietario;
    /**
     * Este constructor se encarga de crear una cuenta bancaria dandole los parametros escritos
     * @param numeroCuenta representa el numero de identificacion de una cuenta
     * @param saldo representa el saldo almacenado en la cuenta bancaria
     * @param propietario representa el cliente al que le pertence la cuenta
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    /**
     * 
     * @return Devuelve el numero de identificaion de la cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Establece el numero de idetificacion de la cuenta
     * @param numeroCuenta representa el numero de identificacion de una cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * 
     * @return Devuelve el saldo almacenado en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo almacenado en la cuenta
     * @param saldo representa el saldo almacenado en la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * 
     * @return Devuelve el nombre del propietario de la cuenta
     */
    public Cliente getPropietario() {
        return propietario;
    }
    /**
     * Establece el nombre del propietario de la cuenta
     * @param propietario representa el cliente al que le pertence la cuenta
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    /**
     * Este metodo añade una cantidad de dinero al saldo de la cuenta
     * @param cantidad representa el dinero que se le añadira al saldo de la cuenta
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    /**
     * Este metodo elimina una cantidad de dinero al saldo de la cuenta
     * @param cantidad representa el dinero que se le retirara del saldo de la cuenta
     * @return si la cantidad es mayor que el saldo de la cuenta devuelve false. Si la cantidad es menor o igual retirara el dinero del saldo y devolvera true
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
    /**
     * 
     * @return Imprime los valores de la cuenta bancaria de una manera clara y ordenada
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}
