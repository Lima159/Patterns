import concretos.NomeRepositorio;
import interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        NomeRepositorio nomeRepositorio = new NomeRepositorio();
        
        for (Iterator i = nomeRepositorio.criarIterator(); i.hasNext();) {
            String name = (String) i.next();
            System.out.println("Name: " + name);
        }
    }
}
