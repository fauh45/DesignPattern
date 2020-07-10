package Strategy;

public class Porsche911 extends Car {

    public Porsche911() {
        super("Porsche 911", 0.9);
    }

    @Override
    public Double calculateSpeed(Double realSpeed) {
        realSpeed += 10;
        return super.calculateSpeed(realSpeed);
    }

}