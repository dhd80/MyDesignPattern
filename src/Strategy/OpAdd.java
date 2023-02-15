package Strategy;

public class OpAdd implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
