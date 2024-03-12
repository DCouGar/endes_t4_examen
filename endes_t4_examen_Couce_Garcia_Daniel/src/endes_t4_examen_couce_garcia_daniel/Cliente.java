/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endes_t4_examen_couce_garcia_daniel;


import java.util.ArrayList;
import java.util.List;
/**
 * Este clase se encarga de crear un cliente
 * @author Daniel Couce García
 * @version 1.0
 * @since 2024/03/12
 */
public class Cliente {
    /**
     * Este atributo representa el nombre del cliente
     */
    private String nombre;
    /**
     * Este atributo representa el apellido del cliente
     */
    private String apellido;
    /**
     * Este atributo representa el id del cliente
     */
    private String id;
    /**
     * Este lista representa las cuentas bancarias del cliente
     */
    private List<CuentaBancaria> cuentas;
    /**
     * Este contructor se encarga de crear un cliente dandole los parametros escritos
     * @param nombre representa el nombre del cliente
     * @param apellido representa el apellido del cliente
     * @param id representa el id del cliente
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }
    /**
     * 
     * @return Devuelve el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Estable el nombre del cliente
     * @param nombre representa el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Devuelve el apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Establece el apellido del cliente
     * @param apellido representa el apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * 
     * @return Devuelve la id del cliente
     */
    public String getId() {
        return id;
    }
    /**
     * Establece el id del cliente
     * @param id representa el id del cliente
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 
     * @return Devuelve la lista con las cuentas bancarias del cliente
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }
    /**
     * Añade una nueva cuenta bancaria a la lista del cliente
     * @param cuenta representa una cuenta bancaria del cliente
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
    /**
     * 
     * @param numeroCuenta representa el numero de identificacion de una cuenta
     * @return Devuelve la lista con la sin la cuenta que el numero de cuenta representava
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }
    /**
     * 
     * @return Imprime los valores del cliente de una manera clara y ordenada
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
