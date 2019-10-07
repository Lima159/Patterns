/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretos;

import interfaces.Agregador;
import interfaces.Iterator;

/**
 *
 * @author ialima
 */
public class NomeRepositorio implements Agregador {

    private String[] names = {"Italo", "Vagner", "Paulo"};
    
    @Override
    public Iterator criarIterator() {
        return new NomeIterator();
    }
        
    private class NomeIterator implements Iterator {

        private int contador;
        
        @Override
        public boolean hasNext() {
            return (contador < names.length);
        }

        @Override
        public Object next() {
            return (this.hasNext()) ? names[contador++] : null;
        }
    }
}
