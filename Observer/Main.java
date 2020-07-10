package Observer;

public class Main {
    public static void main(String[] args) {
        Sensor front = new Sensor("Front Sensor");
        Sensor rear = new Sensor("Rear Sensor");

        Motor first = new Motor("First Motor", 23.5);
        Motor second = new Motor("Second Motor", 25.5);

        front.publisher.subscribe(first);
        rear.publisher.subscribe(second);

        for (int i = 0; i < 15; i++) {
            System.out.println("Read no." + i);
            front.updateReading();
            rear.updateReading();
        }
    }
}