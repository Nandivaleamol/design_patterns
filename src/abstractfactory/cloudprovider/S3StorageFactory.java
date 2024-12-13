package abstractfactory.cloudprovider;

public class S3StorageFactory implements CloudStorageFactory{
    @Override
    public CloudStorage createStorageService() {
        return new S3Storage();
    }
}
