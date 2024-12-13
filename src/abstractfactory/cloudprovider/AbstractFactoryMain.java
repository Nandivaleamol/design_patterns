package abstractfactory.cloudprovider;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        CloudStorageFactory factory = new S3StorageFactory();
        CloudStorage storage = factory.createStorageService();
        storage.upload("file.txt");
        storage.download("file.txt");

        factory = new AzureBlobStorageFactory();
        storage = factory.createStorageService();
        storage.upload("file.txt");
        storage.download("file.txt");
    }
}
