package Proxy;

public class Main {
    public static void main(String[] args) {
        String[] rowToAdd = { "Yayeet,2010", "YaGreet,2020", "YaJreey,2040" };

        ProxyDatabase proxy = new ProxyDatabase("DB.YEET.DE:69420", 2);
        for (String row : rowToAdd) {
            proxy.insertRow(row);
        }
    }
}