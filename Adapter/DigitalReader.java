package Adapter;

public class DigitalReader {
    private String bin;

    public DigitalReader() {
        this.bin = new String();
    }
    
    public void setReaded(String bin) {
        this.bin = bin;
    }

    public void read() {
        System.out.println("Reading : " + Integer.parseInt(this.bin, 2));
    }
}