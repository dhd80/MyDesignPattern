import Factory.Furniture;
import Factory.TheFactory;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        runStrategyPattern(20, 10);
        System.out.println("\n");
        runFactory();
    }

    public static void runFactory() {
        TheFactory theFactory = new TheFactory();

        Furniture stool = theFactory.getFurniture("STOOL");
        stool.build();

        Furniture table = theFactory.getFurniture("TABLE");
        table.build();
    }

    public static void runStrategyPattern(int a, int b) {
        CrewsControl crewsControl = new CrewsControl(new OpAdd());
        System.out.println("Ergebnis a+b = " + crewsControl.execStrategy(a, b));

        crewsControl = new CrewsControl(new OpSub());
        System.out.println("Ergebnis a-b = " + crewsControl.execStrategy(a, b));

        crewsControl = new CrewsControl(new OpMult());
        System.out.println("Ergebnis a*b = " + crewsControl.execStrategy(a, b));

        crewsControl = new CrewsControl(new OpDivi());
        System.out.println("Ergebnis a/b = " + crewsControl.execStrategy(a, b));
    }
}