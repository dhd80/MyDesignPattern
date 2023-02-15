package Strategy;

public class OpSub implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}
