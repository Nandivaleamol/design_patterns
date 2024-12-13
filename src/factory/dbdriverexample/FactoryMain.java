package factory.dbdriverexample;

public class FactoryMain {
    public static void main(String[] args) {
        DatabaseDriver driver = DatabaseDriverFactory.getDriver("MYSQL");

        driver.connect();

        DatabaseDriver driver2 = DatabaseDriverFactory.getDriver("POSTGRES");
        driver2.connect();

    }
}
