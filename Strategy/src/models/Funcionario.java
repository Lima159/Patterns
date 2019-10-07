/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.CalculaImposto;

/**
 *
 * @author ialima
 */
public class Funcionario {
    private double salarioBase;
    private CalculaImposto estrategiaDeCalculo;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public Funcionario(int cargo, double salarioBase) {
        this.salarioBase = salarioBase;
        switch (cargo) {
        case 1:
            estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
            cargo = 1;
            break;
        case 2:
            estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
            cargo = 2;
            break;
        case 3:
            estrategiaDeCalculo = new CalculoImpostoVinteOuQuinze();
            cargo = 3;
            break;
        default:
            throw new RuntimeException("Cargo não encontrado :/");
        }
    }
    
    public double calcularSalarioComImposto() {
        return estrategiaDeCalculo.calculaSalarioComImposto(this);
    }
}
