/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import elements.Maserati;
import interfaces.ICommand;

/**
 *
 * @author ialima
 */
public class PintarMaserati implements ICommand {

    private Maserati maserati;
    
    public PintarMaserati(Maserati maserati) {
        this.maserati = maserati;
    }
    
    @Override
    public void execute() {
        String cor = this.maserati.getColor();
        System.out.println("Maserati com cor: " + cor);
    }
    
}
