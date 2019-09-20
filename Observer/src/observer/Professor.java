package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Professor extends Observable {
    protected ArrayList<Observer> turma;
    protected Prova provas;
    private String nomeProf; 
    private boolean mudou = false;

    public Prova getProvas() {
        return provas;
    }

    public void setProvas(Prova provas) {
        this.provas = provas;
    }

    public String getNomeProf() {
        return nomeProf;
    }
    
    @Override
    public boolean hasChanged() {
        return mudou;
    }
    
    @Override
    protected void setChanged(){
        mudou = true;
    }
    
    public Professor(ArrayList<Observer> turma, String nome) {
        this.turma = turma;
        this.nomeProf = nome;
    }
    
    public void attach(Observer aluno) {
        turma.add(aluno);
    }
    
    public void dettach(Observer aluno) {
        turma.remove(aluno);
    }
    
    @Override
    public void notifyObservers() {
        if(mudou) {
            for(Observer a: turma) 
                a.update(this, "A PROVA É HJ");
        }
    }
}
