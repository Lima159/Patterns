/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import interfaces.IElement;
import interfaces.IVisitor;

/**
 *
 * @author ialima
 */
public class Maserati implements IElement {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Maserati(String color) {
        super();
        this.color = color;
    }
    
    @Override
    public void accept(IVisitor v) {
        v.visita(this);
    }
    
}
