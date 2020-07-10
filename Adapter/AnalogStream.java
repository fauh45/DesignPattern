package Adapter;

import java.util.ArrayList;
import java.util.Random;

public class AnalogStream {
    private ArrayList<Double> readed;

    public AnalogStream() {
        this.readed = new ArrayList<Double>();
    }

    public ArrayList<Double> read() {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            this.readed.add(rand.nextDouble());
        }

        System.out.println("Reading : " + this.readed);
        return this.readed;
    }

    public void clear() {
        this.readed.clear();
    }
}