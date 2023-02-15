package Factory;

public class TheFactory {
    public Furniture getFurniture(String FurnitureType) {
        if (FurnitureType == null) {
            return null;
        }
        if (FurnitureType.equalsIgnoreCase("Stool")) {
            return new Stool();

        } else if (FurnitureType.equalsIgnoreCase("Table")) {
            return new Table();

        } else if (FurnitureType.equalsIgnoreCase("Bed")) {
            return new Bed();
        }

        return null;
    }
}
