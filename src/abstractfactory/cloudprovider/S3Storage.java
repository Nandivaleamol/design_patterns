package abstractfactory.cloudprovider;

public class S3Storage implements CloudStorage{
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading file to S3 storage: " + fileName);
    }

    @Override
    public void download(String fileName) {
        System.out.println("Downloading file from S3 storage: " + fileName);
    }
}
