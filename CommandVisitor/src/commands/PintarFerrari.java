/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import elements.Ferrari;
import interfaces.ICommand;

/**
 *
 * @author ialima
 */
public class PintarFerrari implements ICommand {

    private Ferrari ferrari;
    
    public PintarFerrari(Ferrari ferrari) {
        this.ferrari = ferrari;
    }
    
    @Override
    public void execute() {
        String cor = this.ferrari.getColor();
        System.out.println("Ferrari com cor: " + cor);
    }
    
}
