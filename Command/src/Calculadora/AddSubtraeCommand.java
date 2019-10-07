/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import interfaces.ICommand;

/**
 *
 * @author ialima
 */
public class AddSubtraeCommand implements ICommand {

    public AddSubtraeCommand(Calculadora receiver, double parametro) {
        this.receiver = receiver;
        this.parametro = parametro;
    }
    
    private Calculadora receiver;
    private double parametro;
    
    @Override
    public void redo() {
        receiver.add(parametro);
    }

    @Override
    public void undo() {
        receiver.add(-parametro);
    }
    
}
