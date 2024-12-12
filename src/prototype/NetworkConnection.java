package prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ipAddress;
    private String importantData;
    private List<String> domains = new ArrayList<>();

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

    public List<String> getDomains() {
        return domains;
    }
    public void addDomain(String domain) {
        this.domains.add(domain);
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadVeryImportantData() {
        this.importantData = "Very very important data";
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.twitter.com");
        domains.add("www.linkedin.com");
        domains.add("www.instagram.com");
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ipAddress='" + ipAddress + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public NetworkConnection clone() {

        // Logic for cloning
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress(this.getIpAddress());
        networkConnection.setImportantData(this.getImportantData());

        for (String domain : domains){
            networkConnection.getDomains().add(domain);
        }

        return networkConnection;
    }
}
