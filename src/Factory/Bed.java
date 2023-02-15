package Factory;

public class Bed implements Furniture{
    @Override
    public void build() {
        System.out.println("Producing Bed");
    }
}
