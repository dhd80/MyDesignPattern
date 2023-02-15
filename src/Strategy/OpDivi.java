package Strategy;

public class OpDivi implements Strategy {
    @Override
    public int calc(int a, int b) {
        int f=0;
        try {
            f = a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}