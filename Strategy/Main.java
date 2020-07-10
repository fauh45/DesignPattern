package Strategy;

public class Main {
    public static void main(String[] args) {
        Double currentSpeed = 150.0;
        SpeedCalculator calc = new SpeedCalculator();

        calc.setCalc(new HondaNSX());
        System.out.println("Speed of NSX at " + currentSpeed + " is " + calc.calculate(currentSpeed));
        
        calc.setCalc(new Porsche911());
        System.out.println("Speed of Porsche 911 at " + currentSpeed + " is " + calc.calculate(currentSpeed));
    }
}