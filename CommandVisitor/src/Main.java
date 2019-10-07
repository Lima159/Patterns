import commands.PintarFerrari;
import commands.PintarMaserati;
import elements.Ferrari;
import elements.Maserati;
import interfaces.IElement;
import java.util.ArrayList;
import java.util.List;
import visitors.CarsPaintVisitor;


public class Main {
    public static void main(String[] args) {
        IElement car1 = new Ferrari("red");
        IElement car2 = new Maserati("green");
        IElement car3 = new Ferrari("blue");
        
        List<IElement> cars = new ArrayList<IElement>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        
        CarsPaintVisitor car = new CarsPaintVisitor();
        car.addCommand(car1.getClass().getName(), new PintarFerrari((Ferrari) car1));
        car.addCommand(car2.getClass().getName(), new PintarMaserati((Maserati) car2));
        car.addCommand(car3.getClass().getName(), new PintarFerrari((Ferrari) car3));
        
        for(IElement e: cars)
            e.accept(car);
    }
}
