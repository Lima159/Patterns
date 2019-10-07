/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitors;

import interfaces.ICommand;
import interfaces.IVisitor;
import java.util.HashMap;

/**
 *
 * @author ialima
 */
public class CarsPaintVisitor implements IVisitor {

    private HashMap<String, ICommand> commands = new HashMap<>();
    
    @Override
    public void visita(Object o) {
        try {
            if(commands.containsKey(o.getClass().getName())) {
                ICommand command = commands.get(o.getClass().getName());
                command.execute();
            }
        } catch (Exception e) {
            System.err.println("Nao ha comando para esse objeto");
        }
    }
    
    public void addCommand(String objeto, ICommand command) {
        if(objeto != null && command != null)
            commands.put(objeto, command);
    }
    
    public void removeCommand(String objeto) {
        if(objeto != null)
            commands.remove(objeto);
    }
}
    
    
