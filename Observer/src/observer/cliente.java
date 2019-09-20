/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observer;

/**
 *
 * @author Aluno
 */
public class cliente {
    public static void main (String args[]) {
        ArrayList<Observer> alunos = new ArrayList<Observer>();
        Aluno paulo = new Aluno();
        Aluno pedro = new Aluno();
        Aluno roger = new Aluno();
        alunos.add(paulo);
        alunos.add(pedro);
        alunos.add(roger);
        Professor sandro = new Professor(alunos, "sandro");
        Prova u1 = new Prova(new Date());
        sandro.setProvas(u1);
        sandro.setChanged();
        sandro.notifyObservers();
    }
}
