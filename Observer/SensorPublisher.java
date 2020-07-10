package Observer;

import java.util.ArrayList;

/**
 * SensorPublisher
 */
public class SensorPublisher {
    ArrayList<SensorListener> listener;

    public SensorPublisher() {
        this.listener = new ArrayList<SensorListener>();
    }

    public void notify(Double distance) {
        for (SensorListener sensorListener : listener) {
            sensorListener.update(distance);
        }
    }

    public void subscribe(SensorListener listener) {
        this.listener.add(listener);
    }

    public void unsubscribe(SensorListener listener) {
        this.listener.remove(listener);
    }
}