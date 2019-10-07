/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author ialima
 */
public class Calculadora {
    private double valor = 0.0;
    
    public void add(double x) {
        valor += x;
    }
    
    public void multiply(double x) {
        valor *= x;
    }
    
    public double getValue(){
        return valor;
    }
}
