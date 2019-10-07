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
public class CalculoImpostoVinteOuQuinze implements CalculaImposto{

    @Override
    public double calculaSalarioComImposto(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 4000) {
            return funcionario.getSalarioBase() * 0.75;
        }
        return funcionario.getSalarioBase() * 0.8;
    }
    
}
