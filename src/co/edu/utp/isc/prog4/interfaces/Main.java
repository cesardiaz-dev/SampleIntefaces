/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author utp
 */
public class Main {

    public static void main(String[] args) {
        Entero e = new Entero(25);
        System.out.println(e.isEquals(new Entero(20)));
        System.out.println(e.isEquals(new Entero(25)));
        
        Linea l = new Linea(0, 0, 1, 1);
        System.out.println(l.isEquals(new Linea(1, 1, 2, 2)));
        System.out.println(l.isEquals(new Linea(0, 0, 2, 2)));
        
        Relacion r1 = new Entero(25);
        System.out.println(r1.isEquals(e));

        Relacion r2 = new Entero(25);
//        System.out.println(r2.isEquals(l));
        
        List<Relacion> lista = new ArrayList<>();
        lista.add(e);
        lista.add(l);
        lista.add(r1);
        lista.add(r2);
        
        // Recorrer la lista
        //Foreach
        for (Relacion relacion : lista) {
            System.out.println(relacion);
        }
        // Foreach Stream
        lista.forEach((relacion) -> {
            System.out.println(relacion);
        });
        // Iterator
        Iterator<Relacion> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
