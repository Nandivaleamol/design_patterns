package prototype.dbconfig;

public class DatabaseConfig implements Cloneable{

    private String dbUrl;
    private String username;
    private String password;

    public DatabaseConfig(String dbUrl, String username, String password){
        this.dbUrl = dbUrl;
        this.username = username;
        this.password = password;
    }

    public void setDbUrl(String dbUrl){
        this.dbUrl = dbUrl;
    }
    public String getDbUrl(){
        return dbUrl;
    }

    @Override
    public DatabaseConfig clone(){
        try{
            return (DatabaseConfig) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("CloneNotSupportedException occurred.");
        }
    }

    @Override
    public String toString(){
        return "DatabaseConfig{" +
                "dbUrl='" + dbUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
