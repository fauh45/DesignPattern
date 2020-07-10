package Strategy;

public class SpeedCalculator {
    SpeedCalculation calc;

    public void setCalc(SpeedCalculation calc) {
        this.calc = calc;
    }

    public Double calculate(Double realSpeed) {
        return calc.calculateSpeed(realSpeed);
    }
}