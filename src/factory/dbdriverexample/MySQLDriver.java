package factory.dbdriverexample;

public class MySQLDriver implements DatabaseDriver{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
