package factory.dbdriverexample;

public class PostgresDriver implements DatabaseDriver{
    @Override
    public void connect() {
        System.out.println("Connecting to PostgresSQL database...");
    }
}
