/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.interfaces;

/**
 *
 * @author utp
 */
public class Entero extends Number implements Relacion {

    /**
     * el campo valor contiene...
     */
    private final int valor;

    /*
     * Crea un objeto con el valor dado
     */
    public Entero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public boolean isGreater(Object a) {
        return getValor() > ((Entero) a).getValor();
    }

    @Override
    public boolean isLess(Object a) {
        return getValor() < ((Entero) a).getValor();
    }

    @Override
    public boolean isEquals(Object a) {
        return getValor() == ((Entero) a).getValor();
    }

    @Override
    public int intValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Entero{" + "valor=" + valor + '}';
    }


}
