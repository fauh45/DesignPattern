package Strategy;

public class HondaNSX extends Car {

    public HondaNSX() {
        super("Honda NSX", 0.7);
    }

    @Override
    public Double calculateSpeed(Double realSpeed) {
        realSpeed += 30;
        return super.calculateSpeed(realSpeed);
    }
}