package Observer;

import java.util.Random;

public class Sensor {
    public SensorPublisher publisher;
    private String name;
    private Double distance;

    public Sensor(String name) {
        this.publisher = new SensorPublisher();
        this.name = name;
        this.distance = 0.0;
    }

    public void updateReading() {
        // Create random distance to simulate distance reading
        Random rand = new Random();

        this.distance = rand.nextDouble() * rand.nextInt(100);
        publisher.notify(distance);
    }

    public String getName() {
        return name;
    }

    public Double getDistance() {
        return distance;
    }
}