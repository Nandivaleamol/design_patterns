package prototype;

public class Main {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("192.168.0.1");
        networkConnection.setImportantData("Very important data");

        networkConnection.loadVeryImportantData();

        NetworkConnection clonedNetworkConnection1 = networkConnection.clone();
        NetworkConnection clonedNetworkConnection2 = networkConnection.clone();


        networkConnection.getDomains().remove(0);

        System.out.println(networkConnection);
        System.out.println(clonedNetworkConnection1);
        System.out.println(clonedNetworkConnection2);
    }
}
