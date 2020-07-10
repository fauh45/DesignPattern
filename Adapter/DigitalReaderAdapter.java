package Adapter;

import java.util.ArrayList;

public class DigitalReaderAdapter extends DigitalReader {
    private AnalogStream stream;
    private Double mid;
    public DigitalReaderAdapter(Double mid, AnalogStream stream) {
        this.mid = mid;
        this.stream = stream;
    }

    private String analogToDigital() {
        ArrayList<Double> temp = this.stream.read();
        String tempString = "";

        for (Double reading : temp) {
            if (reading >= this.mid) {
                tempString += "1";
            } else {
                tempString += "0";
            }
        }

        System.out.println("Converted to : " + tempString);
        return tempString;
    }
    
    @Override
    public void read() {
        this.setReaded(this.analogToDigital());

        super.read();
    }
}