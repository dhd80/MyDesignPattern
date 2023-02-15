package Strategy;

public class CrewsControl {
    private Strategy strategy;

    public CrewsControl(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execStrategy(int a, int b) {
        return strategy.calc(a, b);
    }
}
