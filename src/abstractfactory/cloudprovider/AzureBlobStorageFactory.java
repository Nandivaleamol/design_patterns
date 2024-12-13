package abstractfactory.cloudprovider;

public class AzureBlobStorageFactory implements CloudStorageFactory{
    @Override
    public CloudStorage createStorageService() {
        return new AzureBlobStorage();
    }
}
