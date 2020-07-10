package Adapter;

public class Main {
    public static void main(String[] args) {
        AnalogStream stream = new AnalogStream();

        DigitalReaderAdapter adapter = new DigitalReaderAdapter(0.5, stream);
        adapter.read();
    }
}