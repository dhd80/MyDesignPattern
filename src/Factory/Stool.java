package Factory;

public class Stool implements Furniture {
    @Override
    public void build() {
        System.out.println("Producing Stool");
    }
}
