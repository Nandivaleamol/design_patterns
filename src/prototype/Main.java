package prototype;

public class Main {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("192.168.0.1");
        networkConnection.setImportantData("Very important data");

        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        NetworkConnection clonedNetworkConnection1 = networkConnection.clone();
        System.out.println(clonedNetworkConnection1);

        NetworkConnection clonedNetworkConnection2 = networkConnection.clone();
        System.out.println(clonedNetworkConnection2);
    }
}
