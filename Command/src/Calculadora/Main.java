package Calculadora;

import interfaces.ICommand;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ialima
 */
public class Main {
    public static void main(String args[]) {
        Calculadora calculadora = new Calculadora();
        ArrayList<ICommand> commands = new ArrayList<ICommand>();
        double parametro = 0.0;
        int position = 0;
        int option;
        
        do {
            System.out.println("Valor atual: " + calculadora.getValue());
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("");
            System.out.println("8 - undo");
            System.out.println("9 - redo");
            System.out.println("");
            System.out.println("0 - sair");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            
            if(option >= 1 && option <= 4) {
                System.out.print("Parametro: ");
                parametro = sc.nextDouble();
                int size = commands.size();
                for(int i = position; i < size; i++) {
                    commands.remove(position); //remove 1 do elemento, ex: se position=9, entao a nova posicao sera 8
                }
                position++;
            }
            
            ICommand command = null;
            
            switch(option) {
                case 1: command = new AddSubtraeCommand(calculadora, parametro);
                    command.redo();
                    commands.add(command);
                    break;
                case 2: command = new AddSubtraeCommand(calculadora, -parametro);
                    command.redo();
                    commands.add(command);
                    break;
                case 3: command = new MultiplicaDivideCommand(calculadora, parametro);
                    command.redo();
                    commands.add(command);
                    break;
                case 4: command = new MultiplicaDivideCommand(calculadora, 1.0/parametro);
                    break;
                case 8: if(position > 0) {
                            commands.get(--position).undo();
                        }
                        else
                            System.out.println("Não é possivel fazer undo");
                    break;
                case 9: if(position < commands.size()) {
                            commands.get(position++).redo();
                        }
                        else
                            System.out.println("Não é possivel fazer redo");
                    break;
            }
            System.out.println("Histórico. Tamanho = " + commands.size());
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(commands.get(i));
            }
        } while (option != 0);
        
    }
}
