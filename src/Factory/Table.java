package Factory;

public class Table implements Furniture {
    @Override
    public void build() {
        System.out.println("Producing Table");
    }
}
