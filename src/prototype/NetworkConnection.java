package prototype;

public class NetworkConnection implements Cloneable{
    private String ipAddress;
    private String importantData;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() {
        this.importantData = "Very very important data";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ipAddress='" + ipAddress + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    @Override
    public NetworkConnection clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (NetworkConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
