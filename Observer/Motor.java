package Observer;

public class Motor implements SensorListener {
    private String name;
    private Double threshold;

    public Motor(String name, Double threshold) {
        this.name = name;
        this.threshold = threshold;
    }

    private void moves(Double distance) {
        if (distance > this.getThreshold()) {
            System.out.println("Moving " + this.getName() + " because sensor got : " + distance);
        }
    }

    public Double getThreshold() {
        return threshold;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Double distance) {
        this.moves(distance);
    }
}