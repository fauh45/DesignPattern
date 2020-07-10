package Strategy;

public class Car implements SpeedCalculation {
    protected String name;
    protected Double speedFactor;

    public Car(String name, Double speedFactor) {
        this.name = name;
        this.speedFactor = speedFactor;
    }

    @Override
    public Double calculateSpeed(Double realSpeed) {
        return this.speedFactor * realSpeed;
    }

}