package Facade;

public class AddRow {
    private Database db;
    
    public AddRow(String databaseName) {
        this.db = new Database(databaseName);
    }

    public void add(String row) {
        this.db.connect();
        this.db.insertRow(row);
        this.db.disconnect();
    }

}