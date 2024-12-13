package abstractfactory.cloudprovider;

public class AzureBlobStorage implements CloudStorage{
    @Override
    public void upload(String fileName) {
        System.out.println("Uploading file to Azure Blob Storage: " + fileName);
    }

    @Override
    public void download(String fileName) {
        System.out.println("Downloading file from Azure Blob Storage: " + fileName);
    }
}
